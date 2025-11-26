class Solution {
    public int countSeniors(String[] details) {
        int ans=0;
        for(int i=0;i<details.length;i++){
            int comp=Integer.parseInt(details[i].substring(11,13));
            if(comp>60) ans++;
        }
        return ans;
    }
}