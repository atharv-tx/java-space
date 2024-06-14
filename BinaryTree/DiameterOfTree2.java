public class DiameterOfTree2 {

    static class Node{
        int data;
        Node left ;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height((root.left));
        int rh = height(root.right);

      return   Math.max(lh, rh)+1;
    }


 // approach one Time Complexity is O(n^2)
    public static int  diameteroftree2(Node root){
        if(root==null){
            return 0;
            }
        
            int leftDiam = diameteroftree2(root.left);
            int leftHt = height(root.left);

            int rightDiam = diameteroftree2(root.right);
            int rightHt = height(root.right);

            int selfDiam = leftHt+rightHt+1;

            return Math.max( selfDiam, Math.max(rightDiam, leftDiam));


    }

    static class Info {
        int diam;
        int ht ;

        public Info(int diam, int ht ){
            this.diam = diam;
            this.ht = ht;

        }
    }

    public static Info DiameterofTree(Node root){

        Info leftInfo = DiameterofTree(root.left);
        Info rightInfo = DiameterofTree(root.right);

        int diam =Math.max (Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht +1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(0,0);
    }
    
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameteroftree2(root));
    }
    
}







