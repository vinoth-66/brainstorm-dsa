class Solution {
public:
    long long maxAlternatingSum(vector<int>& nums) {
        vector<int> pos(nums.size());
        for(int i=0;i<nums.size();i++){
            if(nums[i]<0) pos[i]=abs(nums[i]);
            else pos[i]=nums[i];
        }
        sort(pos.begin(),pos.end());
        vector<int> ans(nums.size());
        int s=0,e=nums.size()-1;
        int in=0;
        while(s<=e){
            if(in%2==0) ans[in++]=pos[e--];
            else ans[in++]=pos[s++];
        }
        long long sum=0;
        for(int i=0;i<ans.size();i++){
            if(i%2==0) sum+=ans[i]*ans[i];
            else sum-=ans[i]*ans[i];
        }
        return sum;
    }
};