class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int sum=0;
        vector<int> res;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if(nums[i]+nums[j]==target){
                    sum=i;
                    res.push_back(sum);
                    sum=j;
                    res.push_back(sum);
                }
            }
        }
        return res;
    }
};