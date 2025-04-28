package br.com.fecaf.model;

public class Circulo {

    public String nome;

    public double raio;
    public double diametro;
    public double area;
    public double perimetro;


    public void exibirInformacoes () {
        System.out.println("/**************************/");
        System.out.println("/**************************/");
        System.out.println("O nome do objeto é: " + nome);
        System.out.println("O raio do objeto é: " + raio);

    }

    public void calcularDiamentro(){
        diametro = 2 * raio;
        System.out.println("O diametro do " + nome + "é: " + diametro);
    }

    public void calcularArea(){
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("/***********************************/");
        System.out.println("O valor da area do objeto " + nome + "é: " + area);
        System.out.println("/***********************************/");
    }

    public void calcularPerimetro () {
        perimetro = 2 * Math.PI * raio;
        System.out.println("/***********************************/");
        System.out.println("O valor do perimetro do objeto" + nome + "é: " + perimetro);
        System.out.println("/***********************************/");
    }
}
