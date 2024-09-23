class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int mul = 1;
        for(int i = columnTitle.length() - 1; i >= 0; i--) {
            ans += mul * (columnTitle.charAt(i) - 'A' + 1);
            mul *= 26;
        }
        return ans;
    }
}