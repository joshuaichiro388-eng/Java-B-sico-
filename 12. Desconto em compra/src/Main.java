import java.util.Scanner;
public class Main {
    public static void main(String[] gets) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor de sua compra: ");
        double V = s.nextDouble();
        double R = VD(V);
        V -= R;
        System.out.println("O desconto e de: " + R + "%");
        System.out.println("Valor total da compra: " + V + "R$");
    }
    public static double VD(double V){
        if(V > 500){
            return V * 0.15;
        }else if(V <= 500 && V >= 200){
            return V * 0.10;
        }else{
            return 0.0;
        }
    }
}