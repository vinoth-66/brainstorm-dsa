class Solution {
    public int minOperations(String s) {
        int min=123;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') continue;
            else{
                min=Math.min(min,s.charAt(i)+0);
            }
        }
        if(min==123) return 0;
        return 122-min+1;
    }
}