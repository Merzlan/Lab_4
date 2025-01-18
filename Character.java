public abstract class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printInfo(); // Абстрактный метод
}