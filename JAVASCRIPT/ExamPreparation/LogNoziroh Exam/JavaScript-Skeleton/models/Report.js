const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    const Report = sequelize.define("Report", {

        status: {
    type: Sequelize.TEXT,
            reuired: true,
            allowNull: false
        },

        message: {
            type: Sequelize.TEXT,
            reuired: true,
            allowNull: false
        },

        origin: {
            type: Sequelize.TEXT,
            reuired: true,
            allowNull: false
        }
    }, {
        timestamps:false
    });
    return Report;
};