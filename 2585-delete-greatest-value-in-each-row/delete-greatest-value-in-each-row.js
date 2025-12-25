/**
 * @param {number[][]} grid
 * @return {number}
 */
var deleteGreatestValue = function(grid) {
    for(let n of grid)
    {
        n.sort((a,b)=>a-b);
    }
    let sum=0;
    for(let i=0;i<grid[0].length;i++)
    {
        let max=0;
        for(let j=0;j<grid.length;j++)
        {
            max=Math.max(max,grid[j][i]);
        }
        sum+=max;
    }
    return sum;
};