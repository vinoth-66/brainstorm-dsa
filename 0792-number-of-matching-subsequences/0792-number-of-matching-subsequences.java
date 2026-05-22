class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<Character,List<Integer>> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)) map.put(c,new ArrayList<>());
            map.get(c).add(i);
        }
        int ans=0;
        for(String str:words){
            if(vin(str,map)) ans++;
        }
        return ans;
    }
    private boolean vin(String str,Map<Character,List<Integer>> map){
        int p=-1;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!map.containsKey(c)) return false;
            List<Integer> temp=map.get(c);
            int ind=Collections.binarySearch(temp,p+1);
            if(ind<0) ind=-ind-1;
            if(ind==temp.size()) return false;
            p=temp.get(ind);
        }
        return true;
    }
}