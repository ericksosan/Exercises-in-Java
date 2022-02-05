/*
    8. Realice un programa que solicite una frase y determine la cantidad de vocales 
minúsculas y mayúsculas.
*/
package segundaTareaArreglos;

import java.util.Scanner;

public class vocales {
    public static void main(String[] args) {
        String frase; 
        int mayu = 0, minu = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite una frase: ");
            frase = scan.nextLine();

            for (int x=0; x<frase.length();x++){
                if((frase.charAt(x)=='a') || 
                    (frase.charAt(x)=='e') || 
                    (frase.charAt(x)=='i') || 
                    (frase.charAt(x)=='o') || 
                    (frase.charAt(x)=='u'))
                    {
                    minu++;
                    }
                if((frase.charAt(x)=='A') || 
                    (frase.charAt(x)=='E') || 
                    (frase.charAt(x)=='I') || 
                    (frase.charAt(x)=='O') || 
                    (frase.charAt(x)=='U'))
                    {
                    mayu++;
                    }
            }
            System.out.println();
            System.out.println(" Vocales Minusculas Es De: "+minu);
            System.out.println(" Vocales Mayuscula Es De: "+mayu);
    }
}
