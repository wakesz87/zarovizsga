//Ha meghívod a Husky feed() metódusát, akkor a boldágságértéke néggyel nőjjön! Ha a play() metódusát, akkor a
// paraméterként átadott órák száma szorozva hárommal nőjjön a boldogságértéke!
package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog {
    public Husky(String name) {
        super(name);
    }

    @Override
    public void feed() {
        increaseHappiness(4);
    }

    @Override
    public void play(int hours) {
        increaseHappiness(hours*3);
    }
}
