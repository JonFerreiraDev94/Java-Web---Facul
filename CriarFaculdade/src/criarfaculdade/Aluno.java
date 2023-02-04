/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criarfaculdade;

/**
 *
 * @author Jon
 */
public class Aluno {
     private String nome;
  private String NomeEndereco;

  public Aluno(String nome, String NomeEndereco){
this.setNome(nome);
this.setNomeEndereco(NomeEndereco);
  }

  public String getNome(){
    return nome;
  }

  public void setNome (String nome){
    this.nome = nome;
}
public String getNomeEndereco(){
    return NomeEndereco;
}
public void setNomeEndereco (String NomeEndereco){
    this.NomeEndereco = NomeEndereco;
}
public String relatorioPaciente(){
    return "\nAluno: " + getNome() + "\nendereço: " + getNomeEndereco() + "\n";
}
    
}
