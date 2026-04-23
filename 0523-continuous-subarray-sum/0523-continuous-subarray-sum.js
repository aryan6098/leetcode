/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var checkSubarraySum = function(nums, k) {
    let prefixSum = 0; 
    let map = new Map();
    map.set(0, -1);
    for(let i = 0; i < nums.length; i++) {
        prefixSum += nums[i];
        let rem = ((prefixSum % k) + k) % k;
        if(map.get(rem) !== undefined) {
            if(i - (map.get(rem)) >= 2) {
                return true;
            }
        }
        else {
            map.set(rem, i);
        }
    }

    return false;
};