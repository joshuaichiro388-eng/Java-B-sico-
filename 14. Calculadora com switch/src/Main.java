import java.util.Scanner;
public class Main {
    public static void main(String[] gets) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println("Digite:\n1 para adicao\n2 para subtraçao\n3 para multiplicaçao\n4 para divisao.");
        int N = s.nextInt();
        int J = Calcular(N, n1, n2);
        System.out.println("O resultado é: " + J);
    }
    public static int Calcular(int N, int n1, int n2) {
        int R = 0;
        switch (N) {
            case 1:
                return R = n1 + n2;

            case 2:
                return R = n1 - n2;

            case 3:
                return R = n1 * n2;

            case 4:
                return R = n1 / n2;

            default:
                System.out.println("Erro");
        }
        return R;
    }
}