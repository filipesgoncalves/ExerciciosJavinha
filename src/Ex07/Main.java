package Ex07;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Carlos");
        Disciplina d1 = new Disciplina("Banco de dados");
        Disciplina d2 = new Disciplina("Engenharia de requisitos");

        professor.adicionarDisciplina(d1);
        professor.adicionarDisciplina(d2);

        professor.listarDisciplinas();
    }
}
