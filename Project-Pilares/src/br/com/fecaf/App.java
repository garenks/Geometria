package br.com.fecaf;

import br.com.fecaf.model.Carro;
import br.com.fecaf.model.Moto;
import br.com.fecaf.model.Veiculo;

public class App {
    public static void main(String[] args) {
        /*Carro carro1 = new Carro();
        carro1.setAno(2024);
        carro1.setMarca("Honda");
        carro1.setModelo("HRV");

        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());

        carro1.acelerar();*/

        Carro carro = new Carro();
        carro.freiar();

        Moto moto1 = new Moto();
        moto1.acelerar();



    }
}
