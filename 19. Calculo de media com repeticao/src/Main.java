import java.util.Scanner;
public class Main {
    public static void main(String[] gets) {
        Scanner s = new Scanner(System.in);
        double I = 0;
        double R = 0;
        int E = 0;
        System.out.println("Digite a nota dos alunos para ver a media deles digite -1 para parar: ");
        while(I != -1){
            I = s.nextDouble();
            R += I;
            E++;
        }
        System.out.println("A media e: " + (R+1) / (E-1));
    }
}