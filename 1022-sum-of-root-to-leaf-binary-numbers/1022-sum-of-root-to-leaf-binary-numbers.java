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
        int[] ans=new int[1];
        vin(root,"",ans);
        return ans[0];
    }
    private void vin(TreeNode root,String t,int[] ans){
        if(root==null){
            return;
        }
        t+=root.val;
        if(root.left==null && root.right==null){
            int v=Integer.parseInt(t,2);
            ans[0]+=v;
            return;
        }
        vin(root.left,t,ans);
        vin(root.right,t,ans);
    }
}