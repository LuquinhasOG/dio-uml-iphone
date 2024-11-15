package org.example;

import org.example.iphone.IPhone;
import org.example.iphone.Navegador;
import org.example.iphone.ReprodutorMusical;
import org.example.iphone.Telefone;

public class Main {
    public static void main(String[] args) {
        IPhone cel1 = new IPhone();
        ReprodutorMusical app1 = new ReprodutorMusical();
        Telefone app2 = new Telefone();
        Navegador app3 = new Navegador();

        cel1.instalarApp(app1);
        cel1.instalarApp(app2);
        cel1.instalarApp(app3);

        cel1.abrirApp(0);
        app1 = (ReprodutorMusical) cel1.getAppAberto();
        app1.selecionarMusica("Highway to hell");
        app1.pausar();
        app1.tocar();

        System.out.println();
        cel1.abrirApp(1);
        app2 = (Telefone) cel1.getAppAberto();
        app2.atender();
        app2.iniciarCorreioVoz();
        app2.ligar("(12)91231-2345");

        System.out.println();
        cel1.abrirApp(2);
        app3 = (Navegador) cel1.getAppAberto();
        app3.adicionarNovaAba();
        app3.exibirPagina("www.google.com");
        app3.atualizarPagina();
    }
}