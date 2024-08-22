package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtomoHalogenioTest {

    @Test
    void deveRetornarAltaReatividade() {
        AtomoHalogenio atomo = new AtomoHalogenio();
        atomo.setEletronegatividade(3.0f);
        atomo.setRaioAtomico(1.0f);
        assertEquals("Alta reatividade", atomo.verificarReatividade());
    }

    @Test
    void deveRetornarBaixaReatividade() {
        AtomoHalogenio atomo = new AtomoHalogenio();
        atomo.setEletronegatividade(1.5f);
        atomo.setRaioAtomico(1.0f);
        assertEquals("Baixa reatividade", atomo.verificarReatividade());
    }

    @Test
    void deveRetornarInformacoes() {
        AtomoHalogenio atomo = new AtomoHalogenio();
        atomo.setEletronegatividade(3.0f);
        atomo.setRaioAtomico(1.0f);
        atomo.setSimbolo("Cl");
        atomo.setNumeroAtomico(17);
        assertEquals("AtomoHalogenio{número atômico=17, símbolo='Cl', reatividade=Alta reatividade}", atomo.getInfo());
    }

    @Test
    void naoDevePermitirRaioAtomicoZero() {
        try {
            AtomoHalogenio atomo = new AtomoHalogenio();
            atomo.setRaioAtomico(0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Raio atômico deve ser maior que zero", e.getMessage());
        }
    }
}