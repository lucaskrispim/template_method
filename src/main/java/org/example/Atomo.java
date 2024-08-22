package org.example;

public abstract class Atomo {

    private int numeroAtomico;
    protected String simbolo;
    private float eletronegatividade;
    private float raioAtomico;

    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public float getEletronegatividade() {
        return eletronegatividade;
    }

    public void setEletronegatividade(float eletronegatividade) {
        this.eletronegatividade = eletronegatividade;
    }

    public float getRaioAtomico() {
        return raioAtomico;
    }

    public void setRaioAtomico(float raioAtomico) {
        if (raioAtomico <= 0) {
            throw new IllegalArgumentException("Raio atômico deve ser maior que zero");
        }
        this.raioAtomico = raioAtomico;
    }

    public float calcularFatorReatividade() {
        return this.getEletronegatividade() / this.getRaioAtomico();
    }

    public abstract String verificarReatividade();

    public String getTipo() {
        return "Átomo";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "número atômico=" + this.getNumeroAtomico() +
                ", símbolo='" + this.getSimbolo() + '\'' +
                ", reatividade=" + this.verificarReatividade() +
                '}';
    }
}
