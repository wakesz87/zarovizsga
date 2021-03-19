//A WorkHours osztályban implementáld a String minWork(String file) metódust! A metódus paraméterként megkapja egy fájl elérési útvonalát.
//A fájl formátuma: John Doe,8,2021-01-01
//A dolgozó neve, mennyi órát dolgozott egy nap, és a nap. Azt kell visszaadni, hogy ki melyik nap dolgozott a legkevesebbet.
// A fenti fájl alapján John Doe 2021-01-04-én csak 2 órát dolgozott, így a következő Stringet kell visszaadni: John Doe: 2021-01-04.
// Egy napra, egy alkalmazotthoz mindig csak egy sor van.
package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WorkHours {

       public String minWork(String path){
           try{
               List<String> lines = Files.readAllLines(Path.of(path));

               return findmin(lines);
           }catch (IOException ioe){
               throw new IllegalStateException("Can not read file", ioe);
           }
       }

    private String findmin(List<String> lines) {
           int minHours =  Integer.MAX_VALUE;
           String result = null;
           for(String line : lines ){
               String[]parts = line.split(",");
               String name = parts[0];
               int hours = Integer.parseInt(parts[1]);
               String date = parts[2];

               if (minHours > hours){
                   minHours = hours;
                   result = name + ": " + date;
               }
           }
           return result;
    }
}