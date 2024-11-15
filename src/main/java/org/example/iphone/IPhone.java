package org.example.iphone;

import java.util.LinkedList;
import java.util.List;

public class IPhone {
    private List<Aplicativo> apps;
    private Aplicativo appAberto;

    public IPhone() {
        this.apps = new LinkedList<>();
    }

    public void instalarApp(Aplicativo app) {
        this.apps.add(app);
    }

    public void abrirApp(int index) {
        this.appAberto = this.apps.get(index);
    }

    public Aplicativo getAppAberto() {
        return appAberto;
    }
}
