package For;

import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int inicio,fim;

        System.out.println("\nDigite o primeiro número do intervalo: ");
        inicio = leia.nextInt();

        System.out.println("\nDigite o último número do intervalo: ");
        fim = leia.nextInt();

        if (inicio >= fim) {
            System.out.println("\nIntervalo inválido");
        }else {
            System.out.println("\nNo intervalo entre " + inicio + "e" + fim + ":");
            for (int i = inicio; i <= fim; i++) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println(i+"\né múltiplo de 3 e 5");
            }
        }

        leia.close();
    }
}
