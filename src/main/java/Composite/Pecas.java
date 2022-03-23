package Composite;

public abstract class Pecas {

    private String descricao;

    public Pecas(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getPeca();
}
