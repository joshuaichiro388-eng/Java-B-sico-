class Pessoa {

    String nome;
    int idade;
}

class Aluno extends Pessoa {

    String RA;
    String curso;
}

class Professor extends Pessoa {

    String matricula;
    String disciplina;
}

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "Ana";
        aluno.idade = 20;
        aluno.RA = "123";
        aluno.curso = "Computação";

        Professor professor = new Professor();

        professor.nome = "Carlos";
        professor.idade = 45;
        professor.matricula = "999";
        professor.disciplina = "Java";

        System.out.println(aluno.nome);
        System.out.println(aluno.curso);

        System.out.println();

        System.out.println(professor.nome);
        System.out.println(professor.disciplina);
    }
}
