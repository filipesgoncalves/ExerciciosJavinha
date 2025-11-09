package testando;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String endereco;
    private List<Quarto> quartos;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void hospedar(Hospede hospede, int numeroQuarto) {
        boolean achou = false;
       for (Quarto quarto : quartos) {
           if(quarto.getNumero() == numeroQuarto && !quarto.isOcupado()) {
               achou = true;
               quarto.ocupar(hospede);
               System.out.println("Quarto " + numeroQuarto + " reservado!");
           }
       }
       if(!achou) {
           System.out.println("Quarto " + numeroQuarto + " não existe ou já foi reservado!");
       }
    }

    public void realizarCheckout(int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if(quarto.getNumero() == numeroQuarto && quarto.isOcupado()) {
                quarto.liberar();
                System.out.println("Quarto liberado!");
            }
            else{
                System.out.println("Quarto não encontrado ou já livre");
            }
        }
    }

    public void exibirRelatorioOcupacao(){
        for (Quarto quarto : quartos) {
            if(quarto.isOcupado()) {
                System.out.println("Quarto " + quarto.getNumero() + " ocupado!");
            }
            else {
                System.out.println("Quarto " + quarto.getNumero() + " livre!");
            }
        }
    }

}
