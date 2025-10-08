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
        int[] sum=new int[1];
        fun(root,sum,-1);
        return sum[0];
    }
    private void fun(TreeNode root,int[] sum,int v){
        if(root==null) return;
        fun(root.left,sum,0);
        if(root.left==null && root.right==null && v==0) sum[0]+=root.val;
        fun(root.right,sum,1);
    }
}