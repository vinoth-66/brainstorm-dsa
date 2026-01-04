class Solution {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> ans=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            String t=words[i];
            for(int j=0;j<n;j++){
                String l=words[j];
                if(i==j || t.charAt(0)!=l.charAt(0)) continue;
                for(int k=0;k<n;k++){
                    String r=words[k];
                    if(k==j || k==i || r.charAt(0)!=t.charAt(3)) continue;
                    for(int v=0;v<n;v++){
                        String b=words[v];
                        if(v==k || v==j || v==i || 
                        b.charAt(0)!=l.charAt(3) || b.charAt(3)!=r.charAt(3)) continue;
                        List<String> inner=new ArrayList<>();
                        inner.add(t);
                        inner.add(l);
                        inner.add(r);
                        inner.add(b);
                        ans.add(inner);
                    }
                }
            } 
        }
        Collections.sort(ans,(a,b)->{
            for(int i=0;i<4;i++){
                int comp=a.get(i).compareTo(b.get(i));
                if(comp!=0) return comp;
            }
            return 0;
        });
        return ans;
    }
}