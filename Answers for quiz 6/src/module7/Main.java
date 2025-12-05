package module7;

public class Main {

    public static void main(String[] args)
    {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(68);
        tree.insert(55);

       tree.traverseInOrder();
       System.out.println("\nGetting value 25: " +tree.get(25));

        System.out.println("\nMin: " + tree.getMin());
        System.out.println("Max: " + tree.getMax());

        System.out.println("\nDescending Order: ");
        tree.traverseInDescendingOrder();
    }
}
