class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer,List<Integer>> map=new TreeMap<>();
        for(int i:arr){
            int v=Integer.bitCount(i);
            map.putIfAbsent(v,new ArrayList<>());
            map.get(v).add(i);
        }
        List<Integer> ans=new ArrayList<>();
        for(List<Integer> i:map.values()){
            Collections.sort(i);
            ans.addAll(i);
        }
        int[] res=new int[arr.length];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}