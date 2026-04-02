class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.getValue().equals(b.getValue())){
                    return a.getKey().compareTo(b.getKey());
                }
                return b.getValue()-a.getValue();
            }
        );
        pq.addAll(map.entrySet());
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().getKey();
        }
        return ans;
    }
}