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
        return dogs;
    }

    public void addDog(Dog dog){
        dogs.add(dog);
    }

    public void feedAll() {
        for(Dog dog : dogs){
            dog.feed();
        }
    }

    public Dog findByname(String name){
       for(Dog dog : dogs) {
           if(dog.getName().equals(name)){
               return dog;
           }
       }
       throw new IllegalArgumentException("Dog not found with name: " + name);
    }
}
