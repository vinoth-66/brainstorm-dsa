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
    int findSecondMinimumValue(TreeNode* root) {
        long long a=LLONG_MAX;
        long long b=LLONG_MAX;
        fun(root,a,b);
        if(b==LLONG_MAX) return -1;
        return (int)b;
    }
private :
    void fun(TreeNode* root,long long& a,long long& b){
        if(root==nullptr) return;
        if(root->val<a) a=root->val;
        if(root->val>a && root->val<b) b=root->val;
        fun(root->left,a,b);
        fun(root->right,a,b);
    }
};
