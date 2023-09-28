package main;

import controllers.FuncionarioController;

public class Main {

	public static void main(String[] args) {
		//instancio o controlador
		
		FuncionarioController funcionarioController = new FuncionarioController();
		funcionarioController.CadastrarFuncionario();

	}

}
