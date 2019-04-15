var beenClicked = [false, false, false, false, false, false, false, false, false];
var posts = [
    {url: "http://jsonplaceholder.typicode.com/posts", method: "GET"},
    {url: "http://jsonplaceholder.typicode.com/posts/10", method: "GET"},
    {url: "http://jsonplaceholder.typicode.com/posts/12/comments", method: "GET"},
    {url: "http://jsonplaceholder.typicode.com/posts?userId=2", method: "GET"},
    {
    url: "http://jsonplaceholder.typicode.com/posts", 
    method: "POST",
    data: {title: "this", body: "lorem ipsum", id: "999"},
    complete: run => console.log(`Post id ${run.responseJSON.id}`)
    },
    {url: "http://jsonplaceholder.typicode.com/posts/12", method: "PUT", data: {title: "this", body: "lorem ipsum", userId:"hacked"}, complete: res => console.log(res.responseJSON)},
    {url: "http://jsonplaceholder.typicode.com/posts/12", method: "PATCH", data: {title: "this"}, complete: res => console.log(res.responseJSON)},
    {url: "http://jsonplaceholder.typicode.com/posts/12", method: "DELETE", complete: () => console.log("Hacked and Deleted")},
    {url: "http://jsonplaceholder.typicode.com/posts", method: "GET", success: function (post){
        post.forEach(function(post){
            const li = $('<li>');
            li.html("Post Title: " + post.title + "<br />" + "Post Body: " + post.body + "<br />" + "User Id: " + post.postId + "<br />" + "Id: " + post.id);
            $('ul#noHide').append(li);
        });
    }
    }
]

// $('button').click(e => $.ajax(posts[e.target.id.replace('Part', '') - 1]));
$('button').click(e => {
    $.ajax(posts[e.target.id.replace('Part', '') - 1])
    $(e.target).off('click').click(function(e){
        if (beenClicked[e.target.id.replace('Part', '') - 1] === false){
            $(e.target).siblings('ul').show();
            beenClicked[e.target.id.replace('Part', '') - 1] = true;
        }
        else {
            $(e.target).siblings('ul').hide();
            beenClicked[e.target.id.replace('Part', '') - 1] = false;
        }
    });
    beenClicked[e.target.id.replace('Part', '') - 1] = false;
});