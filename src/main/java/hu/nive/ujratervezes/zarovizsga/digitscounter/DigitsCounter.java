//A DigitsCounter osztálynak legyen egy int getCountOfDigits(String s) metódusa,
// mely megszámolja, hogy hány különböző számjegy van a bemeneti Stringben.
package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s){

        if(s == null || s.length()==0){
            return 0;
        }
        Set<Character> digits = new HashSet<>();
        char[] chars = s.toCharArray();
        for (char c : chars){
            if(Character.isDigit(c)){
                digits.add(c);
            }
        }
        return digits.size();
    }

}
