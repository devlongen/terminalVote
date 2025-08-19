import java.util.Arrays;
import java.util.Scanner;

public class realizarVotacao {
    public int[] comecarVotacao(String[][] lista) {
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

        while (true) {
            String voto = input.nextLine();

            if (voto.equalsIgnoreCase("FIM")) {
                break; // encerra votação
            }

            boolean votoValido = false;
            for (int i = 0; i < lista.length; i++) {
                if (lista[i][1].equals(voto)) {
                    countVetor[i]++;
                    votoValido = true;
                    break;
                }
            }

            if (!votoValido) {
                System.out.println("Código inválido, tente novamente!");
            }
        }
        return countVetor;
    }
}
