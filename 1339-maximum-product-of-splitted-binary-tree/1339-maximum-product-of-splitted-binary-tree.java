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
    public int maxProduct(TreeNode root) {
        long[] sum=new long[1];
        long[] max=new long[1];
        max[0]=-1;
        fun(root,sum);
        max(root,sum,max);
        int mod=1000000007;
        return (int) (max[0]%mod);
    }
    private void fun(TreeNode node,long[] sum){
        if(node==null) return;
        sum[0]+=node.val;
        fun(node.left,sum);
        fun(node.right,sum);
    }
    private long max(TreeNode node,long[] sum,long[] max){
        if(node==null) return 0;
        long left=max(node.left,sum,max);
        long right=max(node.right,sum,max);

        long st=node.val+left+right;
        max[0]=Math.max(max[0],st*(sum[0]-st));
        return st;
    }
}