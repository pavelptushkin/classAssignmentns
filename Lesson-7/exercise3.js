var woolOwners = [
    {
        "master": 1
    },
    {
        "dame": 1
    },
    {
      "littleBoy": 1,
      "location": "down the lane"
    }
  ];
  
  
  var bags;
  var haveYouAnyWool = function() {
      for (var i = 0; i < woolOwners.length; i++) {
      bags += i;
      }
      return bags;
  };
  haveYouAnyWool();
  
  
  function baabaaBlackSheep() {
      console.log("BaaBaa BlackSheep have you any wool?");
      if (bags > 0) {
          console.log("yes sir, yes sir " + totalBags + " bags full");
    }
  }
  
  function oneForMy() {
      for (var i = 0; i < 2; i++) {
          people = Object.keys(woolOwners);
          var person = people.toString();
          console.log("one for my " + person);
      }
  }
  
  baabaaBlackSheep();
  oneForMy();
  
  var boy = Object.keys(woolOwners[2]);
  var littleBoy = boy[2];
  
  var whereHeLives = woolOwners.location;
  console.log("one for the " + woolOwners.littleBoy + " that lives " + whereHeLives);