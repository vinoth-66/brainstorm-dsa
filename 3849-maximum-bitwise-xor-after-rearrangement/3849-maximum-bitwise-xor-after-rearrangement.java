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
                    r.append('0');
                    zeroCount--;
                }
                else{
                    r.append('1');
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
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==r.charAt(i)) ans.append('0');
            else ans.append('1');
        }
        return ans.toString();
    }
}