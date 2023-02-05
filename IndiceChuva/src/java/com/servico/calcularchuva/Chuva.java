
package com.servico.calcularchuva;

public class Chuva {

    private String local;
    private double qtd, duracao, indice;

    public Chuva(String local, double qtd, double duracao) {
        this.local = local;
        this.qtd = qtd;
        this.duracao = duracao;
        this.indice = calcularIndice(qtd, duracao);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }

    public double calcularIndice(double qtd, double duracao) {
        double vol;
        vol = 1 * (qtd / 1000) * (1000) / duracao;
        return vol;
    }
}
