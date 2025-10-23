class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<list2.length;i++){
            map.put(list2[i],i);
        }
        int min=Integer.MAX_VALUE;
        List<String> list=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            if (map.containsKey(list1[i])) {
                int j = map.get(list1[i]);
                int sum = i + j;
                if (sum < min) {
                    min = sum;
                    list.clear();
                    list.add(list1[i]);
                } else if (sum == min) {
                    list.add(list1[i]);
                }
            }
        }
        String[] ans=new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}