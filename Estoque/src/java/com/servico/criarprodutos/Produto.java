
package com.servico.criarprodutos;


public class Produto {
     private String descricao;
private String fabricante;
private double valor;
public Produto(String descricao, String fabricante, double valor ){
this.descricao = descricao;
this.fabricante = fabricante;
this.valor = valor;
}
public String getDescricao() {
return descricao;
}
public void setDescricao(String descricao) {
this.descricao = descricao;
}
public String getFabricante() {
return fabricante;
}
public void setFabricante(String fabricante) {
this.fabricante = fabricante;
}
public double getValor() {
return valor;
}
public void setValor(double valor) {
this.valor = valor;
}
    
}
