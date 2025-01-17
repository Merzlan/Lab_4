public class main {
    public static void main(String[] args) {
         // Создаем объект персонажа
         player hero = new player("Hero", 100, 1, 10);
         hero.printInfo();
 
         // Создаем объект локации
         location dungeon = new location("Темное и пугающее подземелье");
         dungeon.addItem(new item("Sword", 150, 0));
         dungeon.printInfo();
 
         // Работа с массивом объектов Player
         player[] players = {
             new player("Радан", 100, 1, 10),
             new player("Маления", 80, 2, 15),
             new player("Годфри", 90, 1, 12)
         };
 
         for (player player : players) {
             player.printInfo();
         }
    }
}