class Solution {
    public int maximumSwap(int num) {
        String n=String.valueOf(num);
        StringBuilder nums=new StringBuilder(n);
        int len=nums.length();
        for(int i=0;i<len-1;i++){
            int a=nums.charAt(i)-'0';
            int b=fun(i+1,len,nums);
            if(b!=-1 && a<nums.charAt(b)-'0'){
                char temp = nums.charAt(i);
                nums.setCharAt(i, nums.charAt(b));
                nums.setCharAt(b, temp);
                break;
            }
        }
        return Integer.parseInt(nums.toString());
    }
    private int fun(int s,int e,StringBuilder nums){
        int maxDigit = -1;
        int idx = -1;
        for (int i = s; i < e; i++) {
            int digit = nums.charAt(i) - '0';
            if (digit >= maxDigit) {
                maxDigit = digit;
                idx = i;
            }
        }
        return idx;
    }
}