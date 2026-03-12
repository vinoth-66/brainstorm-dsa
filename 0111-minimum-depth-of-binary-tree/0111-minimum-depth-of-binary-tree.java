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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int ans=0;
        while(!q.isEmpty()){
            ans++;
            int s=q.size();
            int f=0;
            for(int i=0;i<s;i++){
                TreeNode v=q.poll();
                if(v.left==null && v.right==null){
                    f=1;
                    break;
                }
                if(v.left!=null) q.offer(v.left);
                if(v.right!=null) q.offer(v.right);
            }
            if(f==1) break;
        }
        return ans;
    }
}