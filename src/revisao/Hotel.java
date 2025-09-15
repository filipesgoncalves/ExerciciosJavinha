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
                System.out.println("Hospede: " + hospede.getNome() + " hospedado no quarto " + numeroQuarto);
                return;
            }
        }
        System.out.println("Não foi possivel achar um quarto no momento. Pedimos desculpas pelo inconveniente.");
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
        System.out.println("O quarto requisitado se encontra vazio no momento ou não foi encontrado.");
    }

    public void listarHospedes() {
        System.out.println("--- LISTA DE HOSPEDES ---");
        for (Quarto quarto : quartos) {
            if (quarto.isOcupado()) {
                System.out.println("Quarto " + quarto.getNumero() + " ocupado por " + quarto.getHospede().getNome() + ".");
            }
        }
    }

    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
}
