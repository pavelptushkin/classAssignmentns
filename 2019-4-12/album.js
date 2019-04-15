fetch('https://jsonplaceholder.typicode.com/photos?albumId=' + new URLSearchParams(window.location.search).get('id'))
    .then(response => response.json())
    .then(json => {
        json.forEach(el => {
            $('#pics').append(`<li>${el.title}<br><img src="${el.thumbnailUrl}"/></li>`);
        });
    })
