var request = require("request-promise");


const dataAccess = {
    getPost(postId) {
        request(`http://jsonplaceholder.typicode.com/posts/${postId}`)
        .then(function (htmlString) {
            console.log(htmlString)
        })
    }
}

module.exports = dataAccess;
