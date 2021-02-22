package C1020G1.java_collection_framework.bai_tap.binary_search_tree;

public class BSTTest {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(25);
        tree.insert(15);
        tree.insert(50);
        tree.insert(10);
        tree.insert(22);
        tree.insert(35);
        tree.insert(70);
        tree.insert(4);
        tree.insert(12);
        tree.insert(18);
        tree.insert(24);
        tree.insert(31);
        tree.insert(44);
        tree.insert(66);
        tree.insert(90);
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        tree.postOrder();
        System.out.println();
        tree.preOrder();
        System.out.println();
        System.out.println("The number of nodes is: " + tree.getSize());
        System.out.println(tree.search(25));
        System.out.println(tree.size);
        System.out.println("breath first: ");
        tree.breathFirst();
        tree.deleteNode( 12);
        System.out.println();
        tree.breathFirst();
        System.out.println();
        System.out.println(tree.size);
    }
}
