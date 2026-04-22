/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
    let count = 0; 
    let pSum = 0;
    let map = new Map();
    map.set(0, 1);
    for(let i = 0 ; i < nums.length;i++) {
        pSum += nums[i];
        if(map.get(pSum - k)) {
            count += map.get(pSum - k)
        }

        map.set(pSum, (map.get(pSum) || 0)+ 1);


    }
    return count;
};