package mJava;


import mJava.BinarySearchTree.BST;
import mJava.LinkedList.DLL;
import mJava.LinkedList.mLinkedList;
import mJava.Queue.mQueue;
import mJava.Stack.CustomStack;
import mJava.Stack.mStack;
import mJava.Tree.TreeNode;
import mJava.Tree.*;

public class Main {
    public static void main(String[] args) {
//        linkedList();
//        Stack();
//        Queue();
//        Tree();
//        BST();

//        DLL dll = new DLL();
//        dll.inserAtFirst(3 );
//        dll.inserAtFirst(2 );
//        dll.inserAtFirst(1 );
//        dll.insetAtEnd(4 );
//        dll.insetAtEnd(5 );
//        dll.reverse();
//        dll.display();


        CustomStack customStack = new CustomStack(10);
        customStack.push(4);
        customStack.push(2);
        customStack.push(1);
        customStack.push(1);
        customStack.push(1);
        customStack.push(1);
        customStack.push(1);
        customStack.push(1);
        customStack.push(1);
        customStack.push(10);
        customStack.push(100);
        System.out.println("PEEK :: "+customStack.search(100));
        customStack.printStack();

        System.out.println("PEEK :: "+customStack.peek());
        System.out.println("SIZE IS :: "+customStack.size());

    }

    private static void BST() {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);

        System.out.println("Inorder traversal:");
        bst.inorderTraversal();

        System.out.println("\nSearch for 4: " + bst.search(4));
        System.out.println("Search for 6: " + bst.search(6));
    }

    private static void Tree() {
        TreeNode<String> rootNode = new TreeNode<>("Root");
        TreeNode<String> child1 = new TreeNode<>("Child 1");
        TreeNode<String> child2 = new TreeNode<>("Child 2");
        TreeNode<String> subChild1 = new TreeNode<>("Sub Child 1");
        TreeNode<String> subChild2 = new TreeNode<>("Sub Child 2");
        TreeNode<String> SanjayNode = new TreeNode<>("SANJAY Parent Node");
        TreeNode<String> SanjayChildOne = new TreeNode<>("SANJAY Child Node ONE");
        TreeNode<String> SanjayChildTwo = new TreeNode<>("SANJAY Child Node Two");
        TreeNode<String> SanjayChildThree = new TreeNode<>("SANJAY Child Node Three");

        rootNode.addChild(child1);
        rootNode.addChild(child2);

        child1.addChild(subChild1);
        child1.addChild(subChild2);

        subChild1.addChild(SanjayNode);

        SanjayNode.addChild(SanjayChildOne);
        SanjayNode.addChild(SanjayChildTwo);
        SanjayNode.addChild(SanjayChildThree);


        Tree<String> tree = new Tree<>(rootNode);
        tree.printTree();
    }

    private static void Queue() {
        mQueue<Integer> queue = new mQueue<>(5);
        System.out.println("Is queue empty: " + queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Queue: " + queue);
        System.out.println("Cleared queue");
        queue.clear();
        System.out.println("Queue: " + queue);
    }


    public static void linkedList() {
        mLinkedList linkedList = new mLinkedList();
        linkedList.insert(3);
        linkedList.insert(7);
        linkedList.insert(12);
        linkedList.insert(12);

        linkedList.insertAtBeginning(0);
        linkedList.insertAtEnd(6);

        linkedList.insertAtPosition(2, 0);

        linkedList.printList();
        linkedList.reverse();
        linkedList.delete(mLinkedList.currentHead, 2);
        System.out.println("---------------------------");
        linkedList.printList();
    }

    public static void Stack() {
        mStack stack = new mStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println("Size :: " + stack.size());
        System.out.println("SEARCH :: " + stack.searchItem(100));

        stack.printStack();
    }
}