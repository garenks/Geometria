package br.com.fecaf.controller;

import br.com.fecaf.model.Funcionario;

import java.util.Scanner;

public class Menu {

    public void executarMenu() {
        boolean exit = false;

        Scanner scanner = new Scanner(System.in);

        FuncionarioController funcionarioController = new FuncionarioController();

        while (!exit) {
            System.out.println("/---------------------- Bem Vindo ----------------------/");
            System.out.println("/-------------------------------------------------------/");
            System.out.println("/-------------------------Menu -------------------------/");
            System.out.println(" 1 - Listar Funcionarios                                 ");
            System.out.println(" 2 - Deletar Funcionario                                 ");
            System.out.println(" 3 - Cadastrar Funcionario                               ");
            System.out.println(" 4 - Sair                                                ");
            System.out.println("/-------------------------------------------------------/");

            System.out.println("Escolha uma opção: ");
            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption) {
                case 1:
                    funcionarioController.consultarFuncionarios();
                    break;

                case 2:
                    funcionarioController.consultarFuncionarios();
                    System.out.println("Informe o id do funcionario: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();

                    boolean validaDelete = funcionarioController.deletarFuncionario(idDelete);
                    if (validaDelete) {
                        System.out.println("Funcionario deletado com sucesso!");
                    } else {
                        System.out.println("Funcionario não deletado!");
                    }

                    break;

                case 3:
                    Funcionario funcionario = new Funcionario();
                    funcionario.cadastrarFuncionario();

                    boolean validaCadastro = funcionarioController.cadastrarFuncionario(funcionario);

                    if (validaCadastro){
                        System.out.println("Funcionario cadastrado com sucesso!");
                    } else {
                        System.out.println("Funcionario não cadastrado!");
                    }

                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
            }

        }
    }

}
