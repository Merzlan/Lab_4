// Класс Quest, реализующий Interactable
public class quest implements Interactable {
    private String title;
    private String description;
    private boolean isCompleted;

    public quest(String title, String description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }

    public void complete() {
        isCompleted = true;
    }

    @Override
    public void interact() {
        System.out.println("Вы начали квест: " + title);
    }

    public void printInfo() {
        System.out.println("Квест: " + title +
                           "\nОписание: " + description +
                           "\nЗавершен: " + (isCompleted ? "Да" : "Нет"));
    }
}