class Solution {
    public int secondHighest(String s) {
        int m=Integer.MIN_VALUE;
        int sm=-1;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                int v=c-'0';
                if(m<v){
                    sm=m;
                    m=v;
                }
                else if(v<m && v>sm) sm=v;
            }
        }
        if(sm==Integer.MIN_VALUE) return -1;
        return sm;
    }
}