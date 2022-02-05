/*
    4- Crear un programa que pida al usuario 10 números enteros y luego ordénelos en
    orden descendentes utilizando el método de burbujas y muestre los números
    después de ordenados.
*/
package segundaTareaArreglos;

import java.util.Scanner;

public class sortBurbujaMeto {
    public static void main(String[] args) {
        int arr[] = new int[10], i, j, aux;
            Scanner leer = new Scanner(System.in);
        
        for( i = 0; i < arr.length; i++){
            System.out.print("Digite el valor de la P["+(i + 1)+"]: ");
                arr[i] = leer.nextInt();
        } 

        System.out.print("\n\tLista no Ordenada\n");
        for ( int e : arr) {
            System.out.print(e+"| ");
        }

        System.out.print("\n");
        System.out.print("\n\tLista Ordenada\n");
        
        for(i = 0; i < arr.length - 1; i++){
            for(j = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j + 1]){
                    aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        for (int r : arr) {
            System.out.print(r+"| ");
        }
    }
}
