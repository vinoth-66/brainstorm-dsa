class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(String.valueOf(i));
        }
        Collections.sort(list);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(Integer.parseInt(list.get(i)));
        }
        return ans;
    }
}