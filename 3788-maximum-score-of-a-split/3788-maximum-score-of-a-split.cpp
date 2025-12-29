class Solution {
public:
    long long maximumScore(vector<int>& nums) {
        vector<int> arr(nums.size());
        int min=nums[nums.size()-1];
        arr[nums.size()-1]=nums[nums.size()-1];
        for(int i=nums.size()-2;i>=0;i--){
            if(nums[i]<min){
                min=nums[i];
            }
            arr[i]=min;
        }
        long long ans=INT_MIN;
        long long s=0;
        for(int i=0;i<nums.size()-1;i++){
            s+=nums[i];
            if(s-arr[i+1]>ans) ans=s-arr[i+1];
        }
        return ans;
    }
};