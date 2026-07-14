class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int num=1;
        List<Integer> ans=new ArrayList<>();
        while(true){
            int f=0;
            int temp=num;
            while(true){
                if(temp%10==9){
                    if(temp>=low && temp<=high){
                        ans.add(temp);
                    }
                    if(temp<low){
                        f=1;
                    }
                    break;
                }
                if(temp>=low && temp<=high){
                    ans.add(temp);
                }
                if(temp>high) break;
                int v=temp%10;
                temp*=10;
                v+=1;
                temp+=v;
            }
            if(f==1) break;
            num++;
        }
        Collections.sort(ans);
        return ans;
    }
}