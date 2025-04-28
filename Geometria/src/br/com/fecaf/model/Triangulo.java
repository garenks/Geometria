package br.com.fecaf.model;

public class Triangulo {

    public double base;
    public double ladoB;
    public double ladoC;
    public double altura;
    public String nome;
    public double area;
    public double perimetro;

    public void exibirInformacoe(){
        System.out.println("/______________________________/");
        System.out.println("O nome do objeto é: " + nome);
        System.out.println("A base é: "+ base);
        System.out.println("O lado B é: " + ladoB);
        System.out.println("O lado C é: " + ladoC);
        System.out.println("A altura é: " + altura);
    }

    public Boolean validarTriangulo () {
        System.out.println("/______________________________/");
        if (base + ladoB >= ladoC && base + ladoC >= ladoB && ladoB + ladoC >= base) {
            System.out.println("O objeto " + nome + " é um Triângulo");
            System.out.println("/______________________________/");
            return true;
        }else {
            System.out.println("/______________________________/");
            System.out.println("O objeto " + nome + " não é um Triângulo...");
            System.out.println("/______________________________/");
            return false;

        }
    }

    public void calcularArea (){
        area = (base * altura) / 2;
        System.out.println("/______________________________/");
        System.out.println("A area do objeto " + nome + " é: " + area);
        System.out.println("/______________________________/");
    }

    public void calcularPerimetro() {
        perimetro = base + ladoB + ladoC;
        System.out.println("/______________________________/");
        System.out.println("O perimetro do objeto " + nome + " é:" + perimetro);
        System.out.println("/______________________________/");
    }

}
