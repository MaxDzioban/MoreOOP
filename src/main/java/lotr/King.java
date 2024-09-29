package lotr;
import java.util.Random;
import kick.KickStrategy;

public class King extends Character {
    private static KickStrategy kickStrategy;
    public King() {
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5, kickStrategy);
    }

    @Override
    public
    void kick(Character opponent) {
        int damage = new Random().nextInt(getPower()) + 1;
        System.out.println("King kicks with power " + damage);
        opponent.setHp(opponent.getHp() - damage);
    }
}
