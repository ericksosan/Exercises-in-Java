/*
    3. Escriba un programa que lea temperaturas expresadas en grados
    Fahrenheit y las convierta a grados Celsius mostrándola. El programa finalizará
    cuando lea un valor de temperatura igual a 999. La conversión de grados Farenheit
    (F) a Celsius (C) está dada por C = 5/9(F − 32).
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class temFahrenheitCel {
    public static void main(String[] args){
        DecimalFormat roundF = new DecimalFormat("#.##");
        float fahrenheit, celcius; 
            Scanner leer = new Scanner(System.in);
        do {
            System.out.print("\nDigite el grado Fahrenheit: ");
                fahrenheit = leer.nextFloat();
            
                celcius = (fahrenheit - 32) * 5/9;

                System.out.println("\n"+fahrenheit +"°F = "+roundF.format(celcius)+"°C");
        } while (fahrenheit != 999);
        if(fahrenheit == 999){
            System.out.println("Termino el programa");
        }
    }
}

