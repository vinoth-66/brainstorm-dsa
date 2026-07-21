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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null) return root2;
        if(root2==null) return root1;
        vin(root1,root2);
        return root1;
    }
    public void vin(TreeNode r, TreeNode r2){
        if(r2==null) return;
        r.val+=r2.val;
        if(r.left==null){
            r.left=r2.left;
        }
        else vin(r.left,r2.left);
        if(r.right==null){
            r.right=r2.right;
        }
        else vin(r.right,r2.right);
    }
}