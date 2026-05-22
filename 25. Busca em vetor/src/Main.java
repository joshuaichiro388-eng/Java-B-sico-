import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];

        preencherVetor(nomes, scanner);

        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = buscarNome(nomes, nomeBusca);

        mostrarResultado(encontrado);

        scanner.close();
    }

    public static void preencherVetor(String[] nomes, Scanner scanner) {

        System.out.println("Digite 10 nomes:");

        for (int i = 0; i < nomes.length; i++) {

            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
    }

    public static boolean buscarNome(String[] nomes, String nomeBusca) {

        for (int i = 0; i < nomes.length; i++) {

            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                return true;
            }
        }

        return false;
    }

    public static void mostrarResultado(boolean encontrado) {

        if (encontrado) {
            System.out.println("Nome encontrado no vetor.");

        } else {
            System.out.println("Nome não encontrado.");
        }
    }
}