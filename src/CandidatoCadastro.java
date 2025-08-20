import java.util.Scanner;

public class CandidatoCadastro {
    public String[][] cadastrarCandidatos() {
        // criacao de instancias pra entrada de dados
        Scanner input_qtd = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        // criacao do menu e recebimento do dados
        System.out.println("=====");
        System.out.println("ANTES DE COMEÇAR, VAMOS VER A QUANTIDADE DE CANDIDATOS QUE IRÃO PARTICIPAR");
        System.out.println("=====");
        System.out.print("Quantos candidatos irá participar? ");
        int qtdCandidato = input_qtd.nextInt();

        // matriz para armazenar os candidatos e seus respectivos codigos
        String[][] listaCandidatos = new String[qtdCandidato][2]; // [nome][numero]

        System.out.println("=====");
        System.out.println("VAMOS COMEÇAR CADASTRANDO SEUS CANDIDATOS");
        System.out.println("=====");

        // loop para registrar
        for (int i = 0; i < listaCandidatos.length; i++) {
            System.out.print("Qual o nome do candidato " + (i + 1) + "? ");
            listaCandidatos[i][0] = input.nextLine();

            System.out.print("Qual o número do candidato " + (i + 1) + "? ");
            listaCandidatos[i][1] = input.nextLine();
        }

        System.out.println("\nCandidatos cadastrados:");
        // loop para demonstracao do que foi salvo
        for (int i = 0; i < listaCandidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": Nome = " + listaCandidatos[i][0] + ", Número = " + listaCandidatos[i][1]);
        }
        System.out.println("===============================");
        return listaCandidatos;
    }
}
