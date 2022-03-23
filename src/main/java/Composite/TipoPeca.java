package Composite;

import java.util.ArrayList;
import java.util.List;

public class TipoPeca extends Pecas{

    private List<Pecas> pecasList;

    public TipoPeca(String descricao) {
        super(descricao);
        this.pecasList = new ArrayList<Pecas>();
    }

    public void addPecas(Pecas pecas) {
        this.pecasList.add(pecas);
    }

    public String getPeca() {
        String saida = "";
        saida = "Tipo: " + this.getDescricao() + "\n";
        for (Pecas pecas : pecasList) {
            saida += pecas.getPeca();
        }
        return saida;
    }
}
