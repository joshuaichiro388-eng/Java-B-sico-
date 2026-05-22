import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        mostrarQuantidadeCaracteres(frase);

        mostrarMaiusculas(frase);

        mostrarMinusculas(frase);

        verificarPalavraJava(frase);

        scanner.close();
    }

    public static void mostrarQuantidadeCaracteres(String frase) {

        int quantidade = frase.length();

        System.out.println("Quantidade de caracteres: " + quantidade);
    }

    public static void mostrarMaiusculas(String frase) {

        System.out.println("Maiúsculas: " + frase.toUpperCase());
    }

    public static void mostrarMinusculas(String frase) {

        System.out.println("Minúsculas: " + frase.toLowerCase());
    }

    public static void verificarPalavraJava(String frase) {

        if (frase.toLowerCase().contains("java")) {

            System.out.println("A frase contém a palavra Java.");

        } else {

            System.out.println("A frase não contém a palavra Java.");
        }
    }
}
