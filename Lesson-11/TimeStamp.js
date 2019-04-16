var moment = require("moment");
module.exports = {getTime: () => console.log(moment().format("h:mm:ss a"))};