import java.util.Scanner;
public class Main {
    public static void main(String[] gets) {
        Scanner s = new Scanner(System.in);
        int N[] = new int[8];
        System.out.println("Digite 8 numeros inteiros para ver a soma e a media: ");
        for(int i = 0; i < 8; i++){
            N[i] = s.nextInt();
        }
        int R = Calcular(N);
        System.out.println("A soma de todos os numeros e: " + R);
        System.out.println("A media desses numeros e: " + (R / 8));
    }
    public static int Calcular(int N[]){
        int M = 0;
        for(int i = 0; i < 8; i++){
            M += N[i];
        }
        return M;
    }
}