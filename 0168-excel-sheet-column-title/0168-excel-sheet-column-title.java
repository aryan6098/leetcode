class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        while(columnNumber > 0) {
            columnNumber = columnNumber - 1;
            int rem = columnNumber % 26;
            columnNumber = columnNumber/26;
            char ch = (char)(rem + 'A');
            ans = ch + ans;
        }
        return ans;
    }
}