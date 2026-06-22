/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,List<String>> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int[] i:descriptions){
            set.add(i[1]);
            if(!map.containsKey(i[0])){
                map.put(i[0],new ArrayList<>());
            }
            StringBuilder s=new StringBuilder(String.valueOf(i[1]));
            if(i[2]==1){
                s.append(1);
            }
            else{
                s.append(0);
            }
            map.get(i[0]).add(s.toString());
        }
        int h=-1;
        for(int[] i:descriptions){
            if(!set.contains(i[0])){
                h=i[0];
                break;
            }
        }
        return vin(h,map);
    }
    public TreeNode vin(int h,Map<Integer,List<String>> m){
        if(!m.containsKey(h)){
            if(h==-1) return null;
            return new TreeNode(h);
        }
        TreeNode root=new TreeNode(h);
        int l=-1;
        int r=-1;
        List<String> list=m.get(h);
        for(int i=0;i<list.size();i++){
            String s=list.get(i);
            if(s.charAt(s.length()-1)=='1'){
                l=Integer.parseInt(s);
                l/=10;
            }
            else{
                r=Integer.parseInt(s);
                r/=10;
            }
        }
        root.left=vin(l,m);
        root.right=vin(r,m);
        return root;
    }
}