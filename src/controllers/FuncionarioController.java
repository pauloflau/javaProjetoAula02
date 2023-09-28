package controllers;

import java.util.Scanner;
import java.util.UUID;

import Repositories.FuncionarioRepository;
import entities.Departamento;
import entities.Funcionario;

public class FuncionarioController {

	public void CadastrarFuncionario() {
		try {

			System.out.println("\n*** CADASTRO DE FUNCIONARIO ***");

			// CRIANDO UM OBJETO DA CLASSE FUNCIONARIO
			Funcionario funcionario = new Funcionario();

			// INSTANCIAR O ATRIBUTO DEPARTAMENTO CONTIDO NA CLASSE FUNCIONARIO
			funcionario.setDepartamento(new Departamento());

			// gerando um id aleatorio
			funcionario.setId(UUID.randomUUID());

			Scanner scan = new Scanner(System.in);

			System.out.print("Nome do funcionario******: ");
			funcionario.setNome(scan.nextLine());

			System.out.print("CPF do funcionario*******: ");
			funcionario.setCpf(scan.nextLine());

			System.out.print("Matricula do funcionario*: ");
			funcionario.setMatricula(scan.nextLine());

			System.out.print("Salario do funcionario***: ");
			// o scan.nextLine gera uma string e o parseDouble transforma a string pra
			// Double
			// e preferivel nao usar um scan.NextDouble
			funcionario.setSalario(Double.parseDouble(scan.nextLine()));

			// gero atraves de funcionario abrindo a classe departamento o UUID
			funcionario.getDepartamento().setId(UUID.randomUUID());

			System.out.print("Sigla do departamento****: ");
			funcionario.getDepartamento().setSigla(scan.nextLine());

			System.out.print("Descricao do departamento: ");
			funcionario.getDepartamento().setDescricao(scan.nextLine());

			scan.close();
			
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarTxt(funcionario);

		} catch (Exception e) {
			System.out.println("\nERRO AO CADASTRAR FUNCIONARIO. ");
			System.out.println("ERRO: " + e.getMessage());
			System.out.println();
			e.printStackTrace();
		}

	}
}
