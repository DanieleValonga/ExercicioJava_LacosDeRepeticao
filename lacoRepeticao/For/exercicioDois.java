package For;

import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero, contagemPares=0, contagemImpares=0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nDigite o " + i + " número: ");
            numero = leia.nextInt();

            if (numero % 2 == 0) {
                contagemPares++;
            }else {
                contagemImpares++;
            }

        }

        System.out.println("\nTotal de números pares: " + contagemPares);
        System.out.println("\nTotal de números ímpares: " + contagemImpares);

        leia.close();
    }
}
