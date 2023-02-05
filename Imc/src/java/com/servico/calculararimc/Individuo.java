
package com.servico.calculararimc;


public class Individuo {
    private String nome;
private double peso,altura, imc;
public Individuo(String nome, double peso, double altura){
this.nome = nome;
this.peso = peso;
this.altura = altura;
//this.imc = this.peso / (this.altura * this.altura);
this.imc = calcularImc(peso, altura);
}
public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public double getPeso() {
return peso;
}
public void setPeso(double peso) {
this.peso = peso;
}
public double getAltura() {
return altura;
}
public void setAltura(double altura) {
this.altura = altura;
}
public double getImc() {
return imc;
}
public void setImc(double imc) {
this.imc = imc;
}
public double calcularImc(double peso, double altura ){
    double imc;
    imc = peso / (altura * altura);
    return imc;
}
}
