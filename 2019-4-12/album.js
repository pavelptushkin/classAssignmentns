fetch('https://jsonplaceholder.typicode.com/photos/' + new URLSearchParams(window.location.search).get('id'))
    .then(response => response.json())
    .then(json => {
        $('#title').text(json.url);
        $('#text').html(json.body.replace("\\n", "<br>"));
    })