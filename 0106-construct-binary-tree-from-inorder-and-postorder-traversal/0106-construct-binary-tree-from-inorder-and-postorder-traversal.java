/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        public static TreeNode treeFormation(int[] inorder, int[] postorder, int start, int end, int pos, HashMap<Integer, Integer> hashMap) {
        if(start > end) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[pos]);
        int rootIndex = hashMap.get(root.val);
        root.right = treeFormation(inorder, postorder, rootIndex + 1, end, pos - 1, hashMap);
        root.left = treeFormation(inorder, postorder, start, rootIndex - 1, pos - (end - rootIndex) - 1, hashMap);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {

         if(inorder.length != postorder.length) {
            return null;
        }

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            hashmap.put(inorder[i], i);
        }
        return treeFormation(inorder, postorder, 0, inorder.length - 1, postorder.length - 1, hashmap);

        
    }
}