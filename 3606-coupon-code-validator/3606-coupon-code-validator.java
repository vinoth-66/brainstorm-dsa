class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n=code.length;
        PriorityQueue<Map.Entry<Integer,List<String>>> pq=new PriorityQueue<>(
            (a,b)->{
                return a.getKey()-b.getKey();
            }
        );
        Map<Integer,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!code[i].equals("") && isActive[i]!=false && vin(code[i])){
                int k=0;
                if(businessLine[i].equals("electronics")) k=1;
                else if(businessLine[i].equals("grocery")) k=2;
                else if(businessLine[i].equals("pharmacy")) k=3;
                else if(businessLine[i].equals("restaurant")) k=4;
                if(k==0) continue;
                if(!map.containsKey(k)){
                    map.put(k,new ArrayList<>());
                }
                map.get(k).add(code[i]);
            }
        }
        pq.addAll(map.entrySet());
        List<String> ans=new ArrayList<>();
        while(!pq.isEmpty()){
            List<String> inner=pq.poll().getValue();
            Collections.sort(inner);
            ans.addAll(inner);
        }
        return ans;
    }
    private boolean vin(String s){
        String str=s.replaceAll("[^a-zA-Z0-9_]","");
        return str.length()==s.length();
    }
}