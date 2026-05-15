import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite duas notas de um aluno");
        double N1 = s.nextDouble();
        double N2 = s.nextDouble();
        double M = calcularMedia(N1, N2);
        String R = resultado(M);
        System.out.println("Media: " + M);
        System.out.println("Situação final: " + R);
        s.close();
    }
    public static double calcularMedia(double N1, double N2){
        return (N1 + N2) / 2;
    }
    public static String resultado(double M){
        if (M >= 7) {
            return "Aprovado";
        } else if (M >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
