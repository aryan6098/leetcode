/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraysDivByK = function(nums, k) {
    let pSum = 0;
    let count = 0;
    let map = new Map()
    map.set(0,1);
    for(let i = 0; i < nums.length; i++) {
        pSum += nums[i];
        let rem = ((pSum % k) + k)% k;

        if(map.get(rem)){
            count += map.get(rem)
        }

        map.set(rem, (map.get(rem) || 0) + 1);

    }
    return count;
    
};