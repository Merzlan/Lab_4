public class ability {
    private String name;
    private int power;
    private int cooldown;

    public ability(String name, int power, int cooldown) {
        this.name = name;
        this.power = power;
        this.cooldown = cooldown;
    }

    public void printInfo() {
        System.out.println("Способность: " + name +
                           "\nСила: " + power +
                           "\nПерезарядка: " + cooldown);
    }
}
