class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        List<Integer> ans=new ArrayList<>();
        int in=0;
        int m=-1,p=-1;
        while(in<s.length()){
            m=Math.max(m,map.get(s.charAt(in)));
            if(in==m){
                if(p==-1) ans.add(m+1);
                else ans.add(m-p);
                p=m;
                m=-1;
            }
            in++;
        }
        return ans;
    }
}