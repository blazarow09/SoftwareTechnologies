const Product = require('../models').Product;

module.exports = {
	index: (req, res) => {
        Product.findAll().then(products => {
            res.render("product/index", {"products": products});

            console.log(products);
        })
	},

	createGet: (req, res) => {
        res.render("product/create")
	},

	createPost: (req, res) => {
        let body = req.body;

        Product.create(body).then(product => {
            res.redirect("/");
        }).catch(err => {
            console.log(err.message);
        })
	},

	editGet: (req, res) => {
	    let id = req.params.id;

	    Product.findById(id).then(project => {
	        res.render("product/edit", {"products": products});
        }).catch(err => {
            console.log(err.message);
        })
	},

	editPost: (req, res) => {
        let id = req.params.threadId;
        let body = req.body;

        Product.findById(id).then(product => {
            product.updateAttributes(body).then(() => {
                res.redirect("/");
            })
        })
	}
};