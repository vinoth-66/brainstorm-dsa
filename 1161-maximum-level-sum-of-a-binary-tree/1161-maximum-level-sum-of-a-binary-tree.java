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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int max=Integer.MIN_VALUE;
        int l=0,ans=0;
        while(!q.isEmpty()){
            int s=q.size();
            int sum=0;
            l++;
            for(int i=0;i<s;i++){
                TreeNode n=q.poll();
                if(n.left!=null){
                    q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);
                }
                sum+=n.val;
            }
            if(sum>max){
                max=sum;
                ans=l;
            }
        }
        return ans;
    }
}