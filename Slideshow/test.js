function upperCaser(input){
    return input.toUpperCase();
}

module.exports = upperCaser;

function repeat(operation, num) {
    if (num <= 0) return operation;
    return repeat(operation, --num);
}

module.exports = repeat;

function doubleAll(numbers) {
    return numbers.map(function(num){
        return num * 2;
    });
  }

  module.exports = doubleAll

function getShortMessages(messages) {
   return messages.filter(function(item){
       return item.message.length < 50;
   }).map(function(item){
       return item.message;
   })
}

module.exports = getShortMessages

function checkUsersValid(goodUsers) {
    return function allUsersValid(submittedUsers) {
        return submittedUsers.every(function(submittedUsers){
            return goodUsers.some(function(goodUsers){
                return goodUsers.id === submittedUsers.id
            })
        })
    };
  }
 module.exports = checkUsersValid;

function countWords(inputWords) {
   return inputWords.reduce(function(countMap, word){
       countMap[word] = ++countMap[word] || 1;
       return countMap;
   }, {})
}

 module.exports = countWords;

 var arr = ['a', 'b', 'c', 'd', 'e'];
// var eArr = arr[Symbol.iterator]();
// your browser must support for..of loop
// and let-scoped variables in for loops
// const and var could also be used
for (let letter of arr) {
  console.log(letter);
}