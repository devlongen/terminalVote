import java.util.Scanner;

public class CandidatoCadastro {
    public String[][] cadastrarCandidatos() {
        Scanner input = new Scanner(System.in);
        String[][] listaCandidatos = new String[5][2]; // [nome][numero]

        System.out.println("=====");
        System.out.println("VAMOS COMEÇAR CADASTRANDO SEUS CANDIDATOS");
        System.out.println("=====");


        for (int i = 0; i < listaCandidatos.length; i++) {
            System.out.print("Qual o nome do candidato " + (i + 1) + "? ");
            listaCandidatos[i][0] = input.nextLine();

            System.out.print("Qual o número do candidato " + (i + 1) + "? ");
            listaCandidatos[i][1] = input.nextLine();
        }

        System.out.println("\nCandidatos cadastrados:");
        for (int i = 0; i < listaCandidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": Nome = " + listaCandidatos[i][0] + ", Número = " + listaCandidatos[i][1]);
        }
        System.out.println("===============================");
        return listaCandidatos;
    }
}
