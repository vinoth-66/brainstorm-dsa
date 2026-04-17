class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int[] index=new int[nums.length];
        Set<Integer> set=new HashSet<>();
        for(int i:queries) set.add(i);
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],new ArrayList<>());
            if(set.contains(i)) index[i]=map.get(nums[i]).size();
            map.get(nums[i]).add(i);
        }
        int len=nums.length;
        List<Integer> ans=new ArrayList<>();
        for(int i:queries){
            if(map.get(nums[i]).size()<2) ans.add(-1);
            else{
                int fr=-1,bk=-1;
                List<Integer> list=map.get(nums[i]);
                int min=Integer.MAX_VALUE;
                int in=i;
                int ind=index[i];
                if(list.size()-1>ind){
                    int b=list.get(ind+1);
                    min=Math.min(min,Math.min(b-in,len-b+in));
                }
                else{
                    int a=list.get(0);
                    min=Math.min(min,Math.min(in-a,len-in+a));
                }
                if(ind>0){
                    int a=list.get(ind-1);
                    min=Math.min(min,Math.min(in-a,len-in+a));
                }
                else{
                    int b=list.get(list.size()-1);
                    min=Math.min(min,Math.min(b-in,len-b+in));
                }

                // for(int j=0;j<list.size()-1;j++){
                //     int a=list.get(j),b=list.get(j+1);
                //     fr=b-a;
                //     bk=len-b+a+1;
                //     min=Math.min(min,Math.min(fr,bk));
                // }
                ans.add(min);
            }
        }
        return ans;
    }
}