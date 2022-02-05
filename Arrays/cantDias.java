/* 
    3 - Un programa que almacene en una tabla el número de días que tiene cada mes (año
    no bisiesto), pida al usuario que le indique un mes (ej. 2 para febrero) y un día (ej.
    el día 15) y diga qué número de día es dentro del año (por ejemplo, el 15 de febrero
    sería el día número 46, el 31 de diciembre sería el día 365).
*/
package segundaTareaArreglos;
import java.util.Scanner;

public class cantDias {
    public static void main(String[] args) {
        int num, sum = 0, userDay = 0, sumTotal = 0;
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
            
            if(num == 12){
            }else{
                do{     
                    System.out.print("\nIndique un numero de dias del mes elegido: ");
                    userDay = leer.nextInt();
                        if(userDay< 0 || userDay > 365){
                            System.out.println("\nEl N tiene que estar entre 1 y 365");
                        }
                }while(userDay<= 0 || userDay > 365);
            }
            

            if(num == 1){
                
                System.out.print(nameMonth[0] + " + ");
                System.out.print(+ userDay);
                System.out.println("\nLa cantidad de dias transcurrido es: "+userDay);
            }
            else if(num == 12){
                for(int j = 0;  j < (num - 1); j++){
                    System.out.print(nameMonth[j] + " + ");
                }
                System.out.print(+ userDay);
                System.out.print("\n");
                for(int j = 0;  j <= (num - 1); j++){
                    System.out.print(+dayMonth[j] + " + ");
                    sum += (dayMonth[j]);
                }
                System.out.print(+ userDay + " = " + sum);
                System.out.println("\nLa cantidad de dias transcurrido es: "+sum);
            }
            else{
                for(int j = 0;  j < (num - 1); j++){
                    System.out.print(nameMonth[j] + " + ");
                }
                System.out.print(+ userDay);
                System.out.print("\n");
                for(int j = 0;  j < (num - 1); j++){
                    System.out.print(dayMonth[j] + " + ");
                    sum += (dayMonth[j]);
                }
                sumTotal = (sum + userDay);
                System.out.print(+ userDay + " = " + sumTotal);
                System.out.println("\nLa cantidad de dias transcurrido es: "+sumTotal);
            }
    }
}
