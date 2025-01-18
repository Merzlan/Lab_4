// Класс Item с реализацией клонирования
public class item implements Cloneable {
    private String name;
    private int value;

    public item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Мелкое копирование
    }

    public item deepClone() {
        return new item(this.name, this.value); // Глубокое копирование
    }
}