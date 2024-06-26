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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root == null){
            return 0;
        }
        
        int left = 0;
        int right = 0;
        
        if(root.val > low){
            left = rangeSumBST(root.left, low, high);
        }
        if(root.val < high){
            right = rangeSumBST(root.right, low, high);
        }
        if(root.val >= low && root.val <= high){
            return left+right+root.val;
        }else{
            return left+right;
        }
        
    }
}