import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        preencherVetor(numeros, scanner);

        int maior = encontrarMaior(numeros);
        int menor = encontrarMenor(numeros);

        mostrarResultado(maior, menor);

        scanner.close();
    }

    public static void preencherVetor(int[] numeros, Scanner scanner) {

        System.out.println("Digite 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
    }

    public static int encontrarMaior(int[] numeros) {

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }

    public static int encontrarMenor(int[] numeros) {

        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }

    public static void mostrarResultado(int maior, int menor) {

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}