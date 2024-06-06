package doWhile;

import java.util.Scanner;

public class exercicioCinco {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int soma = 0;
        int numero;

        do {
            System.out.println("\nDigite um número: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }
        }while (numero != 0);

        System.out.println("\nA soma dos números positivos digitados é: "+ soma);

        leia.close();
    }
}
