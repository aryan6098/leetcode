class Solution {
        public static void printParenthesis(ArrayList<String> result, String ans, int openingBracesCount, int           closingBracesCount, int A) {
        if(ans.length() == 2 * A) {
            result.add(ans);
            return;
        }

        if(openingBracesCount < A) {
            printParenthesis(result, ans + "(" , openingBracesCount + 1,  closingBracesCount, A);
        }
        if(closingBracesCount < openingBracesCount) {
            printParenthesis(result, ans + ")", openingBracesCount , closingBracesCount + 1 , A);
        }
        return;
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        printParenthesis(result, "", 0, 0, n);
        return result; 
    }
}