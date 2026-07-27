class Solution {
    public int maxProduct(int[] nums) {
        int m1=Integer.MIN_VALUE;
        int m2=m1;
        for(int i:nums){
            if(m1<i){
                m2=m1;
                m1=i;
            }
            else if(m2<i){
                m2=i;
            }
        }
        return (m1-1) * (m2-1);
    }
}