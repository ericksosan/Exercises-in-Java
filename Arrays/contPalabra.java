/*
    9 - Realice un programa que permita introducir una cadena de caracteres y convierta en 
    mayúscula la primera letra de cada palabra e imprima la cantidad de palabras.
*/
package segundaTareaArreglos;

import java.util.Scanner;

public class contPalabra {
    public static void main(String[] args) {
        String frase, palabras[]; 
        Scanner scan = new Scanner(System.in);


        System.out.print("Digite una frase: ");
            frase = scan.nextLine();

            char[] car = frase.toCharArray(); 

            car[0] = Character.toUpperCase(car[0]);
        for(int i = 0; i < frase.length() - 2; i++){
            if(car[i] == ' ' || car[i] == '.' || car[i] == ','){
                
                car[i + 1] = Character.toUpperCase(car[i + 1]);
            }
        }
        palabras = frase.split("\\s+");
        System.out.println();
        System.out.println(new String(car));
        System.out.println("Cantidad de palabra: " + palabras.length);
    }
}
