class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        fun(s,0,"",ans);
        return ans;    
    }
    private void fun(String s,int in,String sb,List<String> ans){
        if(in==s.length()){
            ans.add(sb.toString());
            return;
        }
        if(!Character.isDigit(s.charAt(in))){
            fun(s,in+1,sb+Character.toLowerCase(s.charAt(in)),ans);
            fun(s,in+1,sb+Character.toUpperCase(s.charAt(in)),ans);
        }
        else{
            fun(s,in+1,sb+s.charAt(in),ans);
        }
    }

}