package br.edu.ifpb;

public class ClienteTresPinos {
    private int fase;
    private int neutro;
    private int terra;

    public ClienteTresPinos(int fase, int neutro, int terra) {
        this.fase = fase;
        this.neutro = neutro;
        this.terra = terra;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public int getNeutro() {
        return neutro;
    }

    public void setNeutro(int neutro) {
        this.neutro = neutro;
    }

    public int getTerra() {
        return terra;
    }

    public void setTerra(int terra) {
        this.terra = terra;
    }
}
