package org.example;

public class AtomoAlcalino extends Atomo {

    @Override
    public String verificarReatividade() {
        if (this.calcularFatorReatividade() < 1.0f) {
            return "Alta reatividade";
        } else {
            return "Baixa reatividade";
        }
    }

    @Override
    public String getTipo() {
        return "AtomoAlcalino";
    }
}
