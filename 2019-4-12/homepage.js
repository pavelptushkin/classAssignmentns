var user = JSON.parse(sessionStorage.getItem("user"));
const h1 = $('<h1>');
h1.html(user.name + " Home Page");
$('div#homePage').append(h1);
const h2 = $('<h2>')
h2.html("Posts");
$('div#homePage').append(h2);
fetch('https://jsonplaceholder.typicode.com/posts?userId='+user.id)
.then(response => response.json())
  .then(json => {
          for (var i = 0; i < json.length; i++)
          {
                $('div#homePage').append(`<li><a href="post.html?id=${json[i].id}">${json[i].title}</a></li>`);
          }
  })
  var album = $('<h2>')
  album.html("Albums");
  $('#albums').append(album);

  fetch('https://jsonplaceholder.typicode.com/albums?userId='+user.id)
.then(response => response.json())
  .then(json => {
          for (var j = 0; j < json.length; j++)
          {
                $('#albums').append(`<li><a href="album.html?id=${json[j].id}">${json[j].title}</a></li>`);
          }
  })