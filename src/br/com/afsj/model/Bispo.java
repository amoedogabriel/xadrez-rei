package br.com.afsj.model;

public class Bispo extends Peca{
    @Override
    public boolean movimentoOK(int x, int y) {
        return false;
    }
}
