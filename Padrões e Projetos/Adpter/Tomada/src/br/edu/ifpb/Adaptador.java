package br.edu.ifpb;

public class Adaptador implements Alvo {
    TomadaDoisPinos tomadaDoisPinos;

    @Override
    public void conectarTomadaDeTresPinos() {
        tomadaDoisPinos.conectarTomadaDoisPinos();
    }
}
