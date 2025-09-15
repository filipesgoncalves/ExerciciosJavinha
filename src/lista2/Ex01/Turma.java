package lista2.Ex01;

public class Turma {
    private String nomeDaDisciplina;
    private Aluno[] alunos;
    private int proximaPosicaoLivre;

    public Turma(String nomeDaDisciplina) {
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.alunos = new Aluno[40];
        this.proximaPosicaoLivre = 0;
    }

    public void matricularAluno(Aluno novoAluno) {
        if (this.proximaPosicaoLivre < this.alunos.length) {
            this.alunos[this.proximaPosicaoLivre] = novoAluno;
            this.proximaPosicaoLivre++;
            System.out.println("Matrícula realizada!");
        } else {
            System.out.println("ERRO: Turma cheia!");
        }
    }

    public void listarAlunos() {
        System.out.println("--- Alunos da Turma de " + this.nomeDaDisciplina + " ---");
        for (int i = 0; i < this.proximaPosicaoLivre; i++) {
            System.out.println(" - " + this.alunos[i].getNome());
        }
    }

    public Aluno buscarAlunoPorRA(int ra) {
        for (int i = 0; i < this.proximaPosicaoLivre; i++) {
            if (this.alunos[i].getRa() == ra) {
                System.out.println("Aluno(a) " + this.alunos[i].getNome() + " encontrado(a)!");
                return this.alunos[i];
            }
        }
        System.out.println("Aluno não encontrado!");
        return null;
    }

    //O problema de fazer um removeAluno é que o array tem tamanho fixo, então só poderíamos reorganizar os elementos atuais, tendo o risco de deixar espaços null no array.
    //Basicamente seria só percorrer o array até achar o RA, remover aquela instância, mandar todos os outros valores para "trás" e diminuir a posição livre em um.

}
