class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids){
        Arrays.sort(asteroids);
        long s=mass;
        for(int i:asteroids){
            if(s>=i) s+=i;
            else return false;
        }
        return true;
    }
}