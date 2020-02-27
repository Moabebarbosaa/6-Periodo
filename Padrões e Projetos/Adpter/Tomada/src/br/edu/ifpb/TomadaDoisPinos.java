package br.edu.ifpb;

public class TomadaDoisPinos {

    private int fase;
    private int neutro;

    public TomadaDoisPinos(int fase, int neutro) {
        this.fase = fase;
        this.neutro = neutro;
    }

    public void ConectarTomada() {
        System.out.println("Tomada conectada");
        System.out.println("Fase: " + fase);
        System.out.println("Neutro: " + neutro);
    }
}
