package lista1.Ex04;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private String nacionalidade;
    private List<Livro> livros;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livro != null && !livros.contains(livro)) {
            this.livros.add(livro);
            if (!livro.getAutores().contains(this)) {
                livro.adicionarAutor(this);
            }
        }
    }

    public void removerLivro(Livro livro) {
        if (livro != null) {
            this.livros.remove(livro);
            livro.removerAutor(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
