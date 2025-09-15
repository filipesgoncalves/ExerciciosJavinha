package revisao;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Grand Hotel Budapest", "An d. Frauenkirche 5-7, 02826 Görlitz");
        Quarto quarto = new Quarto("Deluxe", 123, 1500);
        Quarto quarto2 = new Quarto("Standart", 122, 799.99);

        hotel.addQuarto(quarto);
        hotel.addQuarto(quarto2);

        hotel.listarHospedes();

        System.out.println("=============================================");

        Hospede h1 = new Hospede("Filipe", "111.111.111-11");
        Hospede h2 = new Hospede("Filipe 2", "222.222.222-22");

        hotel.hospedar(h1, 123);
        hotel.hospedar(h2, 123);
        hotel.hospedar(h2, 122);

        System.out.println("=============================================");

        hotel.listarHospedes();

        System.out.println("=============================================");

        hotel.checkout(123);

        System.out.println("=============================================");

        hotel.listarHospedes();


    }
}
