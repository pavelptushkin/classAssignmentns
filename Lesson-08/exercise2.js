var list = document.querySelector('#list');
var coffee = Array.from(list.children);
coffee[1].innerHTML = "Fair Trade Coffee";
coffee[3].remove();
var cheeseW = document.createElement('li');
cheeseW.innerHTML = "Cheese Whiz";
coffee[2].append(cheeseW);
var arr1 = ['protein powder', 'muscle milk', 'power bars']
coffee.forEach(e => e.remove());
list.innerHTML += "<li>" + "protein powder" + "</li>"
arr1.forEach(e =>{
    var item = document.createElement('li')
    item.innerHTML = e;
    list.appendChild(item)
    }
    )


