import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // objetos instaciados....
        Scanner input = new Scanner(System.in);
        CandidatoCadastro cadastro = new CandidatoCadastro();
        realizarVotacao votacao = new realizarVotacao();
        rankingCandidato ranking = new rankingCandidato();

        // variaveis da main....
        int escolha_user;
        int[] votos = null;
        String[][] lista = new String[5][2];

        System.out.println("====SEJA BEM VINDO====");
        System.out.println("Aqui você irá votar no seu futuro síndico.");
        System.out.println("======================");

        do {
            System.out.println("MENU:");
            System.out.println("1- Cadastrar candidatos (Só poderá cadastrar 5)");
            System.out.println("2- Realizar a votação");
            System.out.println("3- Ranking de candidatos");
            escolha_user = input.nextInt();

            switch (escolha_user){
                case 1:
                    lista = cadastro.cadastrarCandidatos();
                    break;
                case 2:
                    if (lista[0][0] == null) {
                        System.out.println("Você tentou iniciar uma votação vazia, adicione os candidatos primeiro!");
                        break;
                    }
                    votos = votacao.comecarVotacao(lista);
                    break;
                case 3:
                    ranking.orderRanking(lista,votos);
                    break;
                default:
                    System.out.println("DIGITE UMA OPÇÃO VÁLIDA!");
            }
        }while (escolha_user!=0);
        input.close();
    }
}

