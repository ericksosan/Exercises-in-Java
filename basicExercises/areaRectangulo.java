/*
    1. Escribir un programa en Java que calcule el área de un rectángulo
del cual se le proporcionará por el teclado su altura y anchura (números
decimales).

formula es A = b * h
*/
import java.util.Scanner;
public class areaRectangulo {
    public static void main(String[] args){
        float base, height, area;
            Scanner leer = new Scanner(System.in);
                do{
                    System.out.print("\nIntroduzca la base del Rectangulo: ");
                        base = leer.nextFloat();
                            if(base < 0){
                                System.out.println("\nEl numero tiene que ser mayor que 0");
                            }
                }while(base < 0);
                do{
                    System.out.print("\nIntroduzca la altura del Rectangulo: ");
                        height = leer.nextFloat();
                            if(height < 0){
                                System.out.println("\nEl numero tiene que ser mayor que 0");
                            }
                }while(height< 0);
                    area = (base * height);
                System.out.println("\nEl area del rectangulo es: " +area);
    }
}
