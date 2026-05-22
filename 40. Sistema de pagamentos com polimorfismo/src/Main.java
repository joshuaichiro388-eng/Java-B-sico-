abstract class FormaPagamento {

    public abstract void pagar(double valor);
}

class PagamentoCartaoCredito extends FormaPagamento {

    @Override
    public void pagar(double valor) {

        System.out.println("Pagamento no cartão: " + valor);
    }
}

class PagamentoPix extends FormaPagamento {

    @Override
    public void pagar(double valor) {

        System.out.println("Pagamento via PIX: " + valor);
    }
}

class PagamentoBoleto extends FormaPagamento {

    @Override
    public void pagar(double valor) {

        System.out.println("Pagamento via boleto: " + valor);
    }
}

public class Main {

    public static void main(String[] args) {

        FormaPagamento[] pagamentos = new FormaPagamento[3];

        pagamentos[0] = new PagamentoCartaoCredito();
        pagamentos[1] = new PagamentoPix();
        pagamentos[2] = new PagamentoBoleto();

        for (FormaPagamento pagamento : pagamentos) {

            pagamento.pagar(150);
        }
    }
}
