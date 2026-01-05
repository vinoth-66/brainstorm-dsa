class Solution {
    public List<String> letterCombinations(String digits) {
        // List<String> ans=new ArrayList<>();
        // if(digits.isEmpty()) return ans;
        // String[] str={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        // fun(digits,"",str,ans);
        // return ans;


        String[] str={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans=new ArrayList<>();
        fun(digits,str,0,ans,"");
        return ans;
    }

    private void fun(String digi,String[] str,int in,List<String> ans,String bag){
        if(in==digi.length()){
            ans.add(bag);
            return;
        }
        int c=(digi.charAt(in)-'0')-2;
        String s=str[c];
        for(int i=0;i<s.length();i++){
            char as=s.charAt(i);
            fun(digi,str,in+1,ans,bag+as);
        }
    }




    // private void fun(String up,String p,String[] str,List<String> ans){
    //     if(up.length()==0){
    //         ans.add(p);
    //         return;
    //     }
    //     String key=str[up.charAt(0)-48];
    //     for(int i=0;i<key.length();i++){
    //         fun(up.substring(1),p+key.charAt(i),str,ans);
    //     }
    // }
}