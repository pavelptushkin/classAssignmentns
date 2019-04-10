var list = document.querySelector('ul');
var inputBox = document.querySelector('#text');
function addItem(){
    item = document.createElement('li');
    item.textContent = inputBox.value;
    list.appendChild(item);
    inputBox.value = "";
}
document.querySelector('ul').addEventListener("click", f => {
    if (f.target.tagName == "LI")
    {
        f.target.style.textDecoration ="line-through";
        setTimeout(() => {f.target.remove()}, 1000);
    }
})