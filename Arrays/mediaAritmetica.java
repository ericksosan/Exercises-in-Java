/*
    1. Elabore un programa que solicite al usuario 4 números, los memorice (utilizando un
    vector), calcule su media aritmética y después muestre en pantalla la media y los
    datos tecleados.
*/
package segundaTareaArreglos;

import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args) {
        float add = 0, res = 0;
            int arr[] = new int[4];
                Scanner leer = new Scanner(System.in);
                    for(int i = 0; i < arr.length; i++){
                            System.out.print("Digite el valor de la P["+(i + 1)+"]: ");
                                arr[i] = leer.nextInt();
                                    add += arr[i];
                    } 
                    for(int i = 0; i < arr.length; i++){
                        res = (add/(i + 1));
                            System.out.print((i == 3) ? arr[i] : arr[i] + " + ");
                    } 
                System.out.print(" = "+ add + " / " + "4" + " = " + res+"%");
    }
}
