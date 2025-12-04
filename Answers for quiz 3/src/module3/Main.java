package module3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue =  new ArrayQueue(10);
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        Set<String> usedNames = new HashSet<>();
        List<Player> playersForMatch = new ArrayList<>();

        queue.add(new Player(1,"aceu", 100));
        queue.add(new Player(2,"Sinatraa", 100));
        queue.add(new Player(3,"Subroza", 95));
        queue.add(new Player(4,"ploo", 95));
        queue.add(new Player(5, "Shroud", 150));
        queue.add(new Player(6,"Tenz", 100));
        queue.add(new Player(7,"johnqt", 85));
        queue.add(new Player(8,"Tarik", 100));
        queue.add(new Player(9,"screaM", 109));
        queue.add(new Player(10, "Wardell", 110));

        int nextId = 11;
        int gamesMade = 0;

        System.out.println("=== MATCHMAKING STARTED ===");
        System.out.println("Press ENTER each turn to add players...");

        while (gamesMade < 10) {

            scanner.nextLine();

            int x = rand.nextInt(7) + 1;
            System.out.println("\nTurn: Adding " + x + " new players...");

            for (int i = 0; i < x; i++) {
                String[] names = {
                        "aceu", "Sinatraa", "Subroza", "ploo", "Shroud",
                        "Tenz", "johnqt", "Tarik", "screaM", "Wardell"
                };

                String randomName = names[rand.nextInt(names.length)];
                int randomLevel = rand.nextInt(100) + 1;

                Player p = new Player(nextId, randomName, randomLevel);
                queue.add(p);
                nextId++;
            }

            System.out.println("Current Queue (" + queue.size() + " players):");
            queue.printQueue();

            if (queue.size() >= 5) {
                System.out.println("\n--- GAME STARTING ---");
                System.out.println("Players in Game:");

                while (playersForMatch.size() <5 ) {
                    Player p = queue.remove();

                    if (usedNames.contains(p.getName())) {
                        queue.add(p);
                        continue;
                    }

                    // Otherwise accept player
                    usedNames.add(p.getName());
                    playersForMatch.add(p);
                }

                for (int i = playersForMatch.size() - 1; i > 0; i--) {
                    int j = rand.nextInt(i + 1);
                    Player temp = playersForMatch.get(i);
                    playersForMatch.set(i, playersForMatch.get(j));
                    playersForMatch.set(j, temp);
                }

                for (Player p : playersForMatch)
                {
                    System.out.println(p);
                }

                gamesMade++;
                System.out.println("Game #" + gamesMade + " created!");
                System.out.println("------------------------\n");
            }
        }

        System.out.println("\n=== 10 GAMES COMPLETED — PROGRAM ENDED ===");
    }
}
