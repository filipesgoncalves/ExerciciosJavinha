package Ex07;

public class Disciplina {
    private String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return "Nome da disciplina: " + this.nome;
    }
}
