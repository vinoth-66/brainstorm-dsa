class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer,TreeSet<Integer>> row=new HashMap<>();
        Map<Integer,TreeSet<Integer>> col=new HashMap<>();
        int ans=0;
        for(int[] arr:buildings){
            int r=arr[0];
            int c=arr[1];

            if(!row.containsKey(r)){
                row.put(r,new TreeSet<>());
            }
            row.get(r).add(c);
            if(!col.containsKey(c)){
                col.put(c,new TreeSet<>());
            }
            col.get(c).add(r);
        }

        for(int[] arr:buildings){
            int r=arr[0];
            int c=arr[1];

            TreeSet<Integer> ro=row.get(r);
            TreeSet<Integer> co=col.get(c);


            Integer left=ro.lower(c);
            Integer right=ro.higher(c);
            Integer low=co.lower(r);
            Integer up=co.higher(r);

            if(left!=null && right!=null && low!=null && up!=null) ans++;
        }

        return ans;
    }
}