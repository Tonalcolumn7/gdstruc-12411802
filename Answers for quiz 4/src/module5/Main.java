package module5;

public class Main {

    public static void main(String[] args)
    {

        Player ploo = new Player(134,"Plooful",135);
        Player wardell = new Player(536,"TSM Wardell",640);
        Player deadlyJimmy = new Player(32,"Plooful",34);
        Player subroza = new Player(4931,"Subroza",684);
        Player annieDro = new Player(6919,"C9 Annie",593);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(ploo.getUserName(), ploo);
        hashTable.put(wardell.getUserName(), wardell);
        hashTable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashTable.put(subroza.getUserName(), subroza);
        hashTable.put(annieDro.getUserName(), annieDro);

        System.out.println(hashTable.get("Before Removal: \n"));
        hashTable.printHashtable();

        System.out.println("\nRemoving Subroza\n");
        Player removed = hashTable.remove("Subroza");
        System.out.println("Removed: " + removed);

        System.out.println("\nAfter removal:");
        hashTable.printHashtable();
    }
}
