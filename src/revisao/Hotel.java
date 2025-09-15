package revisao;

import java.sql.SQLOutput;
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
    public void addQuarto(Quarto quarto) {
        this.quartos.add(quarto);
    }

    public void hospedar(Hospede hospede, int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto && !quarto.isOcupado()){
                quarto.setOcupado(true);
                quarto.setHospede(hospede);
                System.out.println("Atualização: " + hospede.getNome() + " hospedado no quarto " + numeroQuarto);
                return;
            }
        }
        System.out.println("O quarto " + numeroQuarto + " está ocupado ou não foi encontrado. Pedimos desculpas pelo inconveniente.");
    }

    public void checkout(int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto && quarto.isOcupado()) {
                System.out.println("Check-out do quarto " + quarto.getNumero() + " realizado! Volte sempre :)");
                quarto.setOcupado(false);
                quarto.setHospede(null);
                return;
            }
        }
        System.out.println("O quarto " + numeroQuarto + " se encontra vazio no momento ou não foi encontrado. Pedimos desculpas pelo inconveniente.");
    }

    public void listarHospedes() {
        System.out.println("--- LISTA DE HOSPEDES ---");
        int total = quartos.size();
        int ocupado = 0;

        for (Quarto quarto : quartos) {
            if (quarto.isOcupado()) {
                ocupado++;
                System.out.println("Quarto " + quarto.getNumero() + " ocupado por " + quarto.getHospede().getNome() + ".");
            }
        }
        if (ocupado == 0){
            System.out.println("Todos os quartos estão livres!");
        } else if (ocupado == total) {
            System.out.println("Todos os quartos estão ocupados!");
        }
    }

    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
}
