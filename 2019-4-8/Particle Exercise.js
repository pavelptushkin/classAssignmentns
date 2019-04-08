var time = 0;
var gravity = 0.5;
var particles = [];
function Particle(startX, startY){
    this.x = startX;
    this.y = startY;
    this.velocity = {x: 0, y: 0};
}

Particle.prototype.getVelocity = function () {
    return time * gravity;
}

Particle.prototype.move = function () {
    if (this.y >= 500){
        return console.log("bottom");
    }
    else{
        return this.y += this.getVelocity();
    }
}

for (i = 0; i < 100; i++){
    particles[i] = new Particle(i,(Math.random()*500));
}
var line = 0;
var interval = setInterval(function(){
    time++;
    for (i = 0; i < particles.length; i++){
        console.log(particles[i].x + " Line#: " + line++ + " x: " + particles[i].x + " y: " + particles[i].y);
    }
    var newArr = particles.filter(function(p){
        return p.y <= 500;
    });
    newArr.forEach(element => element.move());
    if (newArr.length == 0){
         clearInterval(interval);
    }
},100);

