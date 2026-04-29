class Solution {
    public String sortVowels(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        Map<Character,Integer> ind=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isVow(c)){
                freq.put(c,freq.getOrDefault(c,0)+1);
                if(!ind.containsKey(c)) ind.put(c,i);
            }
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->{
            if(!freq.get(a).equals(freq.get(b))){
                return freq.get(b)-freq.get(a);
            }
            return ind.get(a)-ind.get(b);
        });
        pq.addAll(freq.keySet());
        StringBuilder ans=new StringBuilder();
        int f=0;
        char v=' ';
        for(char c:s.toCharArray()){
            if(isVow(c)){
                if(f==0){
                    v=pq.poll();
                    f=freq.get(v);
                }
                ans.append(v);
                f--;
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
    private boolean isVow(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return true;
        return false;
    }
}