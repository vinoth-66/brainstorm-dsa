class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] arr=startTime.split(":");
        String[] arr2=endTime.split(":");
        int h=Integer.parseInt(arr2[0])-Integer.parseInt(arr[0]);
        int min=Integer.parseInt(arr2[1])-Integer.parseInt(arr[1]);
        int s=Integer.parseInt(arr2[2])-Integer.parseInt(arr[2]);
        h*=(60*60);
        min*=60;
        return s+h+min;
    }
}