/**
 * @param {number[]} nums
 */
var NumArray = function(nums) {
    this.pSum = []
    this.pSum[0] = nums[0];
    for(let i = 1; i < nums.length; i++) {
        this.pSum[i] = this.pSum[i - 1] + nums[i];
    }
    
};

/** 
 * @param {number} left 
 * @param {number} right
 * @return {number}
 */
NumArray.prototype.sumRange = function(left, right) {
    if(left === 0) {
        return this.pSum[right];
    }
    return this.pSum[right] - this.pSum[left - 1];
};

/** 
 * Your NumArray object will be instantiated and called as such:
 * var obj = new NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */