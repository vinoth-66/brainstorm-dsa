class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int r=matches.length;
        int v=0;
        for(int i=0;i<r;i++){
            v=matches[i][1];
            map.put(v,map.getOrDefault(v,0)+1);
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> in2=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<r;i++){
            if(!map.containsKey(matches[i][0])) set.add(matches[i][0]);
        }
        List<Integer> in1=new ArrayList<>(set);
        Collections.sort(in1);
        ans.add(in1);
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==1) in2.add(m.getKey());
        }
        Collections.sort(in2);
        ans.add(in2);
        return ans;
    }
}