class Solution {
    public String intToRoman(int num) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(5,"V");
        map.put(8,"VIII");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        map.put(4,"IV");
        map.put(9,"IX");
        map.put(40,"XL");
        map.put(90,"XC");
        map.put(400,"CD");
        map.put(900,"CM");
        int i=1;
        List<String> ans=new ArrayList<>();
        while(num!=0){
            int r=num%10;
            r*=i;
            i*=10;
            num/=10;
            if(r==0) continue;
            if(map.containsKey(r)){
                ans.add(map.get(r));
                continue;
            }
            else{
                int rem=r;
                StringBuilder sb=new StringBuilder();
                while(rem!=0){
                    if(map.containsKey(rem)){
                        sb.append(map.get(rem));
                        break;
                    }
                    else if(rem>=1000){
                        int d=rem/1000;
                        rem=helper(d,1000,rem);
                        vin(d,1000,sb,map);
                    }
                    else if(rem>=500){
                        int d=rem/500;
                        rem=helper(d,500,rem);
                        vin(d,500,sb,map);
                    }
                    else if(rem>=100){
                        int d=rem/100;
                        rem=helper(d,100,rem);
                        vin(d,100,sb,map);
                    }
                    else if(rem>=50){
                        int d=rem/50;
                        rem=helper(d,50,rem);
                        vin(d,50,sb,map);
                    }
                    else if(rem>=10){
                        int d=rem/10;
                        rem=helper(d,10,rem);
                        vin(d,10,sb,map);
                    }
                    else if(rem>=5){
                        int d=rem/5;
                        rem=helper(d,5,rem);
                        vin(d,5,sb,map);
                    }
                }
                ans.add(sb.toString());
            }
        }
        Collections.reverse(ans);
        StringBuilder sb=new StringBuilder();
        for(String val:ans){
            sb.append(val);
        }
        return sb.toString();
    }
    public void vin(int el,int num,StringBuilder sb,Map<Integer,String> map){
        for(int i=0;i<el;i++){
            sb.append(map.get(num));
        }
    }
    public int helper(int c,int num,int rem){
        for(int i=0;i<c;i++) rem-=num;
        return rem;
    }
}