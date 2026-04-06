class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<List<Integer>> set=new HashSet<>();
        for(int[] i:obstacles){
            List<Integer> list=new ArrayList<>();
            list.add(i[0]);
            list.add(i[1]);
            set.add(list);
        }
        char track='n';
        int op=1,ind=1;
        int x=0,y=0;
        int ans=0;
        for(int i=0;i<commands.length;i++){
            if(commands[i]<0){
                if(track=='n' && commands[i]==-1){
                    track='e';
                }
                else if(track=='n' && commands[i]==-2){
                    track='w';
                }
                else if(track=='s' && commands[i]==-1){
                    track='w';
                }
                else if(track=='s' && commands[i]==-2){
                    track='e';
                }
                else if(track=='e' && commands[i]==-1){
                    track='s';
                }
                else if(track=='e' && commands[i]==-2){
                    track='n';
                }
                else if(track=='w' && commands[i]==-1){
                    track='n';
                }
                else if(track=='w' && commands[i]==-2){
                    track='s';
                }
            }
            if(track=='n'){
                op=1;
                ind=1;
            }
            else if(track=='s'){
                op=0;
                ind=1;
            }
            else if(track=='e'){
                op=1;
                ind=0;
            }
            else{
                op=0;
                ind=0;
            }
            if(i==0 && set.contains(Arrays.asList(0,0))){
                for(int v=0;v<commands[i];v++){
                    if(op==0){
                        if(ind==0){
                            if(v!=0){
                                if(set.contains(Arrays.asList(x-1,y))){
                                    break;
                                }
                            }
                            x-=1;
                        }
                        else{
                            if(v!=0){
                                if(set.contains(Arrays.asList(x,y-1))){
                                    break;
                                }
                            }
                            y-=1;
                        }
                    }
                    else{
                        if(ind==0){
                            if(v!=0){
                                if(set.contains(Arrays.asList(x+1,y))){
                                    break;
                                }
                            }
                            x+=1;
                        }
                        else{
                            if(v!=0){
                                if(set.contains(Arrays.asList(x,y+1))){
                                    break;
                                }
                            }
                            y+=1;
                        }
                    }
                    ans=Math.max((x*x)+(y*y),ans);
                }
            }
            else{
                for(int v=0;v<commands[i];v++){
                    if(op==0){
                        if(ind==0){
                            if(set.contains(Arrays.asList(x-1,y))){
                                    break;
                            }
                            x-=1;
                        }
                        else{
                            if(set.contains(Arrays.asList(x,y-1))){
                                    break;
                            }
                            y-=1;
                        }
                    }
                    else{
                        if(ind==0){
                            if(set.contains(Arrays.asList(x+1,y))){
                                    break;
                            }
                            x+=1;
                        }
                        else{
                            if(set.contains(Arrays.asList(x,y+1))){
                                    break;
                            }
                            y+=1;
                        }
                    }
                    ans=Math.max((x*x)+(y*y),ans);
                }
            }
        }
        return ans;
    }
}