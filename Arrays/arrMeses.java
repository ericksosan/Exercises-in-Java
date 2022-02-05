/*
    2. Un programa que almacene en una tabla el número de días que tiene cada mes
    (supondremos que es un año no bisiesto), pida al usuario que le indique un mes
    (1=enero, 12=diciembre) y muestre en pantalla el número de días que tiene ese mes.
*/
package segundaTareaArreglos;

import java.util.Scanner;

public class arrMeses {
    public static void main(String[] args) {
    int num;
        Scanner leer = new Scanner(System.in);

        String[] nameMonth = new String[]{"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OBTUBRE","NOVIEMBRE","DICIEMBRE"};
        int[] dayMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("\nElegir el numero de mes deseado\n");
        for(int i = 0; i < nameMonth.length; i++){
            System.out.println((i + 1)+") " + nameMonth[i]);
        }

            
            do{     
                System.out.print("\nRespuesta: ");
                num = leer.nextInt();
                    if(num <= 0 || num > 12){
                        System.out.println("\nEl N tiene que estar entre 1 y 12");
                    }
            }while(num <= 0 || num > 12);

        System.out.println("El mes #" + (num)+" Es " + nameMonth[num - 1] + " Su cantidad de dia Es: " + dayMonth[num - 1]);
    }
}
