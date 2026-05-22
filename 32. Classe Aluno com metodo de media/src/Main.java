public class Aluno {

    String nome;
    double nota1;
    double nota2;

    public double calcularMedia() {

        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "Carlos";
        aluno.nota1 = 8;
        aluno.nota2 = 6;

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Média: " + aluno.calcularMedia());
    }
}
