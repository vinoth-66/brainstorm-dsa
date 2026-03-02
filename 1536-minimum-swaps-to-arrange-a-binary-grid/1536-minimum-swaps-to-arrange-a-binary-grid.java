class Solution {
    public int minSwaps(int[][] grid) {
        int[] arr=new int[grid.length];
        int in=0;
        for(int[] i:grid){
            int c=0;
            for(int j=i.length-1;j>=0;j--){
                if(i[j]==0) c++;
                else break;
            }
            arr[in++]=c;
        }

        int ans=0;
        for(int i=0;i<arr.length-1;i++){
            int j=i;
            while(j<arr.length && arr[j]<arr.length-1-i) j++;
            if(j==arr.length) return -1;
            ans+=(j-i);
            int v=arr[j];
            for(int k=j;k>i;k--){
                arr[k]=arr[k-1];
            }
            arr[i]=v;
        }
        return ans;
    }
}