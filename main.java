public class main {
    public static void main(String[] args) {
        // Работа с массивом объектов
        player[] players = {
            new player("Радан", 100, 1, 10),
            new player("Маления", 80, 2, 15),
            new player("Годфри", 90, 1, 12)
        };

        System.out.println("Игроки в игре:");
        for (player player : players) {
            player.printInfo();
        }

        System.out.println("\nКоличество созданных игроков: " + player.getPlayerCount());

        // Работа с массивом объектов Item
        item[] items = {
            new item("Меч", 100),
            new item("Щит", 150),
            new item("Зелье здоровья", 50)
        };

        // Возврат результата через вспомогательный класс
        Result itemAnalysis = item.analyzeItems(items);
        System.out.println(itemAnalysis.getMessage());
        System.out.println("Общая стоимость предметов: " + itemAnalysis.getTotalValue());

        // Обработка исключений
        try {
            System.out.println("\nПопытка деления на ноль:");
            int result = divide(10, 0); // Инициирует исключение
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        // Работа со строками
        System.out.println("\nРабота со строками:");
        String playerName = "    Радан    ";
        System.out.println("Исходное имя: \"" + playerName + "\"");
        System.out.println("Обрезанное имя: \"" + playerName.trim() + "\"");
        System.out.println("Имя в верхнем регистре: \"" + playerName.trim().toUpperCase() + "\"");
    }

    // Метод с исключением
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return a / b;
    }
}
