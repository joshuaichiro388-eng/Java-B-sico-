import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int soma = somar(numero1, numero2);
        int subtracao = subtrair(numero1, numero2);
        int multiplicacao = multiplicar(numero1, numero2);
        double divisao = dividir(numero1, numero2);

        mostrarResultados(soma, subtracao, multiplicacao, divisao);

        scanner.close();
    }

    public static int somar(int a, int b) {

        return a + b;
    }

    public static int subtrair(int a, int b) {

        return a - b;
    }

    public static int multiplicar(int a, int b) {

        return a * b;
    }

    public static double dividir(int a, int b) {

        if (b == 0) {
            return 0;
        }

        return (double) a / b;
    }

    public static void mostrarResultados(int soma, int subtracao,
                                         int multiplicacao, double divisao) {

        System.out.println("Soma: " + soma);

        System.out.println("Subtração: " + subtracao);

        System.out.println("Multiplicação: " + multiplicacao);

        System.out.println("Divisão: " + divisao);
    }
}
