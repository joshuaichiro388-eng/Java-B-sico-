class ItemPedido {

    String nomeProduto;
    int quantidade;
    double precoUnitario;

    public double calcularSubtotal() {

        return quantidade * precoUnitario;
    }
}

class Pedido {

    String nomeCliente;
    ItemPedido[] itens;

    public double calcularTotal() {

        double total = 0;

        for (ItemPedido item : itens) {

            total += item.calcularSubtotal();
        }

        return total;
    }
}

public class Main {

    public static void main(String[] args) {

        ItemPedido item1 = new ItemPedido();
        item1.nomeProduto = "Mouse";
        item1.quantidade = 2;
        item1.precoUnitario = 50;

        ItemPedido item2 = new ItemPedido();
        item2.nomeProduto = "Teclado";
        item2.quantidade = 1;
        item2.precoUnitario = 100;

        Pedido pedido = new Pedido();

        pedido.nomeCliente = "Carlos";

        pedido.itens = new ItemPedido[]{item1, item2};

        System.out.println("Total: " + pedido.calcularTotal());
    }
}