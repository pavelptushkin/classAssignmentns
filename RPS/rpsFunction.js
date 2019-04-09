var hands = ["rock", "paper", "scissors"];
function getHand ()
{
    var weapon = parseInt(Math.random()*10)%3;
    var hand;
    hand = hands[weapon];
    return hand;
}
var playerWins = 0;
var player1 = {firstName:"Jack", getHand: getHand, hand:null, wins:playerWins};
var player2 = {firstName:"Jane", getHand: getHand, hand:null, wins:playerWins};
var player3 = {firstName:"Joe", getHand: getHand, hand:null, wins:playerWins};
var player4 = {firstName:"Jill", getHand: getHand, hand:null, wins:playerWins};
function playRound(player1, player2){
    player1.hand = this.prompt("what is your hand").toLowerCase();
    player2.hand = player2.getHand();
    if (player1.hand === player2.hand)
    {
        console.log(player1.firstName + " picked " + player1.hand);
        console.log(player2.firstName + " picked " + player2.hand);
        console.log("its a tie");
    }
    else if (player1.hand === "rock" && player2.hand === "scissors" || player1.hand === "paper" && player2.hand === "rock" || player1.hand === "scissors" && player2.hand === "paper")
    {
        player1.wins++;
        console.log(player1.firstName + " picked " + player1.hand);
        console.log(player2.firstName + " picked " + player2.hand);
        console.log(player1.firstName + " picked " + player1.hand + " and has " + player1.wins + " wins");
    }
    else
    {
        player2.wins++;
        console.log(player1.firstName + " picked " + player1.hand);
        console.log(player2.firstName + " picked " + player2.hand);
        console.log(player2.firstName + " picked " + player2.hand + " and has " + player2.wins + " wins");
    }
}

function playGame (player1, player2, playUntil)
{
    while (player1.wins < playUntil && player2.wins < playUntil)
    {
        playRound(player1,player2);
    }
}

function playTournament(player1, player2, player3, player4, playUntil)
{
    var game1Winner;
    var game2Winner;
    playGame(player1, player2, playUntil);
    if (player1.wins == playUntil){
     game1Winner = player1; 
    }
     else game1Winner = player2;
    game1Winner.wins = 0;
    playGame(player3, player4, playUntil);
    if (player3.wins == playUntil)
    {
         game2Winner = player3; 
    }
    else game2Winner = player4;
    game2Winner.wins = 0;
    console.log("The final round of the Tournament is between " + game1Winner.firstName + " and " + game2Winner.firstName);
    playGame(game1Winner, game2Winner, playUntil);
    if (game1Winner.wins == playUntil) return game1Winner.firstName + " is the world champion"; else return game2Winner.firstName + " is the world champion";  
}
function myFunction(){
player1.firstName = this.prompt("what is your name").toUpperCase();
var playUntil = prompt("How many games will the computers play?")
document.querySelector('#w1').textContent = playTournament(player1,player2,player3,player4, playUntil)
document.querySelector('button').style.display = 'none';
}