import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // instanciado objetos para usar na main (puxando algumas classes da pasta src sem package)
        Scanner input = new Scanner(System.in);
        CandidatoCadastro cadastro = new CandidatoCadastro();
        realizarVotacao votacao = new realizarVotacao();
        rankingCandidato ranking = new rankingCandidato();

        // variaveis da main....
        int escolha_user;
        int[] votos = null;
        String[][] lista = new String[5][2];

        // inicio do programa
        System.out.println("====SEJA BEM VINDO====");
        System.out.println("Aqui você irá votar no seu futuro síndico.");
        System.out.println("======================");

        // loop para reter o usuário dentro do terminal
        do {
            // menu de opções
            System.out.println("MENU:");
            System.out.println("1- Cadastrar candidatos");
            System.out.println("2- Realizar a votação");
            System.out.println("3- Ranking de candidatos");
            System.out.println("0- Sair do programa");
            System.out.print("Qual será sua escolha? ");

            // input do usuario para decidir a sua escolha
            escolha_user = input.nextInt();

            // caso usuário digitar igual casos abaixo vai redirecionar conforme necessidade
            switch (escolha_user){
                case 1:

                    // caso 1, responsavel por cadastrar os candidatos para ter a votacao a escolha do usuario
                    // aqui vai levar para classe que possui metodo para fazer esta ação
                    lista = cadastro.cadastrarCandidatos();
                    break;
                case 2:
                    // caso 2, responsavel por realizar a votacao, mas so ira fazer, se ja tem candidatos cadastrados
                    if (lista[0][0] == null) {
                        System.out.println("========");
                        System.out.println("Você tentou iniciar uma votação vazia, adicione os candidatos primeiro!");
                        System.out.println("========");
                        Thread.sleep(1500);
                        break;
                    }
                    // aqui vai levar pra classe que possui metodo pra fazer esta acao
                    votos = votacao.comecarVotacao(lista);
                    break;
                case 3:
                    // caso 3, responsavel pelo ranqueamento dos candidatos, foi criado uma classe pra trabalhar com os dois dados
                    // validacao pra garantr que nao vai pra tela de ranqueamento antes...
                    if (lista[0][0] == null) {
                        System.out.println("========");
                        System.out.println("Você tentou ver o ranking que não existe ainda, adicione os candidatos primeiro!");
                        System.out.println("========");
                        Thread.sleep(1500);
                        break;
                    }
                    // trabalha com metodo de rank com lista de candidatos e o votos que receberam...
                    ranking.orderRanking(lista,votos);
                    Thread.sleep(2750);
                    break;
                default:
                    // caso padrao, vai usar para caso nenhum cair, aqui ira mais tratar do erro etc
                    if(escolha_user == 0){
                        System.out.println("Muito obrigado por participar, tenha um ótimo dia!");
                    }else {
                    System.out.println("Digite uma opção válida, por gentileza!");
                    }
                    Thread.sleep(1500);
            }
        }while (escolha_user!=0);
        input.close();
    }
}

