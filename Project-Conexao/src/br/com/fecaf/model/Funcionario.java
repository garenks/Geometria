package br.com.fecaf.model;

import java.util.Scanner;

public class Funcionario {

    private int idFuncionario;
    private String nome;
    private int departamento;
    private int matricula;


    Scanner scanner = new Scanner(System.in);

    public void cadastrarFuncionario () {
        System.out.println("/-------------------  Cadastro --------------------/");
        System.out.println("Informe o nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe o id: ");
        idFuncionario = scanner.nextInt();
        System.out.println("Informe a matricula:");
        matricula = scanner.nextInt();
        System.out.println("Informe o departamento [1- DEV 2 - QA 3 - ENG]");
        departamento = scanner.nextInt();
        scanner.nextLine();
        System.out.println("/-------------------------------------------------/");

    }


    public void exibirInformacoes(){
        System.out.println("/------------- Informações Funcionario -------------/");
        System.out.println(idFuncionario);
        System.out.println(nome);
        System.out.println(matricula);
        System.out.println(departamento);
        System.out.println("/---------------------------------------------------/");

    }


    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
