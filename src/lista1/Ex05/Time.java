package lista1.Ex05;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String cidade;
    private List<Jogador> jogadores;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        if (jogador != null) {
            this.jogadores.add(jogador);
            System.out.println("Jogador " + jogador.getNome() + " contratado pelo lendario " + this.nome + ".");
        }
    }

    public void listarJogadores() {
        System.out.println("\n--- Elenco do Time: " + this.nome + " (" + this.cidade + ") ---");
        if (this.jogadores.isEmpty()) {
            System.out.println("Time sem jogadores!.");
        } else {
            for (Jogador jogador : this.jogadores) {
                System.out.println("- " + jogador.toString());
            }
        }
        System.out.println("-------------------------------------------------");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
