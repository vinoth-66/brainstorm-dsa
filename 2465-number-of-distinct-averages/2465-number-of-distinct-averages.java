class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int s=0,e=nums.length-1;
        Set<Double> set=new HashSet<>();
        while(s<e){
            set.add(((double)nums[s]+(double)nums[e])/2);
            s++;
            e--;
        }
        return set.size();
    }
}