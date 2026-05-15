import java.util.Scanner;
void main() {
    Scanner s = new Scanner(System.in);
    System.out.println("Digite o seu nome: ");
    String nome = s.nextLine();
    System.out.println("Digite a idade: ");
    int idade = s.nextInt();
    s.nextLine();
    System.out.println("Digite o curso: ");
    String curso = s.nextLine();
    System.out.println("Olá, " + nome + "! Você tem " + idade + " anos e está matriculada no curso de " + curso);
    s.close();
}
