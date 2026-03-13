class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(!set.contains(n)){ 
            set.add(n);
            int s=0;
            while(n!=0){
                int r=n%10;
                s+=(r*r);
                n/=10;
            }
            
            n=s;
        }
        return n==1;
    }
}