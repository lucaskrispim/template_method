package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtomoAlcalinoTest {

    @Test
    void deveRetornarAltaReatividade() {
        AtomoAlcalino atomo = new AtomoAlcalino();
        atomo.setEletronegatividade(0.8f);
        atomo.setRaioAtomico(1.0f);
        assertEquals("Alta reatividade", atomo.verificarReatividade());
    }

    @Test
    void deveRetornarBaixaReatividade() {
        AtomoAlcalino atomo = new AtomoAlcalino();
        atomo.setEletronegatividade(0.8f);
        atomo.setRaioAtomico(0.5f);
        assertEquals("Baixa reatividade", atomo.verificarReatividade());
    }

    @Test
    void deveRetornarInformacoes() {
        AtomoAlcalino atomo = new AtomoAlcalino();
        atomo.setEletronegatividade(0.8f);
        atomo.setRaioAtomico(1.0f);
        atomo.setSimbolo("Na");
        atomo.setNumeroAtomico(11);
        assertEquals("AtomoAlcalino{número atômico=11, símbolo='Na', reatividade=Alta reatividade}", atomo.getInfo());
    }
}
