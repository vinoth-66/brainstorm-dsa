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
    public int findSecondMinimumValue(TreeNode root) {
        long[] a=new long[1];
        long[] b=new long[1];
        a[0]=Long.MAX_VALUE;
        b[0]=Long.MAX_VALUE;
        fun(root,a,b);
        if(b[0]==Long.MAX_VALUE) return -1;
        return (int)b[0];
    }
    private void fun(TreeNode root,long[] a,long[] b){
        if(root==null) return;
        if(root.val<a[0]) a[0]=root.val;
        if(root.val>a[0] && root.val<b[0]) b[0]=root.val;
        fun(root.left,a,b);
        fun(root.right,a,b);
    }
}