class Solution {
    public int largestAltitude(int[] gain) {
        int a=0;
        int m=0;
        for(int i=0;i<gain.length;i++){
            gain[i]=gain[i]+a;
            a=gain[i];
            m=Math.max(m,a);
        }
        return m;
    }
}