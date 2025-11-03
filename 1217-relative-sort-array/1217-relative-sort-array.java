class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr2) set.add(i);
        for(int i:arr1){
            if(set.contains(i)) map1.put(i,map1.getOrDefault(i,0)+1);
            else map2.put(i,map2.getOrDefault(i,0)+1);
        }
        int in=0;
        int[] ans=new int[arr1.length];
        for(int i=0;i<arr2.length;i++){
            int v=map1.get(arr2[i]);
            for(int j=0;j<v;j++){
                ans[in++]=arr2[i];
            }
        }
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> map:map2.entrySet()){
            int v=map.getValue();
            for(int i=0;i<v;i++){
                list.add(map.getKey());
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            ans[in++]=list.get(i);
        }
        return ans;
    }
}