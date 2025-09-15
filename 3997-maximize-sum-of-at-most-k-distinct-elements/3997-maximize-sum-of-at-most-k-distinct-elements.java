class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        if(nums.length<=1) return nums;
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            if(k==0) break;
            if(i==nums.length-1){
                list.add(nums[i]);
                k--;
            }
            else if(nums[i]!=nums[i+1]){
                list.add(nums[i]);
                k--;
            }
            
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }        
        return ans;
    }
}