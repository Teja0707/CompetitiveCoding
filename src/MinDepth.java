class TNode {
    int val;
    TNode left;
    TNode right;
    TNode() {}
    TNode(int val) { this.val = val; }
    TNode(int val, TNode left, TNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class MinDepth {

    public static void main(String[] args) {

        TNode Rleft = new TNode(15);
        TNode Rright = new TNode(7);
        TNode left = new TNode(9);
        TNode right = new TNode(20,Rleft,Rright);
        TNode root = new TNode(3,left,right);

        System.out.println(minDepth(root));
    }


    public static int minDepth(TNode root) {

            System.out.println("root.val " + root.val);


            if(root == null) return 0;

            if(root.left == null && root.right == null)return 1;

            if(root.right != null)return minDepth(root.right)+1;

            if(root.left != null)return minDepth(root.left)+1;

            return Math.min(minDepth(root.left),minDepth(root.right))+1;


        }
}
