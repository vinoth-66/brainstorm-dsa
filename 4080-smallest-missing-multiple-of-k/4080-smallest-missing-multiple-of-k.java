class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int i:nums){
            set.add(i);
            if(i%k==0) max=Math.max(max,i);
        }
        for(int i=k;i<=max;i+=k){
            if(!set.contains(i)) return i;
        }
        if(max<k) return k; 
        return max+k;
    }
}