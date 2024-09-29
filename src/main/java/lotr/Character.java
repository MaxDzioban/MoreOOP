package lotr;
import kick.KickStrategy;
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;

    // Конструктор для ініціалізації значень
    public Character(int hp, int power, KickStrategy kickStrategy) {
        this.hp = hp;
        this.power = power;
        this.kickStrategy = kickStrategy;
    }

    // Геттер для hp
    public int getHp() {
        return hp;
    }

    // Сеттер для hp
    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    // Геттер для power
    public int getPower() {
        return power;
    }

    // Сеттер для power
    public void setPower(int power) {
        this.power = power;
    }

    // Метод для атаки на суперника
    public void kick(Character opponent) {
        kickStrategy.kick(this, opponent);
    }

    // Метод перевірки, чи персонаж живий
    public boolean isAlive() {
        return getHp() > 0;
    }

    // Метод для представлення персонажа у вигляді рядка
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
