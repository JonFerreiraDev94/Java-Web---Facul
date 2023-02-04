
package com.servico.folhapagamento;

//classe celetista pega por herança os atributos nome, rua horas trabalhadas
public class Celetista extends Colaboradores {
 //atributos exclusivos da classe celetista
private int cpf; //atributo cpf do tipo int
private double salarioMensal; //atributo salario mensal do tipo double
private double salarioBruto; //atributo salario bruto to tipo double
private double inss; //atributo inss do tipo inss
private double liquido; //atributo liquido to tipo double

//construtor da classe celetista
Celetista(String nome, String rua, double horasTrabalhadas, int cpf, double salarioMensal){
super(nome,rua,horasTrabalhadas); //chama o construtor da superclasse(colaboradores)
this.cpf = cpf;
this.salarioMensal = salarioMensal;
}
	public void setCpf(int cpf){ //grava o cpf
	this.cpf = cpf;
	}
	public int getCpf(){ //pega o cpf
	return this.cpf;
	}
	public void setSalarioMensal(double salarioMensal){ //grava salario mensal
	this.salarioMensal = salarioMensal;
	}
	public double getSalarioMensal(){ //pega o salario mensal
	return this.salarioMensal;
	}
	public void setSalarioBruto(double salarioBruto){ //grava o salario bruto
	this.salarioBruto = salarioBruto;
	}
	public double getSalarioBruto(){ //pega o salario bruto
	return this.salarioBruto;
	}
       public void setINSS(double inss){ //grava o inss
	this.inss = inss;
	}
	public double getINSS(){ //pega o inss
	return this.inss;
	}
       public void setLiquido(double liquido){ //grava o sal liquido
	this.liquido = liquido;
	}
	public double getLiquido(){ // pega o salario liquido
	return this.liquido;
	}
    public String exibirCeletista() { //gera o relatóri completo do funcionario
    String exibir;
    exibir = super.toString();
    exibir = exibir + " | CPF " + this.cpf + " | salario R$ " + this.salarioMensal;
    return exibir;
    }
    public double calcularSalarioBruto(){ //crio uma função calcular salario que retorna o salario bruto do tipo double
		if (this.getHorasTrabalhadas()<=160){ //verifica a condição
		    this.salarioBruto = this.getSalarioMensal();
		    return salarioBruto;
		}
		else  //senão faz o calculo para retornar o salario bruto
			this.salarioBruto = (this.getSalarioMensal()/160)*this.getHorasTrabalhadas();
			return this.salarioBruto;
		}
	public double calcularINSS(){ //função calcular inss do tipo double
	if (salarioBruto <= 965.67) //verifica a condição
            this.inss = (salarioBruto * 0.08); //faz o calculo
	else
	    if (salarioBruto >= 965.68 && salarioBruto < 1609.45)
               this.inss = (salarioBruto * 0.09);
	    else 
	               if  (salarioBruto >= 1609.46){
		            this.inss = (salarioBruto * 0.11);
			          if (inss >= 354.08) 
				       this.inss = 354.08;
			}
		return this.inss; //retorna o valor do inss
	}
	public double CalcularSalarioLiquido(){ //criou a função que calcula o salarioliquido que retorna um valor double
                  this.liquido = this.salarioBruto - (this.inss);
                  return   this.liquido;
	}
}