package Composite;

public class DetalhesPeca extends Pecas{
    private Float valorPeca;

    public DetalhesPeca(String nomePeca, Float valorPeca) {
        super(nomePeca);
        this.valorPeca = valorPeca;
    }

    public Float getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(Float valorPeca) {
        this.valorPeca = valorPeca;
    }

    public String getPeca() {
        return "Detalhes: " + this.getNome() + " - valor: " + this.valorPeca + "\n";
    }
}
