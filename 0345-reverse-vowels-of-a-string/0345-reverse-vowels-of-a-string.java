class Solution {
    public String reverseVowels(String s) {
        // char[] arr=st.toCharArray();
        // int s=0,e=arr.length-1;
        // int f1=0,f2=0;
        // while(s<e){
        //     char c1=Character.toLowerCase(arr[s]);
        //     char c2=Character.toLowerCase(arr[e]);
        //     if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u'){
        //         f1=1;
        //     }
        //     else s++;
        //     if(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u'){
        //         f2=1;
        //     }
        //     else e--;
        //     if(f1==1 && 1==f2){
        //         char t=arr[s];
        //         arr[s]=arr[e];
        //         arr[e]=t;
        //         s++;
        //         e--;
        //         f1=0;
        //         f2=0;
        //     }
        // }
        // String str="";
        // for(char c:arr) str+=c;
        // return str;
        StringBuilder sb=new StringBuilder(s);
        StringBuilder v=new StringBuilder();
        for(char ch:s.toCharArray()){
            char c=Character.toLowerCase(ch);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                v.append(ch);
            }
        }
        int in=v.length()-1;
        for(int i=0;i<sb.length();i++){
            char c=Character.toLowerCase(sb.charAt(i));
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                sb.setCharAt(i,v.charAt(in--));
            }
        }
        return sb.toString();
    }
}