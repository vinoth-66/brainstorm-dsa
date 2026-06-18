class Solution {
    public double angleClock(int hour, int minutes) {
        double d=Math.abs(30*hour-(11*minutes/2.0));
        if(d>180){
            return 360-d; 
        }
        return d;
    }
}