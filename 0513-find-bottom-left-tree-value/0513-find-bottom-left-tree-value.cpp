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
    int findBottomLeftValue(TreeNode* root) {
        int max=0;
        int ans=0;
        fun(root,max,1,ans);
        return ans;
    }
private:
    void fun(TreeNode* root,int& max,int c,int& ans){
        if(root==nullptr) return;
        fun(root->left,max,c+1,ans);
        if(max<c){
            ans=root->val;
            max=c;
        }
        fun(root->right,max,c+1,ans);
    }
};