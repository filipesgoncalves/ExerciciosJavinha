package lista1.Ex09;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel Core i3-10105f");
        RAM ram1 = new RAM("HyperX Fury 16gb");
        Perifericos p1 = new Perifericos("Teclado Logitech G213");
        Perifericos p2 = new Perifericos("Mouse Attack Shark R3");

        Computador computador = new Computador(processador, ram1);

        computador.adicionarPerifericos(p1);
        computador.adicionarPerifericos(p2);

        computador.mostrarDetalhes();
    }
}
