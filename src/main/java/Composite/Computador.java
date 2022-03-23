package Composite;

public class Computador {

    private Pecas pecas;

    public void setPecas(Pecas pecas) {
        this.pecas = pecas;
    }

    public String getPecas() {
        if (this.pecas == null) {
            throw new NullPointerException("Computador sem peças");
        }
        return this.pecas.getPeca();
    }

}
