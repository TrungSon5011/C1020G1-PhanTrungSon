//package C1020G1.java_collection_framework.bai_tap.postorder;
//
//public class BinarySearchTree<E> extends AbstracTree<E> implements Tree<E>  {
//    protected Tree<E> root;
//    protected int size;
//
//    public BinarySearchTree() {
//    }
//    public BinarySearchTree(E [] elements){
//        for(int i = 0; i < elements.length;i++){
//            insert(elements[i]);
//        }
//    }
//    @Override
//    public boolean insert(E e) {
//        if (root == null)
//            root = createNewNode(e);
//        else {
//            Node<E> parent = null;
//            Tree<E> current = root;
//            while (current != null) {
//                if (e.compareTo(current.element) < 0) {
//                    parent = current;
//                    current = current.left;
//                } else if (e.compareTo(current.element) > 0) {
//                    parent = current;
//                    current = current.right;
//                } else
//                    return false;
//            }
//            if (e.compareTo(parent.element) < 0)
//                parent.left = createNewNode(e);
//            else
//                parent.right = createNewNode(e);
//        }
//        size++;
//        return true;
//    }
//
//    private Node<E> createNewNode(E e) {
//        return Node<E>;
//    }
//
//    @Override
//    public void inorder() {
//
//    }
//
//    @Override
//    public int getSize() {
//        return 0;
//    }
//
//    @Override
//    public void postOrder() {
//
//    }
//
//    @Override
//    public void preOrder() {
//
//    }
//}
