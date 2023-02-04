
package criarfaculdade;

import java.util.Scanner;

public class CriarFaculdade {

   public static void main(String[] args) {
        Scanner info = new Scanner( System.in ); 
		Aluno alunoUm = new Aluno ("" , " ");
		System.out.println("Digite o nome do aluno");
    	alunoUm.setNome(info.nextLine());
		System.out.println("Digite o endereço");
    	alunoUm.setNomeEndereco(info.nextLine());

while(true) {
	Scanner entradaDados = new Scanner( System.in ); 
	System.out.println("Digite uma opcao do Menu, sendo: \n [1]Exibir cadastro \n [2] Alterar endereço \n");   
	int opcao = entradaDados.nextInt();
    	if (opcao==1){
			System.out.println("" + alunoUm.relatorioPaciente());
	    }
		else
		if (opcao==2){
		System.out.println("Digite o novo endereço");
		alunoUm.setNomeEndereco(info.nextLine());
					
					}
          			else
					    {
					    System.out.println("Fim");
		  				break;
						}
	}   }   } 
 
   
    

