import java.util.Scanner;
public class Main {
    public static void main(String[] gets) {
        Scanner s = new Scanner(System.in);
        int N[] = new int[5];
        System.out.println("Digite 5 numeros inteiros: ");
        for(int i = 0; i < 5; i++){
            N[i] = s.nextInt();
        }
        System.out.println("Os numeros digitados foram: ");
        for(int i = 0; i < 5; i++){
            System.out.println(N[i]);
        }
    }
}