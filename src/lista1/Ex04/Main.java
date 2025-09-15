package lista1.Ex04;

public class Main {
    public static void main(String[] args) {
        Autor kafka = new Autor("Franz Kafka", "Tcheco");
        System.out.println("Autor: " + kafka);
        System.out.println("Livros escritos por Kafka: " + kafka.getLivros());

        Livro castelo = new Livro("O Castelo", kafka);
        Livro metamorfose = new Livro("Metamorfose", kafka);

        System.out.println("\n------------------------\n");

        System.out.println("Livros de Kafka agora: " + kafka.getLivros().size());
        System.out.println("Autores do livro 'Metamorfose': " + metamorfose.getAutores());
        System.out.println("Autores do livro 'O Castelo': " + castelo.getAutores());

        System.out.println("\n------------------------\n");
        kafka.removerLivro(metamorfose);

        System.out.println("Livros de Kafka agora: " + kafka.getLivros().size());
        System.out.println(kafka.getLivros());
    }
}
