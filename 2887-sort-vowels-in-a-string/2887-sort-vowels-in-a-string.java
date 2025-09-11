class Solution {
    public String sortVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        List<Character> list=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u'){
            list.add(c);
            }
        }
        Collections.sort(list);
        int in=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='A' || sb.charAt(i)=='a' || sb.charAt(i)=='E' || sb.charAt(i)=='e' || sb.charAt(i)=='I' || sb.charAt(i)=='i' || sb.charAt(i)=='O' || sb.charAt(i)=='o' || sb.charAt(i)=='U' || sb.charAt(i)=='u'){
                sb.setCharAt(i,list.get(in++));
            }
        }
        return sb.toString();
    }
}