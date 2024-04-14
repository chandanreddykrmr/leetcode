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
    public int sumOfLeftLeaves(TreeNode root) {
        int total = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left != null){
                if(node.left.left == null && node.left.right == null){
                     total = total + node.left.val;
                }else{
                stack.push(node.left);
            }  
          }
            if(node.right != null){
                if(node.right.left != null || node.right.right !=null){
                    stack.push(node.right);
                }
            }
            
        }
        
        return total;
    }
}