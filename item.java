public class item {
    private String name;
    private int value;
    private int type;

    public item(String name, int value, int type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int getType() {
        return type;
    }
}
