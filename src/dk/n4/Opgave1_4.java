/* OPGAVE 1.4
Beskrivelse: Lille program, der bl.a. indsætter værdier i et array */

package dk.n4;

public class Opgave1_4 {

    public static void main(String[] args) { //Main-metoden eksekveres

        final Object[][] table = new String[4][];
        table[0] = new String[] { "a", "a^2", "a^3", "a^4" };
        table[1] = new String[] { "1", "1", "1", "1" };
        table[2] = new String[] { "2", "4", "8", "16" };
        table[3] = new String[] { "4", "16", "64", "256" };

        for (final Object[] row : table) {
            System.out.format("%-15s%-15s%-15s%-15s\n", row);
        }

    }

}