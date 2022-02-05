/* 
    5. Un programa pida datos al usuario los datos de una matriz de 4x4 y muestra su
    traspuesta (el resultado de intercambiar filas por columnas).
*/
package segundaTareaArreglos;

import java.util.Scanner;

public class tranpuestaMatriz {
    public static void main(String[] args) {
        int f, c; int [][] Matriz = new int [4][4];
            Scanner leer = new Scanner(System.in);
        for(f = 0; f < 4; f++){
            for(c = 0; c < 4; c++){
                System.out.print("Digite la ["+f+"]["+c+"]: ");
                Matriz[f][c] = leer.nextInt();
            }
        }
        System.out.println();
        for(f = 0; f < 4; f++){
            for(c = 0; c < 4; c++){
                System.out.print(" " + Matriz[f][c] + " ");
            }
            System.out.println("");
        }
        System.out.println("\nMatriz Traspuesta");
        for(c = 0; c < 4; c++){
            for(f = 0; f < 4; f++){
                System.out.print(" " + Matriz[f][c] + " ");
            }
            System.out.println("");
        }
    }
}
