import java.util.Scanner;
void main() {
    Scanner s = new Scanner(System.in);
    System.out.println("Quanto você ganha por hora; ");
    double HG = s.nextDouble();
    System.out.println("Quantidade de horas trabalhado no mês; ");
    double Ht = s.nextDouble();
    double R = HG * Ht;
    System.out.println(R);
}
