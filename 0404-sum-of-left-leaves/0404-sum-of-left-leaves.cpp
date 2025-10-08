/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int sumOfLeftLeaves(TreeNode* root) {
        int sum=0;
        fun(root,sum,-1);
        return sum;
    }
private:
    void fun(TreeNode* root,int& sum,int v){
        if(root==nullptr) return;
        fun(root->left,sum,0);
        if(root->left==nullptr && root->right==nullptr && v==0) sum+=root->val;
        fun(root->right,sum,1);
    }
};