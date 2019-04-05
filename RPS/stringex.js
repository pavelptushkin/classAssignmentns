// Examples:
// argh("abcd") -> "A-Bb-Ccc-Dddd"
// argh("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// argh("cwAt") -> "C-Ww-Aaa-Tttt"
// The parameter of argh is a string which includes only letters from a..z and A..Z
function argh(s) {
    var s1 = [];
    for (i = 0; i < s.length; i++)
    {
     s1[i] = (s.charAt(i).toUpperCase() + s.charAt(i).repeat(i));
    }
    return s1.join("-");
}
console.log(argh("RqaEzty"))