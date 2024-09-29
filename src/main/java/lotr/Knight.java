package lotr;
import java.util.Random;
import kick.KickStrategy;

public class Knight extends Character {
    private static KickStrategy kickStrategy;

    public Knight() {
        super(0, 0, kickStrategy);
        Random random = new Random();
        this.setPower(random.nextInt(11) + 2);  // Random power between 2 and 12
        this.setHp(random.nextInt(11) + 2);     // Random hp between 2 and 12
    }

    @Override
    public void kick(Character opponent) {
        int damage = new Random().nextInt(this.getPower()) + 1;
        int enemyHp = opponent.getHp();
        if (damage >= enemyHp) {
            opponent.setHp(0);
        } else {
            opponent.setHp(enemyHp - damage);
        }
    }
}