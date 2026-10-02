package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);
        this.setEixos(eixos);
    }

    public int getEixos() {
        return this.eixos;
    }

    private void setEixos(int eixos) {
        if (eixos >= 2) {
            this.eixos = eixos;
        } else {
            System.out.println("Um caminhao deve ter no minimo 2 eixos.");
        }
    }
}