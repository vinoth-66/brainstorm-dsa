class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int len=nums.length;
        int[] pre=new int[len];
        int[] suf=new int[len];
        List<Integer> ans=new ArrayList<>();
        int m1=nums[0],m2=nums[len-1];
        pre[0]=m1;
        suf[len-1]=m2;
        for(int i=1;i<len-1;i++){
            m1=Math.max(m1,nums[i]);
            pre[i]=m1;
            m2=Math.max(m2,nums[len-i-1]);
            suf[len-i-1]=m2;
        }
        for(int i=0;i<len;i++){
            if(i==0 || i==len-1) ans.add(nums[i]);
            else if(nums[i]>pre[i-1] || nums[i]>suf[i+1]) ans.add(nums[i]);
        }
        return ans;
    }
}