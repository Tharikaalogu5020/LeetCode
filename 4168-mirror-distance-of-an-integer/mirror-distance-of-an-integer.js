/**
 * @param {number} n
 * @return {number}
 */
var mirrorDistance = function(n) {
    let rem=0;
    let ori=n;
   while(n!=0)
   {
     rem=rem*10+n%10;
    n=Math.floor(n/10);
   } 
   return Math.abs(ori-rem);
};