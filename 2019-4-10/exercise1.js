const selectedItem = document.querySelector('header')
const selectedSec = document.querySelector('.col').children
const secCurr = document.querySelector('.current');
const nextSec = secCurr.nextElementSibling;
const prevSec = secCurr.previousElementSibling.children[0];
const h2high = document.querySelector('.highlight').parentElement.parentElement;
const allh2 = Array.from(document.querySelectorAll('section')).filter(elm => elm.querySelector('h2') != null);


console.log(selectedItem);
console.log(selectedSec);
console.log(secCurr);
console.log(nextSec);
console.log(prevSec);
console.log(h2high);
console.log(allh2);