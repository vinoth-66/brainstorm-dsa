class Solution {
    public List<Integer> findGoodIntegers(int n) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i*i*i<=n;i++){
            for(int j=i;(j*j*j)+(i*i*i)<=n;j++){
                int sum=(j*j*j)+(i*i*i);
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>=2) ans.add(m.getKey());
        }
        Collections.sort(ans);
        return ans;
    }
}