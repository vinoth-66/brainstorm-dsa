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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        fun(root,ans);
        Collections.sort(ans);
        TreeNode head=new TreeNode(ans.get(0));
        TreeNode prev=head;
        for(int i=1;i<ans.size();i++){
            TreeNode node=new TreeNode(ans.get(i));
            prev.right=node;
            prev=node;
        }
        return head;
    }
    private void fun(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        fun(root.left,ans);
        fun(root.right,ans);
    }
}