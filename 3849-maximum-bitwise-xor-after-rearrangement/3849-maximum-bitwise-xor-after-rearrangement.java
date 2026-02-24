class Solution {
    public String maximumXor(String s, String t) {
        int oneCount=0,zeroCount=0;
        for(char c:t.toCharArray()){
            if(c=='1') oneCount++;
            else zeroCount++;
        }
        StringBuilder r=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='1'){
                if(zeroCount>0){
                    r.append('1');
                    zeroCount--;
                }
                else{
                    r.append('0');
                    oneCount--;
                }
            }
            else{
                if(oneCount>0){
                    r.append('1');
                    oneCount--;
                }
                else{
                    r.append('0');
                    zeroCount--;
                }
            }
        }
        return r.toString();
    }
}