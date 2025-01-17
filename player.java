public class player {
    private String name;
    private int health;
    private int level;
    private int attackPower;

    public player(String name, int health, int level, int attackPower) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.attackPower = attackPower;
    }

    public void printInfo() {
        System.out.println("Персонаж: " + name +
                           "\nЗдоровье: " + health +
                           "\nУровень: " + level +
                           "\nСила атаки: " + attackPower);
    }
}