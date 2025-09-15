package lista2.Ex01;

public class Main {
    public static void main(String[] args) {
        Turma turmaPOO = new Turma("Programação Orientada a Objetos");
        Aluno aluna1 = new Aluno("Ana", 101);
        Aluno aluno2 = new Aluno("Beto", 102);
        Aluno aluno3 = new Aluno("Maria", 103);
        turmaPOO.matricularAluno(aluna1);
        turmaPOO.matricularAluno(aluno2);
        turmaPOO.matricularAluno(aluno3);
        turmaPOO.listarAlunos();
        turmaPOO.buscarAlunoPorRA(101);
    }
}


