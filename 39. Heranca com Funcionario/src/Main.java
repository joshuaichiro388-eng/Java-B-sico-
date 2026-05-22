class Funcionario {

    String nome;
    double salarioBase;

    public double calcularSalario() {

        return salarioBase;
    }
}

class FuncionarioComum extends Funcionario {
}

class Gerente extends Funcionario {

    @Override
    public double calcularSalario() {

        return salarioBase * 1.2;
    }
}

public class Main {

    public static void main(String[] args) {

        FuncionarioComum funcionario = new FuncionarioComum();

        funcionario.nome = "Pedro";
        funcionario.salarioBase = 2000;

        Gerente gerente = new Gerente();

        gerente.nome = "Marcos";
        gerente.salarioBase = 5000;

        System.out.println(funcionario.nome + ": " +
                funcionario.calcularSalario());

        System.out.println(gerente.nome + ": " +
                gerente.calcularSalario());
    }
}
