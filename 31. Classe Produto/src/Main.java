public class Produto {

    String nome;
    double preco;
    int quantidade;

    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.nome = "Mouse";
        p1.preco = 80;
        p1.quantidade = 10;

        p2.nome = "Teclado";
        p2.preco = 120;
        p2.quantidade = 5;

        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.quantidade);

        System.out.println();

        System.out.println(p2.nome);
        System.out.println(p2.preco);
        System.out.println(p2.quantidade);
    }
}
