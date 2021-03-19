// Konstruktornak meg lehessen adni a nevet! Ha meghívod a Beagle feed() metódusát, akkor a boldágságértéke kettővel nőjjön!
// Ha a play() metódusát, akkor a paraméterként átadott órák száma szorozva kettővel nőjjön a boldogságértéke!
package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.HashSet;
import java.util.Set;

public class Beagle extends Dog {
    public Beagle(String name) {
        super(name);
    }

    @Override
    public void  feed() {
      increaseHappiness(2);
    }

    @Override
    public void play(int hours) {
        increaseHappiness(hours*2);
    }
}





