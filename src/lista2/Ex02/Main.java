package lista2.Ex02;

public class Main {
    public static void main(String[] args) {
        Playlist rockzao = new Playlist("Rockzao");

        Musica m1 = new Musica("Ace of Spades", "Ace of Spades", "Motorhead");
        Musica m2 = new Musica("Carousel", "Cheshire Cat", "blink-182");
        Musica m3 = new Musica ("Eu Nunca Vou Parar de Beber", "Estilo Selvagem Rock n Roll", "Os Pedrero");

        rockzao.AdicionarMusica(m1);
        rockzao.AdicionarMusica(m2);
        rockzao.AdicionarMusica(m3);

        rockzao.listarMusicas();
    }
}
