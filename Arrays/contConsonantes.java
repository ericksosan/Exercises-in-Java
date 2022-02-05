/*
    10.Cree un programa que solicite una cadena de caracteres y cuente las vocales, 
    consonantes, números y caracteres especiales
*/
package segundaTareaArreglos;

import java.util.Scanner;

public class contConsonantes {
    public static void main(String[] args) {
        String frase; 
        int voc = 0, cons = 0, num = 0, carEsp = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite una frase: ");
            frase = scan.nextLine();

            for (int x=0; x<frase.length();x++){
                if((frase.charAt(x)=='a') || 
                    (frase.charAt(x)=='e') || 
                    (frase.charAt(x)=='i') || 
                    (frase.charAt(x)=='o') || 
                    (frase.charAt(x)=='u') || 
                    (frase.charAt(x)=='A') || 
                    (frase.charAt(x)=='E') || 
                    (frase.charAt(x)=='I') || 
                    (frase.charAt(x)=='O') || 
                    (frase.charAt(x)=='U'))
                    {
                        voc++;
                    }
                    
                    char letra = frase.charAt(x);
                        if (esConsonante(letra)) {
                            cons++;
                        }

                    if (Character.isDigit(frase.charAt(x))) {
                        num++;
                    }

                    if((frase.charAt(x) == '+')||
                        (frase.charAt(x) == '-')||
                        (frase.charAt(x) == '*')||
                        (frase.charAt(x) == '/')||
                        (frase.charAt(x) == '=')||
                        (frase.charAt(x) == '%')||
                        (frase.charAt(x) == '&')||
                        (frase.charAt(x) == '#')||
                        (frase.charAt(x) == '!')||
                        (frase.charAt(x) == '?')||
                        (frase.charAt(x) == '~')||
                        (frase.charAt(x) == ','))
                    {
                        carEsp++;
                    }
            }
            System.out.println();
            System.out.println("Cantidad de vocales: " + voc);
            System.out.println("Cantidad de Consonantes: " + cons);
            System.out.println("Cantidad de Numeros: " + num);
            System.out.println("Cantidad de caracteres especiales:" + carEsp);
    }
    public static boolean esConsonante(char letra) {
		return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
	}
}

