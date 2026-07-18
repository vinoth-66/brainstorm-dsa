class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=-1;
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        return vin(max,min);
    }
    public int vin(int max,int min){
        while(min!=0){
            int v=max%min;
            max=min;
            min=v;
        }
        return max;
    }
}