class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0,j=mat[0].length-1;
        int d1=0,d2=0;
        int d=0;
        if(mat.length%2!=0){
            d=mat[mat.length/2][mat.length/2];
        }
        for(int[] arr:mat){
            d1+=arr[i];
            d2+=arr[j-i];
            i++;
        }
        return d1+d2-d;
    }
}