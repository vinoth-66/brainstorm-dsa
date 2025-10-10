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
    TreeNode* increasingBST(TreeNode* root) {
        vector<int> ans;
        fun(root,ans);
        sort(ans.begin(),ans.end());
        TreeNode* head=new TreeNode(ans[0]);
        TreeNode* prev=head;
        for(int i=1;i<ans.size();i++){
            TreeNode* node=new TreeNode(ans[i]);
            prev->right=node;
            prev=node;
        }
        return head;
    }
private :
    void fun(TreeNode* root,vector<int>& ans){
        if(root==nullptr) return;
        ans.push_back(root->val);
        fun(root->left,ans);
        fun(root->right,ans);
    }
};