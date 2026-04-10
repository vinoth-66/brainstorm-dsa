class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr=new char[s.length()];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            arr[indices[i]]=s.charAt(i);
        }
        for(char c:arr){
            sb.append(c);
        }
        return sb.toString();
    }
}