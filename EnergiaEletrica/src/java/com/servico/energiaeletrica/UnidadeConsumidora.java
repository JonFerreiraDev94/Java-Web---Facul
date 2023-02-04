
package com.servico.energiaeletrica;


public class UnidadeConsumidora {
private String nomeProprietario, endereco;
private double leituraAtual, leituraAnterior, quantidadeConsumida=0, valorPagar=0;
private double valorTarifa=0.34;
public UnidadeConsumidora(String nomeProprietario,String endereco,double leituraAnterior, double leituraAtual){
this.nomeProprietario = nomeProprietario;
this.endereco = endereco;
this.leituraAnterior = leituraAnterior;
this.leituraAtual = leituraAtual;
}
public void setNomeProprietario(String nomeProprietario)
{
this.nomeProprietario = nomeProprietario;
}
public String getNomeProprietario()
{
return this.nomeProprietario;
}
public void setEndereco(String endereco)
{
this.endereco = endereco;
}
public String getEndereco()
{
return this.endereco;
}
public void setLeituraAnterior(double leituraAnterior)
{
this.leituraAnterior = leituraAnterior;
}
public double getLeituraAnterior()
{
return this.leituraAnterior;
}
public void setLeituraAtual(double leituraAtual)
{
this.leituraAtual = leituraAtual;
}
public double getLeituraAtual()
{
return this.leituraAtual;
}
public void setValorTarifa(double valorTarifa)
{
this.valorTarifa = valorTarifa;
}
public double getValorTarifa()
{
return this.valorTarifa;
}
public void setValorPagar(double valorPagar)
{
this.valorPagar = valorPagar;
}
public double getValorPagar()
{
return this.valorPagar;
}
public void setQuantidadeConsumida(double quantidadeConsumida)
{
this.quantidadeConsumida = quantidadeConsumida;
}
public double getQuantidadeConsumida()
{
return this.quantidadeConsumida;
}
public double gerarQuantidadeEnergiaConsumida(){
if(this.leituraAtual < this.leituraAnterior){
this.quantidadeConsumida = (this.leituraAtual + 10000) - this.leituraAnterior ;
return this.quantidadeConsumida;
}
else {
this.quantidadeConsumida = this.leituraAtual - this.leituraAnterior;
return this.quantidadeConsumida;
}
}
public double gerarValorPagar(){
this.valorPagar = this.valorTarifa * this.quantidadeConsumida;
return this.valorPagar;
}
public void gerarFatura(){
System.out.println( "nome: " + nomeProprietario + " \n endereco: " + endereco);
System.out.println("Quantidade Consumida " + quantidadeConsumida + " KW/h");
System.out.println( " Tarifa " + valorTarifa + " e total a pagar R$ " + valorPagar);
}
}
