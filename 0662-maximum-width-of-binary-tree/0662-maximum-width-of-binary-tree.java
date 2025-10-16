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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans=0;
        Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
        q.offer(new Pair<>(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int minn=q.peek().getValue();
            int first=0,last=0;
            for(int i=0;i<size;i++){
                int curr=q.peek().getValue()-minn;
                TreeNode node=q.poll().getKey();
                if(i==0) first=curr;
                if(i==size-1) last=curr;
                if(node.left!=null) q.offer(new Pair<>(node.left,curr*2+1));
                if(node.right!=null) q.offer(new Pair<>(node.right,curr*2+2));
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
}