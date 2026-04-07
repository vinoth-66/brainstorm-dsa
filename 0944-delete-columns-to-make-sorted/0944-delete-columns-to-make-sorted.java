class Solution {
    public int minDeletionSize(String[] strs) {
        int ans=0;
        int r=strs.length;
        int c=strs[0].length();
        for(int i=0;i<c;i++){
            for(int j=0;j<r-1;j++){
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
    // private boolean asc(String s){
    //     for(int i=0;i<s.length()-1;i++){
    //         if(s.charAt(i)<s.charAt(i+1)) continue;
    //         else return false;
    //     }
    //     return true;
    // }   
    // private boolean desc(String s){
    //     for(int i=0;i<s.length()-1;i++){
    //         if(s.charAt(i)>s.charAt(i+1)) continue;
    //         else return false;
    //     }
    //     return true;
    // }
}