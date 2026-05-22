import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];

        preencherNotas(notas, scanner);

        double media = calcularMedia(notas);

        mostrarResultado(media);

        scanner.close();
    }

    public static void preencherNotas(double[] notas, Scanner scanner) {

        System.out.println("Digite as 5 notas:");

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Nota " + (i + 1) + ": ");

            notas[i] = scanner.nextDouble();
        }
    }

    public static double calcularMedia(double[] notas) {

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {

            soma += notas[i];
        }

        return soma / notas.length;
    }

    public static void mostrarResultado(double media) {

        System.out.println("Média geral: " + media);
    }
}