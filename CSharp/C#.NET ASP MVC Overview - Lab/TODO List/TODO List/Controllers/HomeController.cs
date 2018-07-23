using System.Linq;
using Microsoft.AspNetCore.Mvc;
using TODOList.Models;

namespace TODO_List.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            using (var db = new TaskDbContext())
            {
                var tasks = db.Tasks.ToList();
                
                    return View("Index", tasks);
            }
        }
        
        
    }
}
