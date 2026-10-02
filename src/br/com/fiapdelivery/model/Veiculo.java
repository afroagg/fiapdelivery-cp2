package br.com.fiapdelivery.model;

public class Veiculo {

    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.setPlaca(placa);
        this.setCapacidade(capacidade);
    }

    public String getPlaca() {
        return this.placa;
    }

    public double getCapacidade() {
        return this.capacidade;
    }

    private void setPlaca(String placa) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("Placa informada é invalida!");
        }
    }

    private void setCapacidade(double capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        } else {
            System.out.println("A capacidade do veiculo deve ser maior que zero.");
        }
    }
}