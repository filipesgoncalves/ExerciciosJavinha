package lista1.Ex05;

public class Main {
    public static void main(String[] args) {
        Time united = new Time("Manchester United", "Manchester");
        Jogador j1 = new Jogador("Wayne Rooney", "Atacante");
        Jogador j2 = new Jogador("Peter Schmeichel", "Goleiro");
        Jogador j3 = new Jogador("Eric Cantona", "Atacante");

        System.out.println("Teste sem alocar jogadores: ");
        united.listarJogadores();
        System.out.println("Teste apos alocar: ");
        united.adicionarJogador(j1);
        united.adicionarJogador(j2);
        united.adicionarJogador(j3);
        united.listarJogadores();
    }
}
