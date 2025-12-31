/**
 * @param {number[]} nums
 * @param {number} original
 * @return {number}
 */
var findFinalValue = function(nums, original) {
    return mul(nums,original);
};
function mul(nums,original)
{
    for(let i=0;i<nums.length;i++)
    {
        if(nums[i]==original)
        {
            return mul(nums,original*2);
        }
    }
    return original;
}