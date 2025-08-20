import java.util.Arrays;
import java.util.Scanner;

public class realizarVotacao {
    public int[] comecarVotacao(String[][] lista) {
        // listagem
        System.out.println("Lista de seus candidatos para votar:");
        for (int i = 0; i < lista.length; i++) {
            System.out.println((i+1)+"º Nome: "+lista[i][0]);
            System.out.println("Código: "+lista[i][1]);
            System.out.println("=====");
        }

        Scanner input = new Scanner(System.in);
        int[] countVetor = new int[lista.length];

        System.out.println("=====COMEÇAREMOS A VOTAÇÃO=====");
        System.out.println("Digite o código do candidato ou 'FIM' para encerrar.");

        // loop para votacao do candidato
        while (true) {
            System.out.print("Irei votar no (Caso queira sair, digite FIM): ");
            String voto = input.nextLine();
            // depois de pedir voto, ele valida se igual palavra fim
            if (voto.equalsIgnoreCase("FIM")) {
                break; // encerra votação
            }
            // valida se botao do voto foi valido igual codigo
            boolean votoValido = false;
            for (int i = 0; i < lista.length; i++) {
                if (lista[i][1].equals(voto)) {
                    countVetor[i]++;
                    votoValido = true;
                    System.out.println("Muito obrigado por votar, tenha um ótimo dia!");
                    System.out.println("Próximo.... ");
                    // se for ele considera contagem
                    break;
                }
            }
            // se nao for, informa que e invalido
            if (!votoValido) {
                System.out.println("Código inválido, tente novamente!");
            }

        }
        return countVetor;
    }
}
