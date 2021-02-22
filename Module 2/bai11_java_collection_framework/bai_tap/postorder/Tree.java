package C1020G1.java_collection_framework.bai_tap.postorder;

public interface Tree<E> {
    public boolean insert(E e);
    public void inorder();
    public int getSize();
    public void postOrder();
    public void preOrder();
}
