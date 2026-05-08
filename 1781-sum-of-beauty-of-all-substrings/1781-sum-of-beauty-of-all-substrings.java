class Solution {
    public int beautySum(String s) {
        int len=s.length();
        int ans=0;
        for(int i=0;i<len;i++){
            int[] freq=new int[26];
            for(int j=i;j<len;j++){
                int in=s.charAt(j)-97;
                freq[in]++;
                int max=1,min=Integer.MAX_VALUE;
                for(int v=0;v<26;v++){
                    if(freq[v]>0){
                        min=Math.min(min,freq[v]);
                        max=Math.max(max,freq[v]);
                    }
                }
                ans+=(max-min);
            }
        }
        return ans;
    }
}