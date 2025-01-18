// Главный класс для демонстрации
public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Использование производного класса
        SpecialAbility fireball = new SpecialAbility("Огненный шар", 50, 10, "Поджигает врагов");
        fireball.printInfo();
        fireball.printEffectOnly();

        // Использование абстрактного класса
        enemy goblin = new enemy("Гоблин", 30, 5);
        goblin.printInfo();

        // Использование интерфейса
        quest mainQuest = new quest("Спасти деревню", "Отразить нападение бандитов");
        mainQuest.interact();
        mainQuest.printInfo();

        // Клонирование
        item sword = new item("Меч", 100);
        item shallowCopy = (item) sword.clone(); // Мелкое копирование
        item deepCopy = sword.deepClone(); // Глубокое копирование

        System.out.println("Оригинал: " + sword.getName() + ", стоимость: " + sword.getValue());
        System.out.println("Мелкая копия: " + shallowCopy.getName() + ", стоимость: " + shallowCopy.getValue());
        System.out.println("Глубокая копия: " + deepCopy.getName() + ", стоимость: " + deepCopy.getValue());
    }
}