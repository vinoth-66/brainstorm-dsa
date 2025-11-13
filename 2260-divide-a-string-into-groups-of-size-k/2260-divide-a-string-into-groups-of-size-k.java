class Solution {
    public String[] divideString(String s, int k, char fill) {
        int size = s.length() % k == 0 ? s.length()/k : (s.length()/k) + 1;
        String[] str=new String[size];
        int in=0;
        for(int i=0;i<s.length();i+=k){
            if(i+k>s.length()){
                StringBuilder sb=new StringBuilder(s.substring(i));
                while(sb.length()<k){
                    sb.append(fill);
                }
                str[in++]=sb.toString();
            }
            else{
                str[in++]=s.substring(i,i+k);
            }
        }
        return str;
    }
}