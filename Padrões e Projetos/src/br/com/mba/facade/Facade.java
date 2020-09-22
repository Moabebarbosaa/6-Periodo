package br.com.mba.facade;

public class Facade {

    private Memoria memoria;
    private HD hd;
    private CPU cpu;
    private Acessorios acessorios;
    private SO so;
    private PlacaMae placaMae;

    public Facade(Memoria memoria, HD hd, CPU cpu, Acessorios acessorios, SO so, PlacaMae placaMae) {
        this.memoria = new Memoria();
        this.hd = new HD();
        this.cpu = new CPU();
        this.acessorios = new Acessorios();
        this.so = new SO();
        this.placaMae = new PlacaMae();
    }


    public void montarPC() {
        System.out.println("Montando PC...\n");
        placaMae.adicionarPlacaMae();
        cpu.adicionarProcessador();
        memoria.adicionarMemoria();
        hd.adicionarHD();
        acessorios.adicionarTeclado();
        acessorios.adicionarMouse();
        acessorios.adicionarMonitor();
        so.instalarSO();
        System.out.println("\nPC montado !!");
    }
}
