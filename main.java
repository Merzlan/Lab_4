import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Создаем список игровых объектов
        List<GameEntity> entities = new ArrayList<>();

        // Добавляем объекты базового и производного классов
        entities.add(new enemy("Гоблин", 30, 5));
        entities.add(new enemy("Орк", 50, 10));
        entities.add(new enemy("Дракон", 200, 50));
        entities.add(new enemy("Волк", 20, 7));

        // Выводим исходный список
        System.out.println("Исходный список игровых объектов:");
        for (GameEntity entity : entities) {
            entity.printInfo();
            System.out.println();
        }

        // Сортировка по здоровью
        Collections.sort(entities, new Comparator<GameEntity>() {
            @Override
            public int compare(GameEntity e1, GameEntity e2) {
                return Integer.compare(e1.health, e2.health);
            }
        });

        // Вывод отсортированного списка
        System.out.println("Список после сортировки по здоровью:");
        for (GameEntity entity : entities) {
            entity.printInfo();
            System.out.println();
        }

        // Поиск объекта по имени
        String searchName = "Орк";
        GameEntity foundEntity = entities.stream()
                                         .filter(entity -> entity.name.equals(searchName))
                                         .findFirst()
                                         .orElse(null);

        if (foundEntity != null) {
            System.out.println("Найден объект:");
            foundEntity.printInfo();
        } else {
            System.out.println("Объект с именем \"" + searchName + "\" не найден.");
        }
    }
}