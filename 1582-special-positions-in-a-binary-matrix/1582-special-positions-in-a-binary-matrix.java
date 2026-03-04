class Solution {
    public int numSpecial(int[][] mat) {
        HashMap<Integer,Integer> row=new HashMap<>();
        HashMap<Integer,Integer> col=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            int c=0;
            int in1=-1;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    c++;
                    in1=j;
                }
            }
            if(c==1) row.put(i,in1);
        }
        for(int j = 0; j < mat[0].length; j++){
            int v = 0;
            int in2 = -1;
            for(int k = 0; k < mat.length; k++){
                if(mat[k][j] == 1){
                    v++;
                    in2 = k;
                }
            }
            if(v == 1) col.put(j, in2);
        }
        int ans = 0;
        for(Map.Entry<Integer,Integer> m:row.entrySet()){
            int a=m.getKey();
            int b=m.getValue();
            if(col.containsKey(b) && col.get(b)==a) ans++;
        }
        return ans;
    }
}