package While;

import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contadorMenores21 = 0;
        int contadorMaiores50 = 0;
        int idade;

        while (true) {
            System.out.println("\nDigite uma idade: ");
            idade = leia.nextInt();

            if (idade < 0) {
                break;
            }
            if (idade < 21) {
                contadorMenores21++;
            }else if (idade > 50) {
                contadorMaiores50++;
            }
        }

        System.out.println("\nTotal de pessoas menores de 21 anos: "+ contadorMenores21);
        System.out.println("\nTotal de pessoas maiores de 50 anos: "+ contadorMaiores50);

        leia.close();
    }
}
