package br.com.fiapdelivery.model;

public class Moto extends Veiculo {

    private boolean bau;

    public Moto(String placa, double capacidade, boolean bau) {
        super(placa, capacidade);
        this.bau = bau;
    }

    public boolean isBau() {
        return this.bau;
    }
}