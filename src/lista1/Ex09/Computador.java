package lista1.Ex09;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    private Processador processador;
    private RAM ram;
    private List<Perifericos> perifericos;

    public Computador(Processador processador, RAM ram) {
        this.processador = processador;
        this.ram = ram;
        this.perifericos = new ArrayList<>();
    }

    public void adicionarPerifericos(Perifericos periferico) {
        if (periferico != null) {
            this.perifericos.add(periferico);
        }
    }

    public void mostrarDetalhes() {
        System.out.println("========================================");
        System.out.println("Sobre o computador");
        System.out.println("========================================");

        System.out.println("Processador: " + this.processador.getNome());
        System.out.println("RAM: " + this.ram.getNome());
        System.out.println("----------------------------------------");
        System.out.println("Perifericos instalados:");

        if (perifericos.isEmpty()) {
            System.out.println("Computador sem perifericos... ta duro dorme");
        } else {
            for (Perifericos periferico : this.perifericos) {
                System.out.printf("- %s%n", periferico.getNome());
            }
            System.out.println("----------------------------------------");
        }
        System.out.println("========================================");
        System.out.println();
    }
}
