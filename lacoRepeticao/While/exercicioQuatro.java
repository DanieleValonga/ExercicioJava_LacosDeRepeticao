package While;

import java.util.Scanner;

public class exercicioQuatro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade,idGenero,pessoaDev,somaMedia=0,mediaIdade,totPesquisas=0,devBackend=0,totMulCisETransDevBack=0,totHomCisETransDevMobOverForty=0,totNotBinDevFullBellowThirty=0;
        String opcao = "S";

        while (!opcao.equalsIgnoreCase("N")) {
            System.out.println("\nDigite a idade do Colaborador: ");
            idade = leia.nextInt();

            somaMedia += idade;

            System.out.println("\n\t\tIDENTIDADE DE GÊNERO"+"\n\n1- Mulher Cis"+"\n2- Homem Cis"+"\n3-Não Binário"+"\n4- Mulher Trans"+"\n5- Homem Trans"+"\n6- Outros");
            idGenero = leia.nextInt();

            System.out.println("\n\t\tPESSOA DESENVOLVEDORA"+"\n\n1- Backend"+"\n2- Frontend"+"\n3- Mobile"+"\n4- FullStack");
            pessoaDev = leia.nextInt();

            if (pessoaDev == 1) {
                devBackend += 1;
            }
            if ((idGenero == 1 || idGenero == 4) && pessoaDev == 1) {
                totMulCisETransDevBack += 1;
            }
            if ((idGenero == 2 || idGenero == 5) && pessoaDev == 3 && idade > 40) {
                totHomCisETransDevMobOverForty += 1;
            }
            if (idGenero == 3 && pessoaDev == 4 && idade < 30) {
                totNotBinDevFullBellowThirty += 1;
            }
            totPesquisas +=1;

            System.out.println("\nDigite S para continuar e N para sair");
            leia.nextInt();
            opcao = leia.next();
        }

        mediaIdade = somaMedia / totPesquisas;

        System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+devBackend);
        System.out.println("\nTotal de mulheres Cis e Trans desenvolvedoras Backend: "+totMulCisETransDevBack);
        System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+totHomCisETransDevMobOverForty );
        System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+totNotBinDevFullBellowThirty);
        System.out.println("\nTotal de Pessoas que responderam a pesquisa: "+totPesquisas);
        System.out.println("\nA média de idade das pessoas que responderam à pesquisa: "+mediaIdade);

        leia.close();
    }
}
