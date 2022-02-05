/* 
    4. Escriba un programa que use dos bucles for anidados y el operador de
    módulo (%) para detectar e imprimir números primos.
*/
public class numeroPrimos {
    public static void main(String[] args) {
        int i, j, cont = 0;
            System.out.println("Salidas de los numeros Primos");
                for(i = 1; i <= 30; i++){
                    for(j = 2; j <= i; j++){
                        if(i % j == 0){
                            cont++;
                        }
                    }

                    if(cont == 1){
                        System.out.print("|"+ i );
                    }else{
                        cont = 0;
                    }
        }
    }
}
