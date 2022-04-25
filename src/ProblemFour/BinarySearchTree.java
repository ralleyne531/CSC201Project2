package ProblemFour;


import com.sun.source.tree.Tree;

public class BinarySearchTree {
     private static class TreeNode{
        int value;
        TreeNode leftC;
        TreeNode rightC;

        TreeNode(int data){
            this.value = data;
            this.leftC = null;
            this.rightC = null;
        }
    }
    private TreeNode root;

    public TreeNode ArrayToTree(int array[], int low, int high) {
        if (low != high){
            root = new TreeNode(array[low]);
        root.leftC = ArrayToTree(array, (2 * root.value) + 1, high);
        root.rightC = ArrayToTree(array, ((2 * root.value) + 2), high);
    }
        return root;

    }

    public void inOrder_Traversal(TreeNode root){
        inOrder_Traversal(root.leftC);
        System.out.print(root.value);
        inOrder_Traversal(root.rightC);
    }

    public void preOrder_Traversal(TreeNode root){
        System.out.println(root.value);
        preOrder_Traversal(root.leftC);
        preOrder_Traversal(root.rightC);
    }
    public void postOrder_Traversal(TreeNode root){
        System.out.println(root.value);
        postOrder_Traversal(root.leftC);
        postOrder_Traversal(root.rightC);
        System.out.println(root.value);
    }
}

