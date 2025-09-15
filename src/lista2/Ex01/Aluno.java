package lista2.Ex01;

public class Aluno {
    private String nome;
    private int ra;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.ra = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRa() {
        return ra;
    }
    public void setMatricula(int matricula) {
        this.ra = matricula;
    }
}
