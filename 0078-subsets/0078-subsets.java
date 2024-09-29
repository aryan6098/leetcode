class Solution {


    public void generateSubsets(int[] nums, List<List<Integer>> list, ArrayList<Integer> arrList, int index ) {
        if(index == nums.length) {
            list.add(new ArrayList<>(arrList));
            return;
        }
        generateSubsets(nums, list, arrList, index + 1);
        arrList.add(nums[index]);
        generateSubsets(nums, list, arrList, index + 1);
        arrList.remove(arrList.size() - 1);
    return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> arrList = new ArrayList<>();
        generateSubsets(nums, list, arrList, 0);
        return list;
    }
}