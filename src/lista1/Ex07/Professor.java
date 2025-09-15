package lista1.Ex07;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> disciplinas;

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void listarDisciplinas() {
        System.out.println("\n--- Disciplinas do professor: " + this.nome + " ---");
        if (this.disciplinas.isEmpty()) {
            System.out.println("Professor nao cadastrado em nenhuma disciplina!.");
        } else {
            for (Disciplina disciplina : this.disciplinas) {
                System.out.println("- " + disciplina.toString());
            }
        }
        System.out.println("-------------------------------------------------");
    }

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
