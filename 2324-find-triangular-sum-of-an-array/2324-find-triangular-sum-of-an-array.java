class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        List<Integer> ans=new ArrayList<>();
        for(int i:nums) ans.add(i);
        int n=nums.length-1;
        for(int i=n;i>=0;i--){
            fun(ans,i);
        }
        return ans.get(0);
    }
    public void fun(List<Integer> list,int n){
        for(int i=0;i<n;i++){
            list.set(i,(list.get(i)+list.get(i+1))%10);
        }
    }
}