package doWhile;

import java.util.Scanner;

public class exercicioSeis {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num,somaMult3=0,contMult3=0;
        float mediaMult3;

        do {
            System.out.println("\nEntre com um número inteiro: ");
            num = leia.nextInt();

            if(num == 0) {
                System.out.println("\nVocê digitou ZERO, vamos finalizar o programa");
            }else {
                if(num % 3 == 0) {
                    somaMult3 += num;
                    contMult3++;
                }
            }
        }while(num != 0);

        if(contMult3 == 0) {
            System.out.println("\nNão foi possível achar a média...");
        }else {
            mediaMult3 = somaMult3 / contMult3;
            System.out.println("\nA média foi de: "+mediaMult3);
        }

        leia.close();
    }
}