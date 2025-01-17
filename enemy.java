public class enemy {
    private String name;
    private int health;
    private int attackPower;

    public enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void printInfo() {
        System.out.println("Существо: " + name +
                           "\nЗдоровье: " + health +
                           "\nСила атаки: " + attackPower);
    }
}
