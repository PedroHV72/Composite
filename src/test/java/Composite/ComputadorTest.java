package Composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputadorTest {
    @Test
    void deveRetornarPecasComputador() {
        TipoPeca tipoPeca1 = new TipoPeca("Placa de Vídeo");
        DetalhesPeca detalhesPeca1 = new DetalhesPeca("GTX 1050 TI", 1350.0f);
        tipoPeca1.addPecas(detalhesPeca1);

        TipoPeca tipoPeca2 = new TipoPeca("Placa Mãe");
        DetalhesPeca detalhesPeca2 = new DetalhesPeca("B450M", 750.0f);
        tipoPeca2.addPecas(detalhesPeca2);

        TipoPeca tipoPeca3 = new TipoPeca("Processadores");
        DetalhesPeca detalhesPeca3 = new DetalhesPeca("Ryzen 5 3600", 1500.0f);
        DetalhesPeca detalhesPeca4 = new DetalhesPeca("Ryzen 7 4800", 2300.0f);
        tipoPeca3.addPecas(detalhesPeca3);
        tipoPeca3.addPecas(detalhesPeca4);

        TipoPeca tipoPeca = new TipoPeca("Computador Gamer");
        tipoPeca.addPecas(tipoPeca1);
        tipoPeca.addPecas(tipoPeca2);
        tipoPeca.addPecas(tipoPeca3);

        Computador computador = new Computador();
        computador.setPecas(tipoPeca);

        assertEquals("Tipo: Computador Gamer\n" +
                "Tipo: Placa de Vídeo\n" +
                "Detalhes: GTX 1050 TI - valor: 1350.0\n" +
                "Tipo: Placa Mãe\n" +
                "Detalhes: B450M - valor: 750.0\n" +
                "Tipo: Processadores\n" +
                "Detalhes: Ryzen 5 3600 - valor: 1500.0\n" +
                "Detalhes: Ryzen 7 4800 - valor: 2300.0\n", computador.getPecas());
    }

    @Test
    void deveRetornarExecacaoComputadorSemPeca() {
        try {
            Computador computador = new Computador();
            computador.getPecas();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Computador sem peças", e.getMessage());
        }
    }
}
