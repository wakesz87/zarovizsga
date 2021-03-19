//Legyen egy Dog ősosztályod, annak egy name és happiness attribútuma. Az osztályt ne lehessen példányosítani!
// A konstruktora paraméterül kapja meg a kutya nevét! A happiness értéke 0 legyen!
// Legyenek az attribútumokhoz getterek!
// Legyen egy void feed() és egy void play(int hours) metódusa is, de ezek ne legyenek implementálva.
package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {
   private String name;
   private int happiness = 0;


        public Dog(String name) {
        this.name = name;
    }

    protected void increaseHappiness(int diff){
            happiness += diff;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public abstract void feed();

    public abstract void play(int hours);






}
