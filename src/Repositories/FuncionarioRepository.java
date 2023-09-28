package Repositories;

import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {
/*
 * metodo para receber um objeto funcionario
 * e gravar os seus dados em um arquivo txt
 * */
	
	public void exportarTxt(Funcionario funcionario) {
		try {
			//cria uma arquivo TXT
			PrintWriter printWriter = new PrintWriter("c:\\temp\\funcionario_"+ funcionario.getId() + ".txt");
			
			//escrevendo os dados do funcinario
			printWriter.write("\nID DO FUNCIONARIO**********: " + funcionario.getId());
			printWriter.write("\nNOME DO FUNCIONARIO********: " + funcionario.getNome());
			printWriter.write("\nCPF DO FUNCIONARIO*********: " + funcionario.getCpf());
			printWriter.write("\nMATRICULA DO FUNCIONARIO***: " + funcionario.getMatricula());
			printWriter.write("\nSALARIO DO FUNCIONARIO*****: " + funcionario.getSalario());
			printWriter.write("\nSIGLA DO DEPARTAMENTO******: " + funcionario.getDepartamento().getSigla());
			printWriter.write("\nDESCRICAO DO DEPARTAMENTO**: " + funcionario.getDepartamento().getDescricao());
			
			printWriter.flush(); //salva o arquivo
			printWriter.close(); //fecha o arquivo
			
			System.out.println("\nARQUIVO TXT GRAVADO COM SUCESSO!");
			
		} catch (Exception e) {
			System.out.println("\nFALHA AO GRAVAR ARQUIVO TXT:");
			System.out.println("\nERRO: " + e.getMessage());
		}
	}
}
