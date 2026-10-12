class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int c=0;
        int ind=0;
        int len=nums.size();
        for(int i=0;i<len;i++){
            if(nums[i]==0) c++;
            else{
                nums[ind]=nums[i];
                ind++;
            }
        }
        for(int i=len-1;i>=len-c;i--) nums[i]=0;
    }
};