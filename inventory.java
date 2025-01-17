import java.util.ArrayList;
import java.util.List;

public class inventory {
    private List<item> items;

    public inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(item item) {
        if (items.size() < 20) {
            items.add(item);
        }
    }

    public void printInfo() {
        System.out.println("Инвентарь:");
        for (item item : items) {
            System.out.println("- " + item.getName() + " (Стоимость: " + item.getValue() + ")");
        }
    }
}