class Result {
    private String message;
    private int totalValue;

    public Result(String message, int totalValue) {
        this.message = message;
        this.totalValue = totalValue;
    }

    public String getMessage() {
        return message;
    }

    public int getTotalValue() {
        return totalValue;
    }
}

public class item {
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

    public static Result analyzeItems(item[] items) {
        int totalValue = 0;
        StringBuilder names = new StringBuilder();

        for (item item : items) {
            totalValue += item.getValue();
            names.append(item.getName()).append(", ");
        }

        String message = "Список предметов: " + names.toString();
        return new Result(message, totalValue);
    }
}