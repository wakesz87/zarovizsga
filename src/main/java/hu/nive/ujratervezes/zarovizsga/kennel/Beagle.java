// Konstruktornak meg lehessen adni a nevet! Ha meghívod a Beagle feed() metódusát, akkor a boldágságértéke kettővel nőjjön!
// Ha a play() metódusát, akkor a paraméterként átadott órák száma szorozva kettővel nőjjön a boldogságértéke!
package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog {
    public Beagle(String name) {
        super(name);
    }

    @Override
    void  feed() {
        happiness +=2;
    }

    @Override
    void play(int hours) {
        happiness += hours * 2;
    }
}





