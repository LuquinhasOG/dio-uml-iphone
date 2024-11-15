package org.example.iphone;

public class ReprodutorMusical implements  Aplicativo {
    public void selecionarMusica(String nome) {
        System.out.println("Reprouduzindo agora a música: " + nome);
    }

    public void tocar() {
        System.out.println("Música tocando");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }
}
