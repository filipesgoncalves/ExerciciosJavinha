package Ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.print("Digite o raio do Circulo: ");
        circulo.setRaio(input.nextFloat());

        System.out.printf("\n\nArea: %.2f\nPerimetro: %.2f",  circulo.calcularArea(), circulo.calcularPerimetro());
    }
}
