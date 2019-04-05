// Create a function that returns the sum of the two lowest positive numbers given an array of minimum 4 integers. No floats or empty arrays will be passed.

// For example, when an array is passed like [19, 5, 42, 2, 77], the output should be 7.

// [10, 343445353, 3453445, 3453545353453] should return 3453455.

// var arrayTest = [19,5,42,2,77];

// function smallestSum(arrayTest)
// {

// }
var arr = [19, 5, 42, 2, 77, -12];
var ar1= [4,7,9,6,19,99];
var ar2= [10, 343445353, 3453445, 3453545353453];
var ar3= [99,145,235,66];
//var min = Math.min.apply(Math, arr)
//var pos;
//console.log(min)
// var arr = [19, 5, 42, 2, 77];
function minSum(nums){
    pos = nums.filter(function(x){ return x >= 0 });
    var min1 = Math.min.apply(Math, pos);
    pos.splice(pos.indexOf(min1), 1);
    var min2 = Math.min.apply(Math, pos);
    return console.log(min1 + min2);
}
minSum(arr);
minSum(arr);
minSum(ar1);
minSum(ar2);
minSum(ar3);