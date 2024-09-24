class Solution {
    public int countDigitOne(int n) {
         int count = 0; 
        for(int i = 1; i <= n; i = i * 10) {
            int placesOnes = 10 * i;
            count += (n/ placesOnes) * i + Math.min(Math.max(n % placesOnes - i  +1, 0), i);
        }
        return count;
    }
}