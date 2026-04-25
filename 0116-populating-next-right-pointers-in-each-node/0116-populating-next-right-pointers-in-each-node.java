/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        List<List<Node>> ans=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Node> inner=new ArrayList<>();
            for(int i=0;i<s;i++){
                Node n=q.poll();
                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);
                inner.add(n);
            }
            ans.add(inner);
        }
        for(int i=ans.size()-1;i>=0;i--){
            List<Node> list=ans.get(i);
            for(int j=0;j<list.size()-1;j++){
                list.get(j).next=list.get(j+1);
            }
        }
        return root;
    }
}