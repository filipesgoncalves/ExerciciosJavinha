package lista1.Ex03;

public class Carro{
    private String modelo;
    private String marca;
    private Motor motor;

    public Carro(String modelo, String marca, int potencia, String tipoCombustivel){
        this.modelo = modelo;
        this.marca = marca;
        this.motor = new Motor(potencia, tipoCombustivel);
    }

    public void detalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia: " + motor.getPotencia() + " cv");
        System.out.println("Combustível: " + motor.getTipoCombustivel());
    }
}
