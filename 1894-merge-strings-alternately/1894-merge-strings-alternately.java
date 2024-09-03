class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        } 
        int l = Math.min(word1.length(), word2.length());
        int r = Math.max(word1.length(), word2.length());
        while(l < r) {
            if(word1.length() < r) {
                str.append(word2.charAt(l));
            }else {
                str.append(word1.charAt(l));
            }
            l++;
        }
        
       
        return str.toString();
    }
}