const Project = require('../models').Project;

module.exports = {
    index: (req, res) => {
        Project.findAll().then(projects => {
            res.render('project/index', {'projects':projects})
        }
    );

   `` },
    createGet: (req, res) => {
        res.render('project/create')
    },
    createPost: (req, res) => {
        let arg = req.body.project;
        Project.create(arg).then(() =>{
            return res.redirect('/');
        })
    },
    editGet: (req, res) => {
       let id = req.params.id;
       Project.findById(id).then(project => {
           res.render('project/edit', {'project': project});
       })
    },

    editPost: (req, res) => {
        let id = req.params.id;
        let args = req.body.project;
        Project.findById(id).then(project => {
            project.updateAttributes(args).then(() => {
                res.redirect('/');
            });
        })
    },
    deleteGet: (req, res) => {
        let id = req.params.id;
        Project.findById(id).then(project => {
            res.render('project/delete', {'project': project});
        })
    },
    deletePost: (req, res) => {
        let id = req.params.id;
        let args = req.body.project;
        Project.findById(id).then(project => {
            project.destroy(args).then(() => {
                res.redirect('/');
            });
        })
    }
};