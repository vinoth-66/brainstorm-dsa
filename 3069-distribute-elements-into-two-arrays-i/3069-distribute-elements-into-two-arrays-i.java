class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        int len=nums.length;
        for(int i=2;i<len;i++){
            if(l1.get(l1.size()-1)>l2.get(l2.size()-1)) l1.add(nums[i]);
            else l2.add(nums[i]);
        }
        int in=0,ind=0;
        int[] ans=new int[len];
        for(int i=0;i<len;i++){
            if(in<l1.size()) ans[i]=l1.get(in++);
            else ans[i]=l2.get(ind++);
        }
        return ans;
    }
}