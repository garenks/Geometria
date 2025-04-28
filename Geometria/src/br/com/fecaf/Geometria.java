package br.com.fecaf;


import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;

public class Geometria {
    public static void main(String[] args) {
        //instanciar Obejto Retangulo
        Retangulo retangulo1 = new Retangulo();

        retangulo1.nome = "retângulo-1";
        retangulo1.lado1 = 10;
        retangulo1.lado2= 5;

        retangulo1.exibirInformacoes();
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();


        //instanciar Obejto Retangulo 2
        Retangulo retangulo2 = new Retangulo();

        retangulo2.nome = "retângulo-2";
        retangulo2.lado1 = 8;
        retangulo2.lado2= 8;

        retangulo2.exibirInformacoes();
        retangulo2.calcularArea();
        retangulo2.calcularPerimetro();

        //validar se é um quadrado
        retangulo1.validarRetanguloEspecial();
        retangulo2.validarRetanguloEspecial();


        //instanciar circulo 1
        Circulo circulo1 = new Circulo();

        circulo1.nome = "circulo 1";
        circulo1.raio = 10;
        circulo1.exibirInformacoes();
        circulo1.calcularArea();
        circulo1.calcularDiamentro();
        circulo1.calcularPerimetro();


        //circulo 2
        Circulo circulo2 = new Circulo();

        circulo2.nome = "circulo 2";
        circulo2.raio = 15;
        circulo2.exibirInformacoes();
        circulo2.calcularArea();
        circulo2.calcularDiamentro();
        circulo2.calcularPerimetro();
    }



}
