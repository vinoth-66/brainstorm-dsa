class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb=new StringBuilder();
        String[] str=title.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].length()<3 && i<str.length-1){
                sb.append(str[i].toLowerCase());
                sb.append(" ");
            }
            else if(str[i].length()<3 && i==str.length-1){
                sb.append(str[i].toLowerCase());
            }
            else if(str[i].length()>=3){
                String f=str[i].substring(0,1);
                String e=str[i].substring(1);
                if(i<str.length-1){
                    sb.append(f.toUpperCase());
                    sb.append(e.toLowerCase());
                    sb.append(" ");
                }
                else{
                    sb.append(f.toUpperCase());
                    sb.append(e.toLowerCase());
                }
            }
        }
        return sb.toString();
    }
}