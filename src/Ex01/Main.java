package Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.println("Digite seu nome: ");
        pessoa.setNome(sc.next());

        System.out.println("Digite sua idade: ");
        pessoa.setIdade(sc.nextInt());

        pessoa.exibirIdade();

        pessoa.fazerAniversario();

        pessoa.exibirIdade();
    }
}