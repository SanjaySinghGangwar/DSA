package mJava.Tree;

public class Tree<T> {
    private TreeNode<T> root;

    public Tree(TreeNode<T> root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void printTree() {
        printTree(root, 0);
    }

    private void printTree(TreeNode<T> node, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println(node.value);
        for (TreeNode<T> child : node.children) {
            printTree(child, level + 1);
        }
    }
}