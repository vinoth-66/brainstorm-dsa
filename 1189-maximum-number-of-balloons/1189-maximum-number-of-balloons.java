class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(char c:text.toCharArray()){
            if(c=='b') b++;
            else if(c=='a') a++;
            else if(c=='l') l++;
            else if(c=='o') o++;
            else if(c=='n') n++;
        }
        int min1=0;
        min1=Math.min(b,Math.min(a,n));
        int min2=0;
        min2=Math.min(o,l);
        if(min1==0 || min2==0) return 0;
        if(min1<min2){
            if(min1*2<=min2) return min1;
            else{
                if(min2%2==0) return min2/2;
                else return (min2-1)/2;
            }
        }
        if(min2<min1){
            if(min2%2==0) return min2/2;
            else return (min2-1)/2;
        }
        return 0;
    }
}