package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("FIAPDELIVERY:\n");

        Caminhao caminhao = new Caminhao("ABC1234", 5000.0, 3);
        Moto moto = new Moto("XYZ9876", 30.0, true);

        Pacote pacoteGrande = new Pacote("BR999", 10.5);
        Pacote pacotePequeno = new Pacote("BR100", 2.0);

        // A mesma classe Rota aceita caminhao e moto
        Rota rotaCaminhao = new Rota(pacoteGrande, caminhao);
        rotaCaminhao.executarRota();

        Rota rotaMoto = new Rota(pacotePequeno, moto);
        rotaMoto.executarRota();

        pacoteGrande.mudarStatus("Entregue");
        System.out.println("Pacote " + rotaCaminhao.getCarga().getCodigo() + " | Status: " + rotaCaminhao.getCarga().getStatus());

        System.out.println("\nTestes:");
        new Caminhao("DEF5678", -500.0, 3);
        pacotePequeno.mudarStatus("Perdido");
    }
}