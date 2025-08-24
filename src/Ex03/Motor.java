package Ex03;

public class Motor {
    private String tipoCombustivel;
    private int potencia;

    public Motor(int potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
}
