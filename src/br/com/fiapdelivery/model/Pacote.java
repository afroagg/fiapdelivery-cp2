package br.com.fiapdelivery.model;

public class Pacote {

    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso) {
        this.setCodigo(codigo);
        this.setPeso(peso);
        this.setStatus("Pendente");
    }

    public String getCodigo() {
        return this.codigo;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getStatus() {
        return this.status;
    }

    public void mudarStatus(String novoStatus) {
        this.setStatus(novoStatus);
    }

    private void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Codigo do pacote invalido!");
        }
    }

    private void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso do pacote deve ser maior que zero.");
        }
    }

    // Aceita apenas os status previstos no fluxo de entrega
    private void setStatus(String status) {
        if (status != null && (status.equals("Pendente") || status.equals("Em rota")
                || status.equals("Entregue") || status.equals("Cancelado"))) {
            this.status = status;
        } else {
            System.out.println("Erro: Status invalido: " + status);
        }
    }
}