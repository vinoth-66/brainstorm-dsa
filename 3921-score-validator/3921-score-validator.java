class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0,counter=0;
        for(String str:events){
            try{
                int v=Integer.parseInt(str);
                if((v>=0 && v<=6)) score+=v;
            }
            catch(Exception e){
                if(str.equals("WD") || str.equals("NB")) score++;
                else counter++;
            } 
            if(counter==10) break;
        }
        return new int[]{score,counter};
    }
}