class Solution {
    public int[] nextSmallerLeftSide(int[] A) {
        Stack<Integer> st = new Stack<>(); 
        int[] res = new int[A.length];
        st.push(0);
        res[0] = -1;
        for(int i = 1; i < A.length; i++) {
            while(!st.empty() && A[i] <= A[st.peek()]) {
                st.pop();
            }
            if(st.empty()){
                res[i] = -1;
            }else {
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public int[] nextSmallerRightSide(int[] A) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[A.length];
        for(int i = A.length - 1; i >= 0; i--) {
            while(!st.empty() && A[i] <= A[st.peek()]) {
                st.pop();
            }
            if(st.empty()) {
                res[i] = A.length;
            }else {
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public int largestRectangleArea(int[] heights) {
        int[] res_R = nextSmallerRightSide(heights);
        int[] res_L = nextSmallerLeftSide(heights);
        long maxArea = 0;
        for(int i = 0; i < heights.length; i++) {
            int l = res_L[i];
            int r = res_R[i];
            int leftBoundary = (l == -1) ? 0 : l + 1;
            int rightBoundary = (r == heights.length) ? heights.length - 1 : r - 1;
            int width = rightBoundary - leftBoundary + 1;
            long area = (long)heights[i] * width;
            if(area > maxArea) {
                maxArea = area;
            }
        }
    return (int)maxArea;
    }
}