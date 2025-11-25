class Solution {
    public int splitNum(int num) {
        String str=String.valueOf(num);
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }
        Arrays.sort(arr);
        int n1=0;
        int n2=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                n1=n1*10+arr[i];
            }
            else n2=n2*10+arr[i];
        }
        return n1+n2;
    }
}