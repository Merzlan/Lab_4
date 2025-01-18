// Класс Enemy, наследующий GameEntity
public class enemy extends GameEntity {
    private int attackPower;

    public enemy(String name, int health, int attackPower) {
        super(name, health); // Вызов конструктора базового класса
        this.attackPower = attackPower;
    }

    @Override
    public void printInfo() {
        System.out.println("Существо: " + name +
                           "\nЗдоровье: " + health +
                           "\nСила атаки: " + attackPower);
    }
}