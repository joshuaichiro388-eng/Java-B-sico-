public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {

        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    public static void main(String[] args) {

        Produto p = new Produto();

        p.setNome("Notebook");
        p.setPreco(3000);
        p.setQuantidade(2);

        System.out.println(p.getNome());
        System.out.println(p.getPreco());
        System.out.println(p.getQuantidade());
    }
}
