class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        if(nums.length==0) return new ArrayList<>();
        int s=nums[0];
        int b=nums[0];
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
            if(i>b) b=i;
            if(i<s) s=i;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=s;i<=b;i++){
            if(!set.contains(i)) list.add(i);
        }
        return list;
    }
}