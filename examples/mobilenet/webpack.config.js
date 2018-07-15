
const config = require("./scalajs.webpack.config");
const HtmlWebpackPlugin = require("html-webpack-plugin");
const CopyWebpackPlugin = require("copy-webpack-plugin");

const path = require("path");
const rootDir = path.resolve(__dirname, "../../../../");
const resourcesDir = path.resolve(rootDir, "src/main/resources");

module.exports = config;

module.exports.resolve = {
    alias: {
        resources: resourcesDir
    }
};

module.exports.plugins = [
    new HtmlWebpackPlugin({
        template: path.resolve(rootDir, 'index.html')
    }),
    new CopyWebpackPlugin([ { from: resourcesDir, to: "assets" } ]),
];