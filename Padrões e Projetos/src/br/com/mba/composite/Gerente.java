package br.com.mba.composite;

public class Gerente extends Supervisor {

    public Gerente(String nomeDoSupervisor) {
        super(nomeDoSupervisor);
        this.nomeFuncionario = nomeDoSupervisor;
    }

    @Override
    public void printNomeDoFuncionario() {
        super.printNomeDoFuncionario();
    }

    @Override
    public void adicionar(Funcionario novoFuncionario) {
        super.adicionar(novoFuncionario);
    }

    @Override
    public void remover(Funcionario funcionarioAExcluir) {
        super.remover(funcionarioAExcluir);
    }
}
