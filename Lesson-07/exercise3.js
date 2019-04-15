var woolOwners = [
    {
        "master": 1
    },
    {
        "dame": 1
    },
    {
      "little boy": 1,
      "location": "down the lane"
    }
  ];
  
  var bags = 0;
  var haveYouAnyWool = function() {
      for (var i = 0; i < woolOwners.length; i++) {
      bags = bags + i;
      }
      return bags;
  };
  haveYouAnyWool();
  function baabaaBlackSheep() {
      console.log("BaaBaa BlackSheep have you any wool?");
      if (bags > 0) {
          console.log("yes sir, yes sir " + bags + " bags full");
    }
  }
  
  function oneForMy() {
      for (var i = 0; i < 2; i++) {
          people = Object.keys(woolOwners[i]);
          var person = people.toString();
          console.log("one for my " + person)
      }
  }
  
  baabaaBlackSheep();
  oneForMy();
  
  var boy = woolOwners[2];
  var littleBoy = Object.keys(woolOwners[2]);
  
  var whereHeLives = woolOwners.location;
  console.log("one for the " + littleBoy[0] + " that lives " + boy.location);