import javax.swing.*;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {this.nome = nome;}
    public void setIdade(int idade) {this.idade = idade;}


    public void fazerAniversario(){
        this.idade++;
        System.out.printf("Feliz aniversario!\n");
    }
    public void exibirIdade() {
        System.out.printf("Idade: %d\n", this.idade);
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}
