class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int count=0,max=0,ans=0;
        for(int i=0;i<nums.size();i++){
            if(i==0) count++;
            else if(nums[i]==nums[i-1]) count++;
            else count=1;
            if(count>max){
                max=count;
                ans=count;
            }
            else if(count==max) ans+=count;
        }
        return ans;
    }
};