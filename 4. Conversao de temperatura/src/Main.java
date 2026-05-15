import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a temperatura que voce quer converter de Celsius para Fahrenheit: ");
    double temperatura = scanner.nextDouble();
    double converter = (temperatura * 1.8) + 32;
    System.out.println("A temperatura em Fahrenheit é: " + converter);
    scanner.close();
}
