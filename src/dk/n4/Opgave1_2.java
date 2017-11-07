/* OPGAVE 1.2
Beskrivelse: Simpelt program, der deklarerer og initialiserer en variabel og bruger denne variabel i et for-loop */

package dk.n4;

public class Opgave1_2 {

    public static void main(String[] args) { //Main-metoden eksekveres

        String enTekst = "I love Java"; //Deklarerer og initialiserer en variabel i klassen "String"

        for (int i = 0; i < 5; i++) { //Anvender et for-loop til at printe teksten fem gange
            System.out.println(enTekst);
        }

    }

}