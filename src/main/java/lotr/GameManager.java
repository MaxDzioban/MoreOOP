package lotr;
public class GameManager {
    public void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }
            // Print the status of each character
            System.out.println(c1);
            System.out.println(c2);
        }

        // Announce the result
        if (!c1.isAlive() && !c2.isAlive()) {
            System.out.println("It's a tie!");
        } else if (!c1.isAlive()) {
            System.out.println(c2.getClass().getSimpleName() + " wins!");
        } else {
            System.out.println(c1.getClass().getSimpleName() + " wins!");
        }
    }
}
