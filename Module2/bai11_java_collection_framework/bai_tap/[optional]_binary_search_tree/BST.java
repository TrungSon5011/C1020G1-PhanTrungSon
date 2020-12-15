package C1020G1.java_collection_framework.bai_tap.binary_search_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BST<E extends Comparable<E>> extends AbstracTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }
    public BST(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public void inorder(){
        inorder(root);
    }
    public void inorder(TreeNode<E> root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.element+" ");
        inorder(root.right);

    }
    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null){
                if(e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                }
                else if(e.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                }else{
                    return false;
                }
            }
            if(e.compareTo(parent.element) < 0){
                parent.left = createNewNode(e);
            }else{
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }


    private TreeNode<E> createNewNode(E e) {
        return  new TreeNode<E>(e);
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(TreeNode<E> root) {
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.element+" ");
    }

    @Override
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(TreeNode<E> root) {
        if(root == null){
            return;
        }
        System.out.print(root.element+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public boolean search(E elements){
        TreeNode<E> current = root;
        while (current != null){
            if(elements.compareTo(current.element) < 0){
                current = current.left;
            }else if(elements.compareTo(current.element) > 0){
                current = current.right;
            }else{
                return true;
            }
        }
        return false;
    }
    @Override
    public void breathFirst() {
        breathFirst(root);
    }
    protected void breathFirst(TreeNode<E> root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return;
        queue.add(root);
        TreeNode<E> temp;
        while (!queue.isEmpty()) {
            temp = queue.peek();
            System.out.print(queue.poll().element + " ");

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }
    public void deleteNode(E key) {
        root = deleteNode(root, key);
        size -- ;
    }

    public TreeNode deleteNode(TreeNode<E> root, E key) {
        if (root == null) return null;
        if (key.compareTo(root.element) < 0) {
            root.left = deleteNode(root.left, key);
        } else {
            if (key.compareTo(root.element) > 0) {
                root.right = deleteNode(root.right, key);
            } else {
                //if same
                if (root.left == null) return root.right;
                if (root.right == null) return root.left;
                //otherwise, find min at right subtree
                TreeNode<E> temp = root.right;
                while (temp != null) {
                    if (temp.left == null) break;
                    temp = temp.left;
                }
                E min_at_right = temp.element;
                root.element = min_at_right;
                root.right = deleteNode(root.right, min_at_right);
            }
        }

        return root;
    }
//    public TreeNode<E> delete(E element){
//        if(root == null){
//            return root;
//        }
//
//    }
}
