
package com.servico.criarpaciente;


public class Paciente {
    private String nome;
private String tipoEnfermidade;
Paciente(String nome, String tipoEnfermidade){
this.nome = nome;
this.tipoEnfermidade = tipoEnfermidade;
}
public void setNome(String nome){
this.nome = nome;
}
public String getNome(){
return this.nome;
}
public void setTipoEnfermidade(String tipoEnfermidade){
this.tipoEnfermidade = tipoEnfermidade;
}
public String getTipoEnfermidade(){
return this.tipoEnfermidade;

}
}
