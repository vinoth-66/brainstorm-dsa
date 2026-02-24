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
    public int sumRootToLeaf(TreeNode root) {
        // int[] ans=new int[1];
        return vin(root,"");
        // return ans[0];
    }
    private int vin(TreeNode root,String t){
        if(root==null){
            return 0;
        }
        t+=root.val;
        if(root.left==null && root.right==null){
            int v=Integer.parseInt(t,2);
            return v;
        }
        int l=vin(root.left,t);
        int r=vin(root.right,t);
        return l+r;
    }
}