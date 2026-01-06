class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        int var=count(arr[0]);
        sb.append(arr[0]);
        if(arr.length>1) sb.append(" ");
        int h;
        for(int i=1;i<arr.length;i++){
            h=count(arr[i]);
            if(h==var){
                sb.append(fun(arr[i]));
            }
            else sb.append(arr[i]);
            if(i<arr.length-1) sb.append(" "); 
        }
        return sb.toString();
    }
    private int count(String s){
        int v=0;
        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') v++;  
        }
        return v;
    }
    private String fun(String str){
        StringBuilder s=new StringBuilder(str);
        s.reverse();
        // int i=0,j=s.length()-1;
        // while(i<=j){
        //     char t=s.charAt(i);
        //     s.insert(i,s.charAt(j));
        //     s.insert(j,t);
        //     i++;
        //     j--;
        // }
        return s.toString();
    }
}