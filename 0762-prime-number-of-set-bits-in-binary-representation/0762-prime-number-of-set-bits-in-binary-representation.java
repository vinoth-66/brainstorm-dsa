class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            int c=Integer.bitCount(i);
            if(vin(c)) ans++;   
        }
        return ans;
    }
    private boolean vin(int num){
        if(num==1 || num==0) return false; 
        if(num==2) return true; 
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}