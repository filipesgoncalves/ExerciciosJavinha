package lista1.Ex04;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private List<Autor> autores;

    public Livro(String titulo, Autor autorInicial) {
        if (autorInicial == null) {
            throw new IllegalArgumentException("Um livro precisa de um autor.");
        }
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.adicionarAutor(autorInicial);
    }

    public void adicionarAutor(Autor autor) {
        if (autor != null && !autores.contains(autor)) {
            this.autores.add(autor);
            if (!autor.getLivros().contains(this)) {
                autor.adicionarLivro(this);
            }
        }
    }

    public void removerAutor(Autor autor) {
        if (autor != null) {
            this.autores.remove(autor);
        }
    }


    public String getTitulo() {
        return titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
