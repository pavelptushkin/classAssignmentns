// prompt("enter temperature");
// var temp = 80;
// var precip = false;
// var indoor = true;
// var weather;
// if (precip == true) {
//     weather = "Raining";
// }
// else {
//     weather = "Clear sky";
// }

// console.log("The temperature is " + temp + " degrees and it is " + weather);
// if (temp > 80 && precip == false) {
//     console.log("Time to swim");
// }else if (indoor == true){
//     console.log("Time to swim");
// }else{
//     console.log("Stay indoor");
// }

// challenge 3

// for (i = 99; i >= 0; i--) {
//     if (i <= 99 && i != 0) {
//         console.log(i + " bottles of root beer on the wall");
//     }
//     else if (i ==0){
//         console.log("Hey we need more rootbeer");
//     }
// }

// var i = 99;

// while (i > 0)
// {
//     console.log(i + " bottles of root beer on the wall");
//     i--;
// }

// let x = 2;

// switch (x) {
//     case 2:
//         console.log("2")
//     case 3:
//         console.log("2")
//         break;
//     default:
//         break;
// }

// for (i = 0; i <= 100; i++)
// {
//     if (i % 3 === 0 && i % 5 ===0){
//         console.log("whatup");
//     }
//     else if (i % 5 ===0){
//         console.log("up");
//     }
//     else if (i % 3 ===0){
//         console.log("what")
//     }
//     else {
//         console.log(i)
//     }

// }

// for (i = 0; i <= 100; i++)
// {
//     var result = (i%3 ===0 && i%5===0 && i!=0) ? ('whatup') : (i % 5 ===0 && i!=0) ? ('up'): (i%3===0 && i!=0) ? 'what': i;
//     console.log(result); 
// }

myVar = "b";
switch (myVar) {
    case "a":
    console.log("Hey");
break
    case "b":
console.log("Foo");
    case "c":
console.log("Bar");
}

var weapons = ["rock", "paper", "scissors"];
var weaponOfChoice = weapons[Math.floor(Math.random() * weapons.length)];
var pl1 = "John";
var pl1wins = 0;
var pl1weap = 0;
var pl2 = "Jane";
var pl2wins = 0;
var pl2weap = 0;

// if (pl1wins == 3 || pl2wins == 3 || pl3wins ==3 ){
// }

while (pl1wins < 3 && pl2wins < 3){
    var weaponOfChoice = weapons[Math.floor(Math.random() * weapons.length)];
    console.log(pl1 + " chose " + weaponOfChoice);
    pl1weap = weapons.indexOf(weaponOfChoice);
    var weaponOfChoice = weapons[Math.floor(Math.random() * weapons.length)];
    console.log(pl2 + " chose " + weaponOfChoice);
    pl2weap = weapons.indexOf(weaponOfChoice);
    if (pl1weap == 0 && pl2weap == 2){
        pl1wins++;
        console.log(pl1 + " Wins");
        console.log(pl1 + " has won " + pl1wins + " times" );
        continue;
    }
    else if (pl1weap == 0 && pl2weap == 1){
        pl2wins++;
        console.log(pl2 + " Wins");
        console.log(pl2 + " has won " + pl2wins + " times" );
        continue;
    }
    else if (pl1weap == pl2weap){
        console.log("Its a Tie");
        continue;
    }
    else if (pl1weap == 1 && pl2weap == 0){
        pl1wins++;
        console.log(pl1 + " Wins");
        console.log(pl1 + " has won " + pl1wins + " times" );
        continue;
    }
    else if (pl1weap == 1 && pl2weap == 2){
        pl2wins++;
        console.log(pl2 + " Wins");
        console.log(pl2 + " has won " + pl2wins + " times" );
        continue;
    }
    else if (pl1weap == 2 && pl2weap == 0){
        pl2wins++;
        console.log(pl2 + " Wins");
        console.log(pl2 + " has won " + pl2wins + " times" );
        continue;
    }
    else if (pl1weap == 2 && pl2weap ==1){
        pl1wins++;
        console.log(pl1 + " Wins");
        console.log(pl1 + " has won " + pl1wins + " times" );
        continue;
    }
}
