class Solution {
public:
    int countPartitions(vector<int>& nums) {
        int s=0;
        int fs=0;
        int ans=0;
        for(int i:nums) s+=i;
        for(int i=0;i<nums.size()-1;i++){
            fs+=nums[i];
            s-=nums[i];
            if(abs(s-fs)%2==0) ans++;
        }
        return ans;
    }
};