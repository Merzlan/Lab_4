// Абстрактный класс GameEntity
public abstract class GameEntity {
    protected String name;
    protected int health;

    public GameEntity(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void printInfo(); // Абстрактный метод
}
