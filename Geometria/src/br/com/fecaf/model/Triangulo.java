package br.com.fecaf.model;

import java.util.Arrays;

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

    public void definirTipoTriangulo(){
        if (base == ladoB && base == ladoC && ladoB == ladoC) {
            System.out.println("/______________________________/");
            System.out.println("Esse Triângulo é Equilátero...");
            System.out.println("/______________________________/");
        }else if (base == ladoB || base == ladoC || ladoB == ladoC){
            System.out.println("/______________________________/");
            System.out.println("Esse Triângulo é Isósceles...");
            System.out.println("/______________________________/");
        }else {
            System.out.println("/______________________________/");
            System.out.println("Esse Triângulo é Escaleno...");
            System.out.println("/______________________________/");
        }
    }

    public void definirTrianguloRetangulo () {

        // c² + c² = h²

        double [] ladosTriangulo = {base, ladoB, ladoC};

        Arrays.sort(ladosTriangulo);

        double cateto1 = ladosTriangulo[0];
        double cateto2 = ladosTriangulo[1];
        double hipotenusa = ladosTriangulo[2];

        if (Math.pow(cateto1, 2) + Math.pow(cateto2, 2) == Math.pow(hipotenusa, 2)) {
            System.out.println("/______________________________/");
            System.out.println("Esse Triângulo é Triângulo Retângulo...");
            System.out.println("/______________________________/");
        }else{
            System.out.println("/______________________________/");
            System.out.println("Esse Triângulo não é um Triângulo Retângulo...");
            System.out.println("/______________________________/");
        }

    }
}
