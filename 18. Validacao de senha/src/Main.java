import java.util.Scanner;
public class Main {
    public static void main(String[] gets) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String S = s.nextLine();
        while(!S.equals ("java123")){
            System.out.println("Senha incorreta.");
            S = s.nextLine();
        }
        System.out.println("Acesso permitido.");
    }
}