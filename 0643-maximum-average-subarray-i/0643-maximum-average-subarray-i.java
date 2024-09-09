class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double ans = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        if(sum/k > ans) {
            ans = sum/k;
        }

        int st = 1;
        int end = k;
        while(end < nums.length) {
            sum = sum - nums[st - 1] + nums[end];
            double avg = sum/k;
            if(avg > ans) {
                ans = avg;
            }
            st++;
            end++;
        }
        return ans;
    }
}