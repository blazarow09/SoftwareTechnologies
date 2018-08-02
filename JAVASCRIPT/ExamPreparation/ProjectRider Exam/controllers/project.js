const Project = require('../models').Project;

module.exports = {
    index: (req, res) => {
        Project.findAll().then(projects => {
            res.render("project/index", {"projects": projects});
        })
    },
    createGet: (req, res) => {
        res.render("project/create");
    },
    createPost: (req, res) => {
        let body = req.body.project;

        Project.create(body).then(project => {
            res.redirect("/");
        }).catch(err => {
            console.log(err.message);
        })
    },
    editGet: (req, res) => {
       let id = req.params.id;

       Project.findById(id).then(project => {
           res.render("project/edit", {"project": project})
       }).catch(err => {
           console.log(err.message);
       })
    },

    editPost: (req, res) => {
        let id = req.params.id;
        let body = req.body.project;

        console.log(body);

        Project.findById(id).then(project => {
            project.updateAttributes(body).then(() => {
                res.redirect("/");
            })
        })
    },

    deleteGet: (req, res) => {
        let id = req.params.id;

        Project.findById(id).then(project => {
            res.render("project/delete", {"project": project})
        }).catch(err => {
            console.log(err.message);
        })
    },
    deletePost: (req, res) => {
        let id = req.params.id;

        Project.findById(id).then(project => {
            project.destroy().then(() => {
                res.redirect("/");
            })
        })
    }
};