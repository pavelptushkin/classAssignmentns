const input = document. querySelector("input")
const exmaple = document.querySelector("#example")

const network = new brain.NeuralNetwork();


network.train([
    {input:{r: 0.65, g: 0.65, b: 0.65}, output:{light: 1}},
    {input:{r: 0.65, g: 0.65, b: 0.65}, output:{light: 1}},
    {input:{r: 0.65, g: 0.65, b: 0.65}, output:{light: 1}},
    {input:{r: 0.3, g: 0.3, b: 0.3}, output:{dark: 0}},
    {input:{r: 0.3, g: 0.3, b: 0.3}, output:{dark: 0}},
    {input:{r: 0.3, g: 0.3, b: 0.3}, output:{dark: 0}},
    {input:{r: 0.3, g: 0.3, b: 0.3}, output:{dark: 0}},
]);


  //brain.js and getRGB helper function
  function getRgb(hex) {
    var shorthandRegex = /^#?([a-f\d])([a-f\d])([a-f\d])$/i;
    hex = hex.replace(shorthandRegex, function(m, r, g, b) {
        return r + r + g + g + b + b;
    });
  
    var result = /^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i.exec(hex);
    return result ? {
        r: Math.round(parseInt(result[1], 16) / 2.55) / 100,
        g: Math.round(parseInt(result[2], 16) / 2.55) / 100,
        b: Math.round(parseInt(result[3], 16) / 2.55) / 100,
    } : null;
  }

  var rgb = getRgb();
  const result = brain.likely({rgb, network})
  exmaple.style.background = e.target.value



console.log(result);


$('#example').addEventListener('click', () => background = blue)