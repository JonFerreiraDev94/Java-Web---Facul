
package com.servico.folhapagamento;


public class Colaboradores { //crio a classe principal colaboradores
    private String nome; //atributo nome do tipo string
private String rua; // atributo rua do tipo string
private double horasTrabalhadas; //atribuo horas trabalhadas do tipo double
        
        //crio o construtor para o nome, rua e horas trabalhadas
	Colaboradores (String nome, String rua, double horasTrabalhadas){
	this.nome = nome;
	this.rua = rua;
	this.horasTrabalhadas = horasTrabalhadas;
	}

		public void setNome(String nome){//grava o nome
		this.nome = nome;
		}
		public String getNome(){ //pega o nome
		return this.nome;
		}
		public void setRua(String rua){//grava a rua
		this.rua = rua;
		}
		public String getRua(){ //pega a rua 
		return this.rua;
		}
		//grava as horas trabalhadas
		public void setHorasTrabalhadas(double horasTrabalhadas){
		this.horasTrabalhadas = horasTrabalhadas;
		}
		public double getHorasTrabalhadas(){ //pega as horas trabalhadas
		return this.horasTrabalhadas;
		}
    public String toString() { //utiliza o metodo toString para exibir um relatorio do funcionario
    return this.nome + " | rua " + this.rua + " | quantidade horas " + this.horasTrabalhadas; 
    } 
    
}
