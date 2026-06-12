class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] freq=new int[26];
        Arrays.fill(freq,-1);
        int ans=0;
        for(int i=0;i<s.length();i++){
            int v=s.charAt(i)-'a';
            if(freq[v]==-1) freq[v]=i;
            else freq[v]=Math.abs(freq[v]-i);
            int h=t.charAt(i)-'a';
            if(freq[h]==-1) freq[h]=i;
            else freq[h]=Math.abs(freq[h]-i);
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=-1) ans+=freq[i];
        }
        return ans;
    }
}