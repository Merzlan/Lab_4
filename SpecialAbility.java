// Производный класс SpecialAbility
public class SpecialAbility extends ability {
    private String effect;

    public SpecialAbility(String name, int power, int cooldown, String effect) {
        super(name, power, cooldown); // Вызов конструктора базового класса
        this.effect = effect;
    }

    @Override
    public void printInfo() {
        super.printInfo(); // Вызов метода базового класса
        System.out.println("Эффект: " + effect);
    }

    public void printEffectOnly() {
        System.out.println("Эффект способности: " + effect); // Перегрузка метода без вызова базового класса
    }
}