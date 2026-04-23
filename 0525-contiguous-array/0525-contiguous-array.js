/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
    let pSum = 0;
    let length = 0; 
    let map = new Map();
    map.set(0, -1);
    for(let i = 0 ; i < nums.length; i++) {
        pSum += nums[i] === 0 ? -1 : 1;
        if(map.get(pSum) !== undefined) {
            length = Math.max(length, i - map.get(pSum));
        }else {
            map.set(pSum, i);
        }
    }
    return length;
};