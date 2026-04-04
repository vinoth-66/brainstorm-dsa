class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=queries.length;
        int[] pre=new int[words.length];
        if(vin(words[0])) pre[0]=1;
        for(int i=1;i<words.length;i++){
            if(vin(words[i])) pre[i]=pre[i-1]+1;
            else pre[i]=pre[i-1];
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(queries[i][0]==0) ans[i]=(pre[queries[i][1]]);
            else ans[i]=(pre[queries[i][1]]-pre[queries[i][0]-1]);
        }
        return ans;
    }
    private boolean vin(String words){
        if((words.charAt(0)=='a' || words.charAt(0)=='e' || words.charAt(0)=='o'
        || words.charAt(0)=='i' || words.charAt(0)=='u') && 
        (words.charAt(words.length()-1)=='a' || 
        words.charAt(words.length()-1)=='e' || 
        words.charAt(words.length()-1)=='i'
        || words.charAt(words.length()-1)=='o' || 
        words.charAt(words.length()-1)=='u')) return true;
        return false;
    }
}