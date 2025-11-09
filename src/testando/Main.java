package testando;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Grand Hotel Budapest", "An d. Frauenkirche 5-7, 02826 Görlitz");
       Quarto quarto = new Quarto(123, "Deluxe");
       Quarto quarto2 = new Quarto(122, "Standart");

        hotel.adicionarQuarto(quarto);
        hotel.adicionarQuarto(quarto2);

        Hospede hospede = new Hospede("Filipe", "111.111.111-2");
        Hospede hospede2 = new Hospede("Joao", "222.222.222-1");

        hotel.exibirRelatorioOcupacao();

        System.out.println("===========================");

        hotel.hospedar(hospede, 123);

        hotel.hospedar(hospede2, 123);

        hotel.hospedar(hospede2, 122);

        System.out.println("===========================");

        hotel.exibirRelatorioOcupacao();

        System.out.println("===========================");

        hotel.realizarCheckout(123);

        System.out.println("===========================");

        hotel.exibirRelatorioOcupacao();


    }
}
