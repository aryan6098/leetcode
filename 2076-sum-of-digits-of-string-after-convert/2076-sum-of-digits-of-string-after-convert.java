class Solution {

    public String transform(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sum = sum + c - '0';
        }
        return Integer.toString(sum);
    }
    public int getLucky(String s, int k) {
        StringBuilder numStr = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int position = c - 'a' + 1;
            numStr.append(position);
        }

        String number = numStr.toString();
        for(int i = 0; i < k; i++) {
            number = transform(number);
        }

        return Integer.parseInt(number);
    }
}