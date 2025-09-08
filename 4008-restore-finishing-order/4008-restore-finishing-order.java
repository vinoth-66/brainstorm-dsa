class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:friends){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] ans=new int[friends.length];
        int in=0;
        for(int i=0;i<order.length;i++){
            if(map.containsKey(order[i])) ans[in++]=order[i];
        }
        return ans;
    }
}