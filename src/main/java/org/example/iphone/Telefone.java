package org.example.iphone;

public class Telefone implements Aplicativo {
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendeu telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Reproduziu mensagem do correio de vóz");
    }
}
