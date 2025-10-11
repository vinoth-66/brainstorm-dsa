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
    public int findBottomLeftValue(TreeNode root) {
        int[] max=new int[1];
        int[] ans=new int[1];
        fun(root,max,1,ans);
        return ans[0];
    }
    private void fun(TreeNode root,int[] max,int c,int[] ans){
        if(root==null) return;
        fun(root.left,max,c+1,ans);
        if(max[0]<c){
            ans[0]=root.val;
            max[0]=c;
        }
        fun(root.right,max,c+1,ans);
    }
}