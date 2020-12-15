package C1020G1.java_collection_framework.bai_tap.binary_search_tree;

public interface Tree<E> {
    public boolean insert(E e);
    public void inorder();
    public int getSize();
    public void postOrder();
    public void preOrder();
    public void breathFirst();
}
