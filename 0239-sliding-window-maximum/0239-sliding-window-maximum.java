class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] A = new int[nums.length - k + 1];
        int index = 0;
        for(int i = 0; i < k; i++) {
            while (deque.size() > 0 && nums[i] > deque.getLast()) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);;
        }
        A[index] = deque.peekFirst();
        index++;
        // arrayList.add(deque.peekFirst());
        int s = 1;
        int e = k;
        while(e < nums.length) {
            if(nums[s-1] == deque.peekFirst()) {
                deque.removeFirst();
            }
            while (deque.size() > 0 && nums[e] > deque.getLast()) {
                deque.removeLast();
            }
            deque.addLast(nums[e]);
            
            A[index] = deque.peekFirst();
            index++;
            s++;
            e++;
        }
        return A;
    }
}