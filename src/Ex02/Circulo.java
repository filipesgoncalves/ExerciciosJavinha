package Ex02;

public class Circulo {
    private double raio;

    public void setRaio(float raio) {this.raio = raio;}

    public double calcularArea() {
        return (Math.PI * (this.raio * this.raio));
    }

    public double calcularPerimetro() {
        return (2 * Math.PI * this.raio);
    }
}
