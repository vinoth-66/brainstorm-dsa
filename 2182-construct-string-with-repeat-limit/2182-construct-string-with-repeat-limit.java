class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int cnt=0,previn=-1;
        int in=25;
        StringBuilder sb=new StringBuilder();
        while(in>-1){
            if(arr[in]!=0){
                int t=0;
                if(previn!=-1){
                    t=1;
                    add(sb,t,(char)(in+'a'));
                    arr[in]-=t;
                    in=previn;
                    previn=-1;
                }
                else{
                    if(arr[in]>repeatLimit){
                        t=repeatLimit;
                        previn=in;
                    }
                    else{
                        t=arr[in];
                    }
                    add(sb,t,(char)(in+'a'));
                    arr[in]-=t;
                    in--;
                }  
            }
            else in--;
        }
        return sb.toString();
    }
    private void add(StringBuilder sb,int t,char c){
        for(int i=0;i<t;i++){
            sb.append(c);
        }
    }
}