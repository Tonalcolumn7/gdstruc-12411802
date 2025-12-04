package module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
    //    List<Player> playerList = new ArrayList<>();

        Player asuna = new Player( 1, "Asuna", 100 );
        Player lethalBacon = new Player( 2, "LethalBacon", 205 );
        Player hpDeskjet = new Player( 3, "HPDeskjet", 34 );

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        playerLinkedList.printList();


        System.out.println("Size: " + playerLinkedList.size());


        System.out.println("Contains Asuna? " + playerLinkedList.contains(asuna));
        System.out.println("Contains LethalBacon? " + playerLinkedList.contains(lethalBacon));


        System.out.println("Index of HPDeskjet: " + playerLinkedList.indexOf(hpDeskjet));
        System.out.println("Index of Asuna: " + playerLinkedList.indexOf(asuna));


        System.out.println("\nRemoving first player...");
        Player removed = playerLinkedList.removeFirst();
        System.out.println("Removed: " + removed);

        playerLinkedList.printList();
        System.out.println("Size after removal: " + playerLinkedList.size());

    }
}
