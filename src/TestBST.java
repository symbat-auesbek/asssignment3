public class TestBST {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();
        bst.put(5, "Five");
        bst.put(3, "Three");
        bst.put(7, "Seven");

        System.out.println("Size of BST: " + bst.size());
        for (BST<Integer, String>.Entry entry : bst.iterator()) {
            System.out.println("key is " + entry.key + " and value is " + entry.val);
        }
    }
}