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

public class WorkHours {

        public String minWork(String file) {
            Path path = Path.of(file);
            try (BufferedReader br = Files.newBufferedReader(path)) {
                String line;
                StringBuilder sb = new StringBuilder();
                int minWorkHour = 0;
                while((line = br.readLine()) != null) {
                    minWorkHour = workHourmin(line, sb, minWorkHour);
                }
                return sb.toString();
            } catch (IOException ioe) {
                throw new IllegalStateException("Cannot file", ioe);
            }
        }

        private int workHourmin(String line, StringBuilder sb, int minWorkHour) {
            String[] lineData = line.split(",");
            if (minWorkHour == 0 || Integer.parseInt(lineData[1]) < minWorkHour) {
                minWorkHour = Integer.parseInt(lineData[1]);
                sb.setLength(0);
                sb.append(lineData[0]);
                sb.append(": ");
                sb.append(lineData[2]);
            }
            return minWorkHour;
        }
    }