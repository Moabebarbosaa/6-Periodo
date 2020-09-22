package br.com.mba.composite;

public abstract class Funcionario {

    public String nomeFuncionario;

    public void printNomeDoFuncionario() {
        System.out.println(nomeFuncionario);
    }

    public abstract void adicionar(Funcionario funcionario);

    public abstract void remover(Funcionario funcionario);

}
