//A program feladata egy rombusz területének a kiszámítása az e és f átlók hosszának megadásával.
//Készítette: Molnár Bence, SZOFT II/1/N, 2024.10.03.

import java.util.Scanner;

public class Rombusz {
    public static void main(String[] args) {
        System.out.println("Ez a program kiszámítja egy rombusz területét az e és f átlók segítségével.");
        System.out.println("Molnár Bence, SZOFT II/1/N");

        Scanner scanner = new Scanner(System.in);

        // e átló hossza:
        System.out.print("Kérlek add meg az e átló hosszát cm-ben: ");
        double e = scanner.nextDouble();

        // f átló hossza:
        System.out.print("Kérlek add meg az f átló hosszát cm-ben: ");
        double f = scanner.nextDouble();

        // Terület kiszámítása:
        double terulet = (e * f) / 2;

        // Eredmény kiírása négyzetcentiméterben (cm\u00B2):
        System.out.println("A rombusz területe: " + terulet + " cm²");
        //Sajnos nem mutatja Unicodban és cm^2-t használva se a cm² mértékegységet :(
        //De Remélem jó lesz
    }
}

