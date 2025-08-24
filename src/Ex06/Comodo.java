package Ex06;

public class Comodo {
    String nome;

    public Comodo(String nome) {
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Nome do comodo: " + this.nome;
    }

}
