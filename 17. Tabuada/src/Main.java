import java.util.Scanner;
public class Main {
    public static void main(String[] gets) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite qual tabuada voce quer ver: ");
        int T = s.nextInt();
        Tabuada(T);
    }
    public static void Tabuada(int T){
        for(int i = 0; i < 10; i++){
            System.out.println(T + " X " + (i + 1) + " = " + T * (i + 1));
        }
    }
}