package br.com.mba.composite;

public class Presidente extends Supervisor {

    public Presidente(String nomeDoSupervisor) {
        super(nomeDoSupervisor);
        this.nomeFuncionario = nomeDoSupervisor;
    }

    @Override
    public void printNomeDoFuncionario() {
        System.out.println(this.nomeFuncionario);
        for (Funcionario funcionarioTmp : funcionarios) {
            funcionarioTmp.printNomeDoFuncionario();
        }
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
