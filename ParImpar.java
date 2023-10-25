package tema2;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        //1. Declaración de variables
        int num;

        //2. Leer de teclado esa variable
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        //3. Comprobar si es par o impar
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        if (num % 10 == 0) {
            System.out.println("Es múltiplo de 10");
        } else {
            System.out.println("No es múltiplo de 10");
        }


    }
}
