/**
 * @param {number[]} apple
 * @param {number[]} capacity
 * @return {number}
 */
var minimumBoxes = function(apple, capacity) {
    let sum=apple.reduce((a,b)=>(a+b),0);
    capacity.sort((a,b)=>(b-a));
    let box=0;
    for(let i of capacity)
    {
        sum-=i;
        box++;
        if(sum<=0)
        {
            break;
        }
    }
    return box;
};