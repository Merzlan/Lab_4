import java.util.ArrayList;
import java.util.List;
public class location {
    private String description;
    private List<item> items;

    public location(String description) {
        this.description = description;
        this.items = new ArrayList<>();
    }

    public void addItem(item item) {
        if (items.size() < 10) {
            items.add(item);
        }
    }

    public void printInfo() {
        System.out.println("Локация: " + description);
        System.out.println("Предметы в локации:");
        for (item item : items) {
            System.out.println("- " + item.getName() + " (Стоимость: " + item.getValue() + ")");
        }
    }
}
