class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list=new ArrayList<>();
        for(String s:operations){
            if(s.equals("+")){
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }
            else if(s.equals("D")){
                list.add((list.get(list.size()-1)*2));
            }
            else if(s.equals("C")){
                list.remove(list.size()-1);
            }
            else list.add(Integer.parseInt(s));
        }
        int sum=0;
        for(int i : list){
            sum+=i;
        }
        return sum;
    }
}