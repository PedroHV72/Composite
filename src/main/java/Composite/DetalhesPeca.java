package Composite;

public class DetalhesPeca extends Pecas{
    private Float valorPeca;

    public DetalhesPeca(String descricao, Float valorPeca) {
        super(descricao);
        this.valorPeca = valorPeca;
    }

    public Float getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(Float valorPeca) {
        this.valorPeca = valorPeca;
    }

    public String getPeca() {
        return "Detalhes: " + this.getDescricao() + " - valor: " + this.valorPeca + "\n";
    }
}
