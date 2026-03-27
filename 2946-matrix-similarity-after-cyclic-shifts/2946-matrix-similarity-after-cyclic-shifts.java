class Solution {
    public boolean areSimilar(int[][] mat, int k) {
    //     int r=mat.length;
    //     int c=mat[0].length;
    //     int[][] arr=new int[r][c];
    //     for(int i=0;i<r;i++){
    //         arr[i]=Arrays.copyOf(mat[i],c);
    //     }
    //     for(int i=0;i<r;i++){
    //         vin(arr,c,k%c,i);
    //     }
    //     for(int i=0;i<r;i++){
    //         for(int j=0;j<c;j++){
    //             if(mat[i][j]!=arr[i][j]) return false;
    //         }
    //     }
    //     return true;
    // }
    // private void vin(int[][] arr,int c,int k,int row){
    //     for(int i=0;i<k;i++){
    //         int[] temp=new int[c];
    //         for(int j=0;j<c;j++){
    //             if(row%2==0){
    //                 if(j==0) temp[c-1]=arr[row][0];
    //                 else temp[j-1]=arr[row][j];
    //             }
    //             else{
    //                 if(j<c-1) temp[j+1]=arr[row][j];
    //                 else temp[0]=arr[row][j];
    //             }
    //         }
    //         arr[row]=temp;
    //     }
    // }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=mat[i][(j+k)%mat[0].length]) return false; 
            }
        }
        return true;
    }
}