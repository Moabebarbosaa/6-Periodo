package br.com.mba.composite;

public class Main {

    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Jotage");
        Funcionario atendente = new Atendente("Lucas");
        Funcionario caixa = new Caixa("Messias");

        gerente.adicionar(gerente);
        gerente.printNomeDoFuncionario();

    }
}
