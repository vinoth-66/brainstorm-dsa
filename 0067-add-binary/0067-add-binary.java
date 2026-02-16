class Solution {
    public String addBinary(String a, String b) {
        String s="";
        String v="";
        if(a.length()>b.length()){
            s=a;
            v=b;
        }
        else{
            s=b;
            v=a;
        }
        int in=v.length()-1;
        int i=s.length()-1;
        char c='0';
        StringBuilder sb=new StringBuilder();
        while(in>=0){
            if(s.charAt(i)=='0' && v.charAt(in)=='0'){
                if(c=='1'){
                    sb.append('1');
                    c=0;
                }
                else sb.append('0');
            }
            else if((s.charAt(i)=='0' && v.charAt(in)=='1') 
            || (s.charAt(i)=='1' && v.charAt(in)=='0')){
                if(c=='1'){
                    sb.append('0');
                }
                else{
                    sb.append('1');
                }
            }
            else{
                if(c=='1'){
                    sb.append('1');
                }
                else{
                    sb.append('0');
                    c='1';
                }
            }
            i--;
            in--;
        }
        while(i>=0){
            if(c=='1'){
                if(s.charAt(i)=='1'){
                    sb.append('0');
                    c='1';
                }
                else{
                    sb.append('1');
                    c='0';
                }
            }
            else{
                sb.append(s.charAt(i));
            }
            i--;
        }
        if(c=='1') sb.append('1');
        sb.reverse();
        return sb.toString();
    }
}