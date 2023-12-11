package br.com.afsj.model;

import br.com.afsj.control.Xadrez;

public class Bispo extends Peca {
    @Override
    public boolean movimentoOK(int x, int y) {
        if (posX == -1 && posY == -1) {
            // Peça ainda não foi movida, então qualquer movimento é válido
            return true;
        }

        // Movimento diagonal
        if (Math.abs(x - posX) == Math.abs(y - posY)) {
            return true;
        }

        return false;
    }
}
