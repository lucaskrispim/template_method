package org.example;

public class AtomoHalogenio extends Atomo {

    @Override
    public String verificarReatividade() {
        if (this.calcularFatorReatividade() >= 2.0f) {
            return "Alta reatividade";
        } else {
            return "Baixa reatividade";
        }
    }

    @Override
    public String getTipo() {
        return "AtomoHalogenio";
    }
}
