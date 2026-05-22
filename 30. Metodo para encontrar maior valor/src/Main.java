import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int maior = encontrarMaior(numeros);

        System.out.println("Maior valor: " + maior);

        scanner.close();
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
}
