//A DigitsCounter osztálynak legyen egy int getCountOfDigits(String s) metódusa,
// mely megszámolja, hogy hány különböző számjegy van a bemeneti Stringben.
package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s){
        Set<Character> digits = new HashSet<>();
        if(s == null || s.isBlank()){
            return 0;
        }

        char[] chars = s.toCharArray();
        for (char c : chars){
            if(Character.isDigit(c)){
                digits.add(c);
            }
        }
        return digits.size();
    }

}
