package lista2.Ex02;

public class Playlist {
    private String nome;
    private Musica[] musicas;
    private int proximaPosicaoLivre;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new Musica[20];
        this.proximaPosicaoLivre = 0;
    }

    public void AdicionarMusica(Musica musica) {
        if (this.proximaPosicaoLivre < this.musicas.length) {
            this.musicas[this.proximaPosicaoLivre] = musica;
            this.proximaPosicaoLivre++;
            System.out.println("Musica adicionada!");
        }
        else {
            System.out.println("ERRO: Limite excedido!");
        }
    }

    public void listarMusicas() {
        for (int i = 0; i < this.proximaPosicaoLivre; i++) {
            System.out.println("Musica 1: " + this.musicas[i].getNome());
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
