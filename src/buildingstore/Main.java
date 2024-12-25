package buildingstore;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Добавляем животных
        Animal animal1 = new Animal("Buddy", "Dog", 3, true);
        Animal animal2 = new Animal("Whiskers", "Cat", 2, false);
        Animal animal3 = new Animal("Chirpy", "Bird", 1, true);

        // Выводим список животных
        Animal.listAnimals();
    }
}