class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int area = 0;
        while(l < r) {
            area = Math.max(area , ((r - l) * Math.min(height[l], height[r])));
            if(height[l] > height[r]) {
                r--;
            }else {
                l++;
            }
        }
        return area;
    }
}