//void addDog(Dog dog) - hozzáaad egy kutyát
//feedAll() - összes kutya feed() metódusát meghívja
//Dog findByName(String name) - kikeresi a kutyát név alapján, kivételt dob, ha nem találja
//void playWith(String name, int hours) - a paraméterként megadott kutyát kikeresi, és meghívja a play() metódusát az átadott hours paraméterrel
//List<String> getHappyDogNames(int minHappiness) - visszaadja azon kutyák neveit, melyeknek boldogsága nagyobb, mint a paraméterként átadott érték
package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Kennel {
    private List<Dog> dogs = new ArrayList<>();

    public List<Dog> getDogs() {
        return new ArrayList<>(dogs);
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void feedAll() {
        for (Dog item : dogs) {
            item.feed();
        }

    }

    public Dog findByName(String name) {
        Dog search = null;
        for (Dog i : dogs) {
            if (i.name.equals(name)) {
            search = i;
            }
        }
        if (Objects.isNull(search)) {
            throw new IllegalArgumentException("Cannot find dog: " + name);
        }
        return search;

    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> search = new ArrayList<>();
        for (Dog i : dogs) {
            if (i.getHappiness() > minHappiness) {
                search.add(i.getName());
            }
        }
        return search;
    }

    public void playWith(String name, int hours) {
        findByName(name).play(hours);
    }
}
