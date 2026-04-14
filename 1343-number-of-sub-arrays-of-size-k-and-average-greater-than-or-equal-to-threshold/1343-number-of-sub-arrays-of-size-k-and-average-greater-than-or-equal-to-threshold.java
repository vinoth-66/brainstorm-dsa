class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans=0;
        int i=0,j=0;
        int s=0;
        while(j<arr.length){
            if(j-i+1<=k){
                s+=arr[j++];
                continue;
            }
            if(s/k>=threshold) ans++;
            s-=arr[i++];
        }
        if(j-i+1==k+1){
            if(s/k>=threshold) ans++;
        }
        return ans;
    }
}