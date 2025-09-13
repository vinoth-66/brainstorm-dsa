class Solution {
    public int smallestAbsent(int[] nums) {
        if(nums.length==1 && nums[0]<0) return 1;
        Arrays.sort(nums);
        int s=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            s+=i;
            set.add(i);
        }
        double a=(double) s/nums.length;
        int avg=(int) Math.floor(a)+1;
        for(int i=avg;i<=nums[nums.length-1]+1;i++){
            if(!set.contains(i) && i>0){
                return i;
            } 
        }
        return 1;
    }
}