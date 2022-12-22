'use strict';
const path = require('path')
const { defineConfig } = require('@vue/cli-service')
// https://webpack.js.org/configuration/dev-server/#devserver-proxy

const targetHost = 'localhost';
const targetPort = 8080;

const port = 3000;
// let cookie;
//
// const replaceCookie = function(cookie) {
//     return cookie
//         .replace(/\s+domain=[^\s;]+;?/, '')
//         .replace(/\s+secure;?/, '')
// };

module.exports = defineConfig({
  css: {
    loaderOptions: {
      scss: {
        additionalData: `
          @import "~@/assets/scss/style.scss";
        `
      }
    }
  },
  outputDir: path.resolve(__dirname, '../src/main/resources/static/'),
  devServer: {
    port: port,
    // clientLogLevel: 'debug',
    // historyApiFallback: true,
    // hot: true,
    // inline: true,
    headers: {
      'Access-Control-Allow-Origin': '*'
    },
    proxy: {
      '/api' : {
        target: `http://${targetHost}:${targetPort}`, //개발서버
        changeOrigin: true,
        logLevel: 'debug'
      },
      '/ws' : {
        target: `http://${targetHost}:${targetPort}`, //개발서버
        changeOrigin: true,
        ws: true,
        logLevel: 'debug'
      }
    }
  },

  pluginOptions: {
    // moment: {
    //   locales: ['ko_kr']
    // },
    quasar: {
      importStrategy: 'kebab',
      rtlSupport: false
    }
  }
});