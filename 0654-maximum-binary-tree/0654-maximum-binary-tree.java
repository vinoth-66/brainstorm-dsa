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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return fun(0,nums.length-1,nums);
    }
    private TreeNode fun(int ls,int le,int[] nums){
        if(ls>le) return null;
        int in=max(ls,le,nums);
        TreeNode root=new TreeNode(nums[in]);
        root.left=fun(ls,in-1,nums);
        root.right=fun(in+1,le,nums);
        return root;
    }
    private int max(int s,int e,int[] arr){
        int m=-1;
        int in=-1;
        for(int i=s;i<=e;i++){
            if(m<arr[i]){
                m=arr[i];
                in=i;
            }
        }
        return in;
    }
}