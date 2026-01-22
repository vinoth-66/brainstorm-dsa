class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums) list.add(i);
        int ans=0;
        while(true){
            if(sort(list)) return ans;
            int val=fun(list);
            ans++;
            int j=0;
            while(j<list.size()-1){
                if(list.get(j)+list.get(j+1)==val){
                    list.set(j,list.get(j)+list.get(j+1));
                    list.remove(j+1);
                    break;
                }
                else j++;
            }
        }
        // return ans;
    }
    private boolean sort(List<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)) return false;
        }
        return true;
    }
    private int fun(List<Integer> list){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)+list.get(i+1)<min){
                min=list.get(i)+list.get(i+1);
            }
        }
        return min;
    }
}