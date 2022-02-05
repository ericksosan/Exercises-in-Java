/*
    5. Realice un programa que permita leer un número entero positivo y exprese dicho en
    notación binaria.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class notacionBinaria {
    public static void main(String[] args) {
        ArrayList<String> binario = new ArrayList<String>();
        int num, resto;
        String binarioString = "";
        Scanner leer = new Scanner(System.in);

        do {
            System.out.print("Digite un numero: ");
                num = leer.nextInt();
                    if (num <= 0) {
                        System.out.println("El N tiene que ser > 0");
                    }
        } while (num <= 0);

        do {
            resto = num % 2;
            num = num/2;
            binario.add(0, Integer.toString(resto));
        } while (num > 2);
        binario.add(0, Integer.toString(num));

        for(int i = 0; i < binario.size(); i++){
            binarioString += binario.get(i);
        }
        System.out.println(binarioString);
    }
}
