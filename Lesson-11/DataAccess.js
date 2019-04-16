var request = require("request-promise");


const dataAccess = {
    getPost(postId) {
        request('http://jsonplaceholder.typicode.com/posts/1')
        .then(function (htmlString) {
            console.log(htmlString)
        })
    }
}

module.exports = dataAccess;
