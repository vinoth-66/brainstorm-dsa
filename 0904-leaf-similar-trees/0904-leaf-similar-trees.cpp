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
    bool leafSimilar(TreeNode* root1, TreeNode* root2) {
        vector<int> l1;
        vector<int> l2;

        fun(root1,l1);
        fun(root2,l2);

        return l1==l2;
    }
    private:
        void fun(TreeNode* root,vector<int>& ans){
        if(root==nullptr) return;
        if(root->left==nullptr && root->right==nullptr){
            ans.push_back(root->val);
        } 
        fun(root->left,ans);
        fun(root->right,ans);
    }
};