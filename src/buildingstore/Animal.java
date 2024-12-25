package buildingstore;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private static final List<Animal> animals = new ArrayList<>();
    private String name;
    private String type;
    private int age;
    private boolean vaccinated;

    public Animal(String name, String species, int age, boolean vaccinated) {
        this.name = name;
        this.type = species;
        this.age = age;
        this.vaccinated = vaccinated;
        animals.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public static void listAnimals() {
        if (animals.isEmpty()) System.out.println("No animals found.");
        else {
            System.out.println("Animals list:");
            for (Animal animal : animals) {
                System.out.printf("Name: %s, Type: %s, Age: %d, Vaccinated: %s%n",
                        animal.name, animal.type, animal.age, animal.vaccinated ? "Yes" : "No");
            }
        }
    }
}

