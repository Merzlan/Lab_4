public class player extends Character {
    private int health;
    private int level;
    private int attackPower;

    public player(String name, int health, int level, int attackPower) {
        super(name); // Вызов конструктора базового класса
        this.health = health;
        this.level = level;
        this.attackPower = attackPower;
    }

    @Override
    public void printInfo() {
        System.out.println("Персонаж: " + this.name +
                           "\nЗдоровье: " + this.health +
                           "\nУровень: " + this.level +
                           "\nСила атаки: " + this.attackPower);
    }
}