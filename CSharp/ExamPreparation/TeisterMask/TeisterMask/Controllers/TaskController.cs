namespace TeisterMask.Controllers
{
    using Microsoft.AspNetCore.Mvc;
    using Models;
    using System.Collections.Generic;
    using System.Linq;

    public class TaskController : Controller
    {
        private readonly TeisterMaskDbContext dbContext;

        public TaskController(TeisterMaskDbContext dbContext)
        {
            this.dbContext = dbContext;
        }

        [HttpGet]
        [Route("")]
        public IActionResult Index()
        {
            List<Task> tasks = this.dbContext.Tasks.ToList();

            return View(tasks);
        }

        [HttpGet]
        [Route("/create")]
        public IActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Route("/create")]
        [ValidateAntiForgeryToken]
        public IActionResult Create(Task task)
        {
           if (ModelState.IsValid)
            {
                this.dbContext.Tasks.Add(task);
                this.dbContext.SaveChanges();

                return Redirect("/");
            }

            return View();

        }

        [HttpGet]
        [Route("/edit/{id}")]
        public IActionResult Edit(int id)
        {
            var task = this.dbContext.Tasks.Find(id);

            return View(task);
        }

        [HttpPost]
        [Route("/edit/{id}")]
        [ValidateAntiForgeryToken]
        public IActionResult EditConfirm(Task taskModel)
        {
            if (ModelState.IsValid)
            {
                this.dbContext.Update(taskModel);
                this.dbContext.SaveChanges();

                return Redirect("/");
            }

            return View(taskModel);
        }
    }
}
