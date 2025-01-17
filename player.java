public class player {
    private String name;
    private int health;
    private int level;
    private int attackPower;

    private static int playerCount = 0; // Статическое поле для подсчета игроков

    public player(String name, int health, int level, int attackPower) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.attackPower = attackPower;
        playerCount++; // Увеличиваем счетчик игроков
    }

    public static int getPlayerCount() {
        return playerCount; // Статический метод для получения количества игроков
    }

    public void printInfo() {
        System.out.println("Персонаж: " + this.name + // Использование this для ссылки на текущий объект
                           "\nЗдоровье: " + this.health +
                           "\nУровень: " + this.level +
                           "\nСила атаки: " + this.attackPower);
    }

    public String getName() {
        return this.name; // Использование this
    }
}