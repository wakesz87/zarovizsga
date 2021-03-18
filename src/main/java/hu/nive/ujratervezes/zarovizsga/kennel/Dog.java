//Legyen egy Dog ősosztályod, annak egy name és happiness attribútuma. Az osztályt ne lehessen példányosítani!
// A konstruktora paraméterül kapja meg a kutya nevét! A happiness értéke 0 legyen!
// Legyenek az attribútumokhoz getterek!
// Legyen egy void feed() és egy void play(int hours) metódusa is, de ezek ne legyenek implementálva.
package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {
   protected String name;
   protected int happiness = 0;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    abstract void feed();

    abstract void play(int hours);






}
