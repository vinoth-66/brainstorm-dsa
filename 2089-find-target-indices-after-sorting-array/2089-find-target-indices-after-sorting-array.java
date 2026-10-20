class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        int bcnt=0,tcnt=0;
        for(int i:nums){
            if(i<target) bcnt++;
            else if(i==target) tcnt++;
        }
        for(int i=0;i<tcnt;i++){
            ans.add(bcnt++);
        }
        return ans;
    }
}