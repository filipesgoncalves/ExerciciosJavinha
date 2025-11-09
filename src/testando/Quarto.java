package testando;

public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    private Hospede hospede;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = 350;
        this.ocupado = false;
    }

    public void ocupar(Hospede hospede) {
        ocupado = true;
        this.hospede = hospede;
    }
    public void liberar() {
        ocupado = false;
        this.hospede = null;
    }
    public int getNumero() {
        return numero;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public String getHospedeAtual() {
        return hospede.getNome();
    }
    public String getTipo() {
        return tipo;
    }
}
