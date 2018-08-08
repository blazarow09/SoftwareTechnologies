﻿namespace CatShop.Controllers
{
    using Microsoft.AspNetCore.Mvc;
    using CatShop.Models;
    using System.Linq;
    using System.Collections.Generic;

    public class CatController : Controller
    {
        private readonly CatDbContext context;

        public CatController(CatDbContext context)
        {
            this.context = context;
        }

        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            List<Cat> cats = this.context.Cats.ToList();

            return View(cats);
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {

            return View();
        }

        [HttpPost]
        [Route("create")]
        public ActionResult Create(Cat cat)
        {
            if (ModelState.IsValid)
            {
                this.context.Cats.Add(cat);
                this.context.SaveChanges();

                return Redirect("/");
            }
            return View();
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int id)
        {
            var cat = this.context.Cats.Find(id);

            return View(cat);
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int id, Cat catModel)
        {
            if (ModelState.IsValid)
            {
                this.context.Cats.Update(catModel);
                this.context.SaveChanges();

                return Redirect("/");
            }
            return View(catModel);
        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int id)
        {
            var cat = this.context.Cats.Find(id);

            return View(cat);
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int id, Cat catModel)
        {
            this.context.Cats.Remove(catModel);
            this.context.SaveChanges();

            return Redirect("/");
        }
    }
}
