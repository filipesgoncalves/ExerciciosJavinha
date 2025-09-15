package revisao;

public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    private Hospede hospede;

    public Quarto(String tipo, int numero, double precoPorNoite) {
        this.tipo = tipo;
        this.numero = numero;
        this.precoPorNoite = precoPorNoite;
        this.ocupado = false;
        this.hospede = null;
    }

    public int getNumero() {
        return numero;
    }
    public String getTipo() {
        return tipo;
    }
    public double getPrecoPorNoite() {
        return precoPorNoite;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public Hospede getHospede() {
        return hospede;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
}
