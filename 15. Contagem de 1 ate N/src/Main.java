import java.util.Scanner;
public class Main {
    public static void main(String[] gets) {
    Scanner s = new Scanner(System.in);
    System.out.println("Digita um numero: ");
    int N = s.nextInt();
    for(int i = 0; i < N; i++){
        System.out.println(i + 1);
    }
    }
}