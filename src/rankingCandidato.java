import java.util.Arrays;
import java.util.Comparator;

public class rankingCandidato {
    public void orderRanking(String[][] lista, int[] votos) {
        // Criar estrutura temporária [nome, código, votos]
        String[][] ranking = new String[lista.length][3];
        for (int i = 0; i < lista.length; i++) {
            ranking[i][0] = lista[i][0]; // nome
            ranking[i][1] = lista[i][1]; // código
            ranking[i][2] = String.valueOf(votos[i]); // votos
        }

        // Ordenar pelo número de votos (coluna 2), descrescente
        Arrays.sort(ranking, Comparator.comparingInt((String[] c) -> Integer.parseInt(c[2])).reversed());

        // Exibir o ranking
        System.out.println("===== RANKING DE CANDIDATOS =====");
        for (int i = 0; i < ranking.length; i++) {
            System.out.println((i+1) + "º Lugar: " + ranking[i][0] + " (Código: " + ranking[i][1] + ") - Votos: " + ranking[i][2]);
        }
    }
}
