package lista1.Ex06;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String endereco;
    private List<Comodo> comodos;

    public Casa(String endereco) {
        this.endereco = endereco;
        this.comodos = new ArrayList<Comodo>();
    }

    public void adicionarComodo(Comodo comodo) {
        this.comodos.add(comodo);
    }

    public void listarComodos() {
        System.out.println("\n--- Comodos da casa: " + this.endereco + " ---");
        if (this.comodos.isEmpty()) {
            System.out.println("Casa sem comodos cadastrados!.");
        } else {
            for (Comodo comodo : this.comodos) {
                System.out.println("- " + comodo.toString());
            }
        }
        System.out.println("-------------------------------------------------");
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }
}
