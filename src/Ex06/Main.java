package Ex06;

public class Main {
    public static void main(String[] args) {
        Comodo c1 = new Comodo("Cozinha");
        Comodo c2 = new Comodo("Banheiro");
        Casa casa = new Casa("Rua NovaTestada 123");

        System.out.println("Cadastrando comodos...");
        casa.adicionarComodo(c1);
        casa.adicionarComodo(c2);

        casa.listarComodos();

    }
}
