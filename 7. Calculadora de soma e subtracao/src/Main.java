import java.util.Scanner;
void main() {
    Scanner s = new Scanner(System.in);
    System.out.println("Digite dois numero inteiro: ");
    int i = s.nextInt();
    int j = s.nextInt();
    int soma = i + j;
    int sub = i - j;
    int mult = i * j;
    int div = i / j;
    System.out.println("soma: " + soma + "\nSubtração: " + sub + "\nMultiplicação: " + mult + "\nDivisão: " + div);
    s.close();
}
