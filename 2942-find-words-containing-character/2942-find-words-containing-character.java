class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            if(sb.indexOf(String.valueOf(x))!=-1) ans.add(i);
        }
        return ans;
    }
}