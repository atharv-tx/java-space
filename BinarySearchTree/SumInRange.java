package BinarySearchTree;

public class SumInRange {
    
    static class Node{
        int val ;
        Node left;
        Node right ;

        Node(int val){
            this.val = val;

        }

        public static Node insert(Node node, int val){
            if (node == null) {
                node = new Node(val);
                return node;
                
            }
    
            if (node.val> val) {
                // lefft subtree
                node.left = insert(node.left, val);          
            }
            else{
                //right subtree
                node.right = insert(node.right,  val);
    
            }
            return node;
        }
         static int ans=0;
        static  int dfs(Node node, int low ,int high){

            if(node != null){
                if(low <= node.val &&  node.val <= high){
                    ans += node.val;
                }
            }

            if(low < node.val){
                dfs(node.left, low, high);
            }
           else if(node.val<high){
                dfs(node.right, low, high);
            }
            
            return ans;

        }
      
    public static void main(String[] args) {
        int values[] = {10, 5, 15, 3, 7, 18};
        Node node = null;

        for (int i = 0; i < values.length; i++) {
            node = insert(node, values[i]);

           // rangeSum(10,5,7);
           dfs(node, 7, 15);
        }
    }
}
}
