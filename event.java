public class event {
    private String description;
    private boolean isTriggered;

    public event(String description) {
        this.description = description;
        this.isTriggered = false;
    }

    public void trigger() {
        isTriggered = true;
    }

    public void printInfo() {
        System.out.println("Событие: " + description +
                           "\nСработано: " + (isTriggered ? "Да" : "Нет"));
    }
}
