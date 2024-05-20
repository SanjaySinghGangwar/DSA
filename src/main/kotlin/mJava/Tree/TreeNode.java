package mJava.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    public T value;
    public List<TreeNode<T>> children;

    public TreeNode(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode<T> node) {
        children.add(node);
    }
}