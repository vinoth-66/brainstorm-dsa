/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* modifiedList(vector<int>& nums, ListNode* head) {
        if(head==nullptr) return nullptr;
        unordered_set<int> s;
        for(int i:nums) s.insert(i);
        ListNode* dummy=new ListNode(-1);
        ListNode* p=dummy;
        ListNode* c=head;
        while(c!=nullptr){
            if(s.find(c->val)!=s.end()){
                p->next=c->next;
                c=c->next;
            }
            else{
                p=c;
                c=c->next;
            }
        }
        if(dummy->next==nullptr) return head;
        return dummy->next;
    }
};