class Solution {
    public List<String> partitionString(String s) {
        List<String> ans=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append(c);
            if(!set.contains(sb.toString())){
                ans.add(sb.toString());
                set.add(sb.toString());
                sb.setLength(0);
            }
        }
        return ans;
    }
}