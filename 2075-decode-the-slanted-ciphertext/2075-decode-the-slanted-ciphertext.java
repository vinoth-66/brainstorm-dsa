class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int c=(int)Math.ceil(encodedText.length()/rows);
        int p=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c;i++){
            p=i;
            for(int j=0;j<rows;j++){
                if(p>((j+1)*c)-1) break;
                sb.append(encodedText.charAt(p));
                p+=(c+1);
            }
            
        }
        String ans=sb.toString().stripTrailing();
        return ans;
    }
}