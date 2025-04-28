package br.com.fecaf.model;

public class Retangulo {
    public double lado1, lado2;

    public double area;

    public double perimetro;
    public String nome;

    public void exibirInformacoes(){
        System.out.println("/-------------------------/");
        System.out.println("O nome é : " + nome);
        System.out.println("O lado1 é : " + lado1);
        System.out.println("O lado2 é : " + lado2);
        System.out.println("/-------------------------/");
    }

    public void calcularArea(){
        area = lado1 * lado2;
        System.out.println("/-------------------------/");
        System.out.println("Á area do objeto" + nome +  " é : " + area);
        System.out.println("/-------------------------/");

    }
    public void calcularPerimetro (){
        perimetro = 2 * lado1 + 2 * lado2;
        System.out.println("/-------------------------/");
        System.out.println("O perimetro do objeto " + nome + " é : " + perimetro);
        System.out.println("/-------------------------/");
    }


    public void validarRetanguloEspecial(){
        if (lado1 == lado2){
            System.out.println("/-------------------------/");
            System.out.println("O objeto" + nome + " É um retângulo especial (Quadrado) ...");
            System.out.println("/-------------------------/");
        } else {
            System.out.println("/-------------------------/");
            System.out.println("O objeto" + nome + " Não é um retângulo especial ...");
            System.out.println("/-------------------------/");
        }
    }
}
