fetch('https://jsonplaceholder.typicode.com/users')
  .then(response => response.json())
  .then(json => {
        var name1 = prompt("What is your User Name?")
        var u = json.filter(el => el.username === name1)
        while (u.length == 0)
        {
            alert("Invalid User Name")
            name1 = prompt("What is your User Name?")
            u = json.filter(el => el.username === name1)
        }
        sessionStorage.setItem("user", JSON.stringify(u[0]));
         window.location.href = "homepage.html"       
})