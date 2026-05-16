import java.util.Scanner;
public class Main {
    public static void main(String[] gets) {
        Scanner s = new Scanner(System.in);
        String N = "";
        int Id = 0;
        int I = 0;

        while(I != 3) {
            System.out.println("Digit.e\n1 para cadastrar usuario.\n2 para listar usuario.\n3 para sair.");
            I = s.nextInt();
            s.nextLine();
            switch (I) {
                case 1:
                    System.out.println("Cadastrar usuario.\nDigite seu nome: ");
                    N = s.nextLine();
                    System.out.println("Digite sua idade: ");
                    Id = s.nextInt();
                    s.nextLine();
                    break;
                case 2:
                    System.out.println("Usuario cadastrado:\nNome: " + N + "\nIdade: " + Id);
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
        s.close();
    }
}