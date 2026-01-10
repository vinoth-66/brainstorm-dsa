class Solution {
    public int maxLength(List<String> arr) {
        return pdp(arr,0,"");
    }
    private int pdp(List<String> list,int in,String sb){
        if(in==list.size()) return 0;
        int leave=pdp(list,in+1,sb);
        boolean ch=check(sb,list.get(in));
        if(ch){
            int pick=list.get(in).length()+pdp(list,in+1,sb+list.get(in));
            leave=Math.max(pick,leave);
        }
        return leave;
    }
    private boolean check(String sb,String s){
        char[] arr=new char[26];
        for(char c:s.toCharArray()){
            if(arr[c-97]>0) return false;
            arr[c-97]++;
        }
        for(char c:sb.toCharArray()){
            if(arr[c-97]>0) return false;
            arr[c-97]++;
        }
        return true;
    }
}