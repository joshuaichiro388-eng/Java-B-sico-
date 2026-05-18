import java.util.Scanner;
public class Main {
    public static void main(String[] gets) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int I = s.nextInt();
        int J = Calcular(I);
        System.out.println("O resultado e: " + J);
    }
    public static int Calcular(int I){
        int R = 0;
        for(int i = 0; i <= I; i++){
            R += i;
        }
        return R;
    }
}
