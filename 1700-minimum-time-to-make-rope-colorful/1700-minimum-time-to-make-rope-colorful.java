class Solution {
    public int minCost(String colors, int[] neededTime) {
        int p=0;
        int max=neededTime[0];
        int sum=neededTime[0];
        int ans=0;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(p)==colors.charAt(i)){
                sum+=neededTime[i];
                max=Math.max(max,neededTime[i]);
            }
            else{
                p=i;
                ans+=(Math.abs(sum-max));
                sum=neededTime[i];
                max=neededTime[i];
            }
        }
        ans+=(Math.abs(sum-max));
        return ans;
    }
}