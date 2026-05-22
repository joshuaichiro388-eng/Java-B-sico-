import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            boolean resultado = ehPar(numero);

            mostrarResultado(numero, resultado);
        }

        scanner.close();
    }

    public static boolean ehPar(int numero) {

        return numero % 2 == 0;
    }

    public static void mostrarResultado(int numero, boolean resultado) {

        if (resultado) {

            System.out.println(numero + " é par.");

        } else {

            System.out.println(numero + " é ímpar.");
        }
    }
}
