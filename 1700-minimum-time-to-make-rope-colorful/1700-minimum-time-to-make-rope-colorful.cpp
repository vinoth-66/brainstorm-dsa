class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        int p=0;
        int m=neededTime[0];
        int sum=neededTime[0];
        int ans=0;
        for(int i=1;i<colors.size();i++){
            if(colors[p]==colors[i]){
                sum+=neededTime[i];
                m=max(m,neededTime[i]);
            }
            else{
                p=i;
                ans+=(abs(sum-m));
                sum=neededTime[i];
                m=neededTime[i];
            }
        }
        ans+=(abs(sum-m));
        return ans;
    }
};