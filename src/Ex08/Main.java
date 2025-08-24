package Ex08;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 8.50f);
        Produto p2 = new Produto("Papel", 5.40f);
        Produto p3 = new Produto("Molho de tomate", 15.99f);

        Cliente c1 = new Cliente("Filipe", "123.456.789-00");

        Pedido pedido = new Pedido(c1);

        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);
        pedido.adicionarProduto(p3);

        pedido.mostrarDetalhes();
    }
}
