package br.com.fecaf.model;

public class Carro implements Veiculo3 {
    @Override
    public void freiar() {
        System.out.println("O carro está freiando...");
    }
}
