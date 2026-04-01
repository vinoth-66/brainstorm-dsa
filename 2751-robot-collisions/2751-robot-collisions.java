class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int[][] mat=new int[positions.length][3];
        for(int i=0;i<positions.length;i++){
            mat[i][0]=positions[i];
            mat[i][1]=healths[i];
            mat[i][2]=(directions.charAt(i)=='R')?1:0;
        }
        Arrays.sort(mat,(a,b)->a[0]-b[0]);
        Stack<int[]> st=new Stack<>();
        for(int[] cur:mat){
            while(!st.isEmpty() && st.peek()[2] == 1 && cur[2] == 0){
                int[] top=st.pop();
                if(top[1]==cur[1]){
                    cur[1]=0;
                    break;
                }
                else if(top[1]>cur[1]){
                    top[1]-=1;
                    cur[1]=0;
                    st.push(top);
                    break;
                }
                else{
                    cur[1]-=1;
                }
            }
            if(cur[1]>0) st.push(cur);
        }
        List<Integer> ans=new ArrayList<>();
        if(st.isEmpty()) return ans;
        HashMap<Integer,Integer> map=new HashMap<>();
        int in=0;
        while(!st.isEmpty()){
            int[] inner=st.pop();
            map.put(inner[0],inner[1]);
        }
        for(int i=0;i<positions.length;i++){
            if(map.containsKey(positions[i])) ans.add(map.get(positions[i]));
        }
        return ans;
    }
}