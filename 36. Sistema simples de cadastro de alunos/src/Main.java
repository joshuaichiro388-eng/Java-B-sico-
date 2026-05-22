import java.util.Scanner;

class Aluno {

    String nome;
    String RA;
    double media;
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {

            alunos[i] = new Aluno();

            System.out.print("Nome: ");
            alunos[i].nome = scanner.nextLine();

            System.out.print("RA: ");
            alunos[i].RA = scanner.nextLine();

            System.out.print("Média: ");
            alunos[i].media = scanner.nextDouble();
            scanner.nextLine();
        }

        double soma = 0;

        System.out.println("\nTodos os alunos:");

        for (Aluno aluno : alunos) {

            System.out.println(aluno.nome + " - " + aluno.media);

            soma += aluno.media;
        }

        System.out.println("\nAprovados:");

        for (Aluno aluno : alunos) {

            if (aluno.media >= 7) {

                System.out.println(aluno.nome);
            }
        }

        System.out.println("\nMédia geral: " + soma / alunos.length);

        scanner.close();
    }
}
