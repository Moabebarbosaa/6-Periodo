package br.com.mba.adapter;

public class ContacaoAdapter extends Contacao {

    @Override
    public double getValor() {
        return super.getValor() * 5.36;
    }

    @Override
    public void setValor(double valor) {
        super.setValor(valor / 5.36);
    }

    public double getValorDolar() {
        return super.getValor();
    }
}
