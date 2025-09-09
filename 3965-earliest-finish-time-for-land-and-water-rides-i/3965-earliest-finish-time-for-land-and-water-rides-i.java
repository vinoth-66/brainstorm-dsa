class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int s1=landStartTime[i]+landDuration[i];
                if(waterStartTime[j]<=s1) s1=s1+waterDuration[j];
                else s1=waterStartTime[j]+waterDuration[j];

                int s2=waterStartTime[j]+waterDuration[j];
                if(landStartTime[i]<=s2) s2=s2+landDuration[i];
                else s2=landStartTime[i]+landDuration[i];
                
                min=Math.min(min,Math.min(s1,s2));
            }
        }

        return min;
    }
}