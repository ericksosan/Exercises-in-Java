/*
    2. Implemente el algoritmo de Euclides para encontrar el mcd de dos
    números leídos desde teclado.
*/
import java.util.Scanner;
public class mcd {
    public static void main(String[] args){
        int mayor, menor, mini, maxi, resul;
            Scanner leer = new Scanner(System.in);
                do {
                        System.out.print("Digite el numero mayor: ");
                        mayor = leer.nextInt();
                            if (mayor < 0) {
                                System.out.println("El numero debe ser > 0");
                            }
                } while (mayor < 0);

                do {
                    System.out.print("Digite el numero menor: ");
                    menor = leer.nextInt();
                        if (menor < 0) {
                            System.out.println("El numero debe ser > 0");
                        }
                } while (menor < 0);

                    maxi = Math.max(mayor, menor);
                    mini = Math.min(mayor, menor);
                    resul = 0;

                do {
                    resul = mini;
                    mini = maxi % mini;
                    maxi = resul;
                } while (mini != 0);
                System.out.println("M.C.D es: " +resul);
    }
}
