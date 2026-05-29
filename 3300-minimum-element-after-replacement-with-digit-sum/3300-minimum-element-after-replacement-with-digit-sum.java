class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            int v=vin(i);
            if(v<min) min=v;
        }
        return min;
    }
    private int vin(int el){
        int s=0;
        while(el!=0){
            s+=el%10;
            el/=10;
        }
        return s;
    }
}