class Solution {
    public int smallestNumber(int n) {
        // while(true){
        //     String s=Integer.toBinaryString(n++);
        //     if(s.contains("0")!=true){
        //         return Integer.parseInt(s,2);
        //     }
        // }

        int x=n;
        while((x&(x+1))!=0) x++;
        return x;
    }
}