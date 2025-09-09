class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        // next_permutation(nums.begin(),nums.end());
        int in=-1;
        for(int i=nums.size()-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                in=i;
                break;
            }
        }
        if(in==-1) reverse(nums.begin(),nums.end());
        else{
            for(int i=nums.size()-1;i>in;i--){
                if(nums[i]>nums[in]){
                    swap(nums[i],nums[in]);
                    break;
                }
            }
            reverse(nums.begin()+in+1,nums.end());
        }
    }
};