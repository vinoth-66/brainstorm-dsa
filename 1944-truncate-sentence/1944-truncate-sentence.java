class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        if(arr.length<=k) return s;
        String ans="";
        for(int i=0;i<k;i++){
            ans+=arr[i]+" ";
        }
        return ans.substring(0,ans.length()-1);
    }
}