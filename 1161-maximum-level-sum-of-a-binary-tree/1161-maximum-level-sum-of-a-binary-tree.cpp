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
    int maxLevelSum(TreeNode* root) {
        queue<TreeNode*> q;
        q.push(root);
        int max=INT_MIN;
        int l=0,ans=0;
        while(!q.empty()){
            int s=q.size();
            int sum=0;
            l++;
            for(int i=0;i<s;i++){
                TreeNode* n=q.front();
                q.pop();
                if(n->left!=nullptr){
                    q.push(n->left);
                }
                if(n->right!=nullptr){
                    q.push(n->right);
                }
                sum+=n->val;
            }
            if(sum>max){
                max=sum;
                ans=l;
            }
        }
        return ans;
    }
};