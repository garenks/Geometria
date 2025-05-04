package br.com.fecaf.model;

public class Moto extends Veiculo {
    private boolean bau_carga;

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando...");
    }

    public boolean isBau_carga() {
        return bau_carga;
    }

    public void setBau_carga(boolean bau_carga) {
        this.bau_carga = bau_carga;
    }
}
