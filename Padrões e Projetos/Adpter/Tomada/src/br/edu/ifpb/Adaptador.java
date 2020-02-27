package br.edu.ifpb;

public class Adaptador implements Alvo {
    ClienteTresPinos clienteTresPinos;

    public Adaptador(ClienteTresPinos clienteTresPinos) {
        this.clienteTresPinos = clienteTresPinos;
    }

    @Override
    public void conectarTomadaDeTresPinos() {
        TomadaDoisPinos tomadaDoisPinos = new TomadaDoisPinos(clienteTresPinos.getFase(), clienteTresPinos.getNeutro());
        tomadaDoisPinos.ConectarTomada();
    }
}
