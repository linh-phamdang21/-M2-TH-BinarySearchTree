public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Linh");
        tree.insert("Nguyen");
        tree.insert("Thu");
        tree.insert("Phuong Anh");

        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
