class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n=s.length();
        int[] ps=new int[n];
        int[] pv=new int[n];
        int[] cnt=new int[n];
        long[] pow=new long[n+1];
        int mod=1000000007;
        if(s.charAt(0)!='0') cnt[0]=1;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(i==0){
                pv[i]=(c=='0')?0:c-'0';
            } 
            else{
                if(c!='0')
                    pv[i]=(int)(((long)pv[i-1]*10+(c-'0'))%mod);
                else pv[i]=pv[i-1];
            }
            if(i==0){
                ps[i]=c-'0';
                pow[i]=1;
            }
            else{
                ps[i]=ps[i-1]+(c-'0');
                pow[i]=(pow[i-1]*10)%mod;
                if(c!='0') cnt[i]=cnt[i-1]+1;
                else cnt[i]=cnt[i-1];
            }
        }
        pow[n]=(pow[n-1]*10)%mod;
        int[] ans=new int[queries.length];
        int ind=0;
        for(int[] arr:queries){
            int c1=0;
            if(arr[0]>0) c1=cnt[arr[0]-1];
            int k=cnt[arr[1]]-c1;
            int v1=pv[arr[1]];
            int v2=0;
            if(arr[0]>0) v2=(pv[arr[0]-1]);
            long val=(v1-((long)v2*pow[k])%mod + mod)%mod;
            int s1=ps[arr[1]];
            int s2=0;
            if(arr[0]>0) s2=ps[arr[0]-1];
            s1-=s2;
            ans[ind++]=(int)((val*s1)%mod);
        }
        return ans;





        // int[] ans=new int[queries.length];
        // int ind=0;
        // int mod=1000000007;
        // for(int[] i:queries){
        //     long v=0;
        //     for(int j=i[0];j<=i[1];j++){
        //         if(s.charAt(j)=='0') continue;
        //         v=((v*10) + (s.charAt(j)-'0'))%mod;
        //     }
        //     long sum=0;
        //     sum=ps[i[1]];
        //     if(i[0]>0) sum-=ps[i[0]-1];
        //     ans[ind++]=(int)((sum*v)%mod);
        // }
        // return ans;
    }
}