class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int sub=n-k+1;
        int[] ans=new int[sub];
        for(int i=0;i<sub;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i;j<k+i;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
            PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
                if(a[1]==b[1]) return b[0]-a[0];
                return b[1]-a[1];
            });
            for(Map.Entry<Integer,Integer> m:map.entrySet()){
                pq.offer(new int[]{m.getKey(),m.getValue()});
            }
            int c=0,s=0;
            while(!pq.isEmpty() && c<x){
                int[] v=pq.poll();
                s+=v[0]*v[1];
                c++;
            }
            ans[i]=s;
        }
        return ans;
    }
}