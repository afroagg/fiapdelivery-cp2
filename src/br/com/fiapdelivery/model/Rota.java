package br.com.fiapdelivery.model;

public class Rota {

    private Pacote carga;
    private Veiculo meioTransporte;

    public Rota(Pacote carga, Veiculo meioTransporte) {
        this.carga = carga;
        this.meioTransporte = meioTransporte;
    }

    public void executarRota() {
        this.carga.mudarStatus("Em rota");
        System.out.println("Levando pacote " + this.carga.getCodigo() + " no veiculo " + this.meioTransporte.getPlaca()
                + " | Status: " + this.carga.getStatus());
    }

    public Pacote getCarga() {
        return this.carga;
    }

    public Veiculo getMeioTransporte() {
        return this.meioTransporte;
    }
}