package br.com.fecaf;

import br.com.fecaf.model.Imc;

public class Appimc {
    public static void main(String[] args) {

        Imc objImc = new Imc();

        objImc.peso = 77;
        objImc.altura = 1.73;

        objImc.calcularImc();
        objImc.statusImc();


    }
}
