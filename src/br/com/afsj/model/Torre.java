package br.com.afsj.model;

public class Torre extends Peca{
    @Override
    public boolean movimentoOK(int x, int y) {
        return false;
    }
}
