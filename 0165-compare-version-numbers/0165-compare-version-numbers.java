class Solution {
    public int compareVersion(String version1, String version2) {
        String[] str1=version1.split("\\.");
        String[] str2=version2.split("\\.");
        int l1=str1.length,l2=str2.length;
        int i=0,j=0;
        while(i<l1 || j<l2){
            if(i>=str1.length){
                int b=Integer.parseInt(str2[j]);
                if(0>b) return 1;
                else if(b>0) return -1;
                j++;
            }
            else if(j>=str2.length){
                int a=Integer.parseInt(str1[i]);
                if(a>0) return 1;
                else if(0>a) return -1;
                i++;
            }
            else{
                int a=Integer.parseInt(str1[i]);
                int b=Integer.parseInt(str2[j]);
                if(a>b) return 1;
                else if(b>a) return -1;
                i++;
                j++;
            }
        }
        return 0;
    }
}