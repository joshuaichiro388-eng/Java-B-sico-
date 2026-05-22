public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {

        this.titular = titular;
    }

    public void depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {

        if (valor > 0 && valor <= saldo) {

            saldo -= valor;

        } else {

            System.out.println("Operação inválida");
        }
    }

    public double getSaldo() {

        return saldo;
    }

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Maria");

        conta.depositar(500);

        conta.sacar(200);

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
