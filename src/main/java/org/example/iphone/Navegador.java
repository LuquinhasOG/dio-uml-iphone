package org.example.iphone;

public class Navegador implements Aplicativo {
    public void exibirPagina(String link) {
        System.out.println("Exibindo site " + link);
    }

    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
