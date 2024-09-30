class Solution {
     private static final HashMap<Character, String> digitToChar = new HashMap<>();
    static {
        digitToChar.put('0', "0");
        digitToChar.put('1', "1");
        digitToChar.put('2', "abc");
        digitToChar.put('3', "def");
        digitToChar.put('4', "ghi");
        digitToChar.put('5', "jkl");
        digitToChar.put('6', "mno");
        digitToChar.put('7', "pqrs");
        digitToChar.put('8', "tuv");
        digitToChar.put('9', "wxyz");
    }

    public void generateLetterCombination(ArrayList<String> result,String current,String digits, int index) {
        // if(index == digits.length()) {
        //     result.add(current);
        //     return;
        // }
        // char key = digits.charAt(index);
        // String letter = digitToChar.get(key);
        // for(int i = 0; i < letter.length(); i++) {
        //     generateLetterCombination(result, current + letter.charAt(i) , digits, index );
        // }

                if(index == digits.length()) {
            result.add(current);
            return;
        }
        char key = digits.charAt(index);
        String letter = digitToChar.get(key);
        for(int i = 0; i < letter.length(); i++) {
            generateLetterCombination(result,  current + letter.charAt(i),digits, index + 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<>();
           String current = "";
           if(digits.equals("")) {
            return new ArrayList<>();
            
           }
        generateLetterCombination(result ,current,digits, 0);
        return result;
    };


}