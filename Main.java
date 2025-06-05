import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);
        double Température;
        String unité;
        double nouvelleTemp ;

        System.out.print("Entrez la température :");
        Température = f.nextDouble();

        System.out.print("Convert to Celius or Fahrenheit ? (C or F) :");
        unité = f.next().trim().toUpperCase();
        
        if( !unité.equals("C") && !unité.equals("F")){
            System.out.println("Unité invalide. Veuillez entrer uniquement C ou F.");
        }
        

        nouvelleTemp = (unité.equals("C")) ? (Température - 32) * 5 / 9 : (Température * 5 / 9 ) + 32;

        System.out.printf("%.1f%s", nouvelleTemp, unité);
        
        f.close();

    }
}