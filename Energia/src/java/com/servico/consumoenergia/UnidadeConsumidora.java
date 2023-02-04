
package com.servico.consumoenergia;


public class UnidadeConsumidora {
    private String nome, endereco;
    private int leituraAnterior, leituraAtual,QtdConsumida;
    private double tarifa = 0.34;
    
    public UnidadeConsumidora(String nome, String endereco, int leituraAnterior,int leituraAtual ){
        this.nome = nome;
        this.endereco = endereco;
        this.leituraAnterior = leituraAnterior;
        this.leituraAtual = leituraAtual;
        this.QtdConsumida = QtdConsumida;
        this.tarifa = tarifa;
        
        
    }
   
    
}
