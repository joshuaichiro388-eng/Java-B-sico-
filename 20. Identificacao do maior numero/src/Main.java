import java.util.Scanner;
public class Main {
    public static void main(String[] gets) {
        Scanner s = new Scanner(System.in);
        int N;
        int M;
        System.out.println("Digite 10 numeros:");
        for(int i = 0; i < 10; i++){
            N = s.nextInt();
            if(N > M){
                M = N;
            }
        }
        System.out.println("o numero maior e: " + M);
    }
}