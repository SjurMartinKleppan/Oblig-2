package Oblig2;

// Lag et program som beregner og skriver ut summen av alle tall mellom to grenser som brukeren skriver inn.
// Programmet skal starte med å lese inn nedre og øvre grense for summen.
// Dersom innlest øvre grense er mindre enn eller lik nedre grense, skal programmet skrive ut en melding til brukeren om dette og foreta ny innlesing.
// Når godkjente grenser er lest inn, skal programmet beregne nevnte sum og summen skal så skrive den ut som en sum.
// Hvis f. eks. nedre grense er 2 og øvre grense er 8 skal det skrives ut følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35".
// Test ut programmet med nedre grense lik 1 og øvre grense lik 100. Legg inn et linjeskift for hvert 10. tall i summen.

import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String []args){
        String nedreTall = showInputDialog("Skriv inn et nedretall");
        String øvreTall = showInputDialog("Skriv inn et øvretall");
        int tallNedre = Integer.parseInt(nedreTall);
        int tallØvre = Integer.parseInt(øvreTall);
        int sum = 0;
        int antall = 0;
        for (int i = tallNedre; i <= tallØvre; i++){
            if (antall == 10){
                antall = 0;
                System.out.print("\n");
            }
            if (tallØvre <= tallNedre){
                showMessageDialog(null, "Øvretall må være større enn nedretall.");
            }
            else {
                System.out.print(i + " + ");
                sum += i;
                antall ++;
            }
            if (i == tallØvre){
                System.out.print(" = " + sum);
            }
        }
    }
}
