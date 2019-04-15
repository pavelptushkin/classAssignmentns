fetch('https://jsonplaceholder.typicode.com/posts/' + new URLSearchParams(window.location.search).get('id'))
    .then(response => response.json())
    .then(json => {
        $('#title').text(json.title);
        $('#text').html(json.body.replace("\\n", "<br>"));
    })

fetch('https://jsonplaceholder.typicode.com/comments?postId=' + new URLSearchParams(window.location.search).get('id'))
    .then(response => response.json())
    .then(json => {
        json.forEach(el => {
            $('#comments').append(`<li>${el.name}<p>${el.body}</p></li>`);
        });
    })
