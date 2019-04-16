var data = require("./DataAccess");
var time = require("./TimeStamp");

// setInterval(() => { request('http://jsonplaceholder.typicode.com/posts/1')
// .then(function (htmlString) {
//     console.log(htmlString)
//     console.log(moment().format("h:mm:ss a"));
// })
// .catch(function (err) {
//     console.log("Error")
// });

    
// }, 3000);

setInterval(() => {
    data.getPost(1);
    time.getTime();    
}, 3000);

