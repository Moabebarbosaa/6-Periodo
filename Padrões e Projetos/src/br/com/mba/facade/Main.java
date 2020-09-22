package br.com.mba.facade;

public class Main {

    public static void main(String[] args) {

        PlacaMae placaMae = new PlacaMae();
        placaMae.adicionarPlacaMae();

        CPU cpu = new CPU();
        cpu.adicionarProcessador();

        Memoria memoria = new Memoria();
        memoria.adicionarMemoria();

        HD hd = new HD();
        hd.adicionarHD();

        Acessorios acessorios = new Acessorios();
        acessorios.adicionarMonitor();
        acessorios.adicionarMouse();
        acessorios.adicionarTeclado();

        SO so = new SO();
        so.instalarSO();

//        Memoria memoria = new Memoria();
//        HD hd = new HD();
//        CPU cpu = new CPU();
//        Acessorios acessorios = new Acessorios();
//        SO so = new SO();
//        PlacaMae placaMae = new PlacaMae();
//
//        Facade facade = new Facade(memoria, hd, cpu, acessorios, so, placaMae);
//        facade.montarPC();

    }
}








