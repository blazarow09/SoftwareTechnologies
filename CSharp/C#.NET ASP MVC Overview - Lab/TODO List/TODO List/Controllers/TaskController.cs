using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using TODOList.Models;

namespace TODO_List.Controllers
{
    public class TaskController : Controller
    {
        [HttpPost]
        public IActionResult Create(Task task)
        {
            if (task == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {
                db.Tasks.Add(task);
                db.SaveChanges();
            }

            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {
                var task = db.Tasks.Find(id);

                if (task == null)
                {
                    return RedirectToAction("Index", "Home");
                }

                db.Tasks.Remove(task);
                db.SaveChanges();
            }

            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public ActionResult Edit(int? id)
        {

            if (id == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {
                var task = db.Tasks.Find(id);



                if (task == null)
                {
                    return RedirectToAction("Index", "Home");
                }

                return View(task);

            }

        }

        [HttpPost]
        public ActionResult Edit(Task task)
        {
            using (var db = new TaskDbContext())
            {
                if (ModelState.IsValid)
                {
                    db.Entry(task).State = EntityState.Modified;
                    db.SaveChanges();
                }

                return RedirectToAction("Index", "Home");
            }
        }


        [HttpGet]
        public ActionResult Details(int? id)
        {
            using (var db = new TaskDbContext())
            {
                var task = db.Tasks.Find(id);

                var movie = task;

                return View(movie);
                    
            }

        }
    }
}