package br.com.mba.adapter;

public class Main {

    public static void main(String[] args) {
        ContacaoAdapter contacaoAdapter = new ContacaoAdapter();

        contacaoAdapter.setValor(5.00);

        System.out.println("R$ " + contacaoAdapter.getValor());
        System.out.println(" $ " + contacaoAdapter.getValorDolar());
    }
}
