package Ex08;


import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        if (produto != null) {
            this.produtos.add(produto);
        }
    }

    public void mostrarDetalhes() {
        System.out.println("========================================");
        System.out.println("Detalhes do Pedido");
        System.out.println("========================================");

        System.out.println("Cliente: " + this.cliente.getNome() + " (CPF: " + this.cliente.getCpf() + ")");
        System.out.println("----------------------------------------");
        System.out.println("Produtos Comprados:");

        if (produtos.isEmpty()) {
            System.out.println("Pedido sem produtos... vixe maria!");
        } else {
            double totalPedido = 0.0;
            for (Produto produto : this.produtos) {
                System.out.printf("- %s R$ %.2f%n", produto.getNome(), produto.getValor());
                totalPedido += produto.getValor();
            }
            System.out.println("----------------------------------------");
            System.out.printf("TOTAL DO PEDIDO:               R$ %.2f%n", totalPedido);
        }
        System.out.println("========================================");
        System.out.println();
    }
}
