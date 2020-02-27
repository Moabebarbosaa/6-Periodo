package br.edu.ifpb;

public class Main {

    public static void main(String[] args) {
        ClienteTresPinos cliente1 = new ClienteTresPinos(3,4,0);


        Adaptador adaptador = new Adaptador(cliente1);
        adaptador.conectarTomadaDeTresPinos();
    }
}
