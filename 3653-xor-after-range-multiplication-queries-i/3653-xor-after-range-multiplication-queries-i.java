class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod=1000000007;
        for(int[] i:queries){
            for(int j=i[0];j<=i[1];j+=i[2]){
                nums[j]=(int)((1L*nums[j]*i[3])%mod);
            }
        }
        long ans=nums[0];;
        for(int i=1;i<nums.length;i++){
            ans^=nums[i];
        }
        return (int)ans;
    }
}