class Solution {
    public String majorityFrequencyGroup(String s) {
        int[] ans=new int[26];
        for(char c:s.toCharArray()){
            ans[c-97]++;
        }
        int[] alpha=ans.clone();
        Arrays.sort(alpha);
        int c=1;
        int max=0;
        int maxfreq=0;
        for(int i=0;i<alpha.length-1;i++){
            if(alpha[i]==0) continue;
            if(alpha[i]==alpha[i+1]) c++;
            else{
                if(max<=c){
                    max=c;
                    maxfreq=alpha[i];
                }
                c=1;
            }
        }
        if(max<=c){
            max=c;
            maxfreq=alpha[alpha.length-1];
        }
        StringBuilder v=new StringBuilder();
        for(int i=0;i<ans.length;i++){
            if(ans[i]==maxfreq) v.append((char)(i+97));
        }
        return v.toString();
    }
}