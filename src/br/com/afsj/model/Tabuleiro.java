package br.com.afsj.model;

import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import br.com.afsj.control.Xadrez;
import br.com.afsj.view.ICavalo;
import br.com.afsj.view.IPeao;
import br.com.afsj.view.IPeca;
import br.com.afsj.view.IRei;
import br.com.afsj.view.ITabuleiro;
import br.com.afsj.view.IRainha;
import br.com.afsj.view.ITorre;
import br.com.afsj.view.IBispo;



public class Tabuleiro {

	protected static JFrame TELA;

	public static ArrayPecas listaBrancas = new ArrayPecas();
	public static ArrayPecas listaPretas = new ArrayPecas();

	protected static int corJogadorAtual = Xadrez.corBRANCA;
	protected static Peca pecaMarcada = null;
	protected static IPeca iPecaMarcada = null;

	protected static ITabuleiro iTabuleiro = new ITabuleiro();

	protected static Peao peaoBranco1 = new Peao();
	protected static IPeao iPeaoBranco1 = new IPeao(peaoBranco1);

	protected static Peao peaoBranco2 = new Peao();
	protected static IPeao iPeaoBranco2 = new IPeao(peaoBranco2);

	protected static Peao peaoPreto1 = new Peao();
	protected static IPeao iPeaoPreto1 = new IPeao(peaoPreto1);

	protected static Cavalo cavaloPreto1 = new Cavalo();
	protected static ICavalo iCavaloPreto1 = new ICavalo(cavaloPreto1);

	protected static Cavalo cavaloBranco1 = new Cavalo();
	protected static ICavalo iCavaloBranco1 = new ICavalo(cavaloBranco1);

	protected static Rei reiPreto1 = new Rei();
	protected static IRei iReiPreto1 = new IRei(reiPreto1);

	protected static Rei reiBranco1 = new Rei();
	protected static IRei iReiBranco1 = new IRei(reiBranco1);

	protected static Rainha rainhaBranca1 = new Rainha();
	protected static IRainha iRainhaBranca1 = new IRainha(rainhaBranca1);

	protected static Rainha rainhaPreta1 = new Rainha();
	protected static IRainha iRainhaPreta1 = new IRainha(rainhaPreta1);

	protected static Torre torreBranca1 = new Torre();
	protected static ITorre iTorreBranca1 = new ITorre(torreBranca1);

	protected static Torre torrePreta1 = new Torre();
	protected static ITorre iTorrePreta1 = new ITorre(torrePreta1);

	protected static Bispo bispoBranco1 = new Bispo();
	protected static IBispo iBispoBranco1 = new IBispo(bispoBranco1);

	protected static Bispo bispoPreta1 = new Bispo();
	protected static IBispo iBispoPreta1 = new IBispo(bispoPreta1);






	// protected static Peca peca = new Peca();

	public void iniciar(Tradutor t) {

		TELA = new JFrame(t.traduzir("Xadrez"));

		// Brancas
		peaoBranco1.setCor(Xadrez.corBRANCA);
		peaoBranco1.mover(0, 6);
		iPeaoBranco1.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco1.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco1.mover(0, 6);
		TELA.getContentPane().add(iPeaoBranco1.getImagem());
		listaBrancas.add(peaoBranco1);

		peaoBranco2.setCor(Xadrez.corBRANCA);
		peaoBranco2.mover(1, 6);
		iPeaoBranco2.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco2.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco2.mover(1, 6);
		TELA.getContentPane().add(iPeaoBranco2.getImagem());
		listaBrancas.add(peaoBranco2);

		cavaloBranco1.setCor(Xadrez.corBRANCA);
		cavaloBranco1.mover(1, 7);
		iCavaloBranco1.setIconeBranco(new ImageIcon("imagens/Cavalo-Brancas-Branco.png"));
		iCavaloBranco1.setIconeMarrom(new ImageIcon("imagens/Cavalo-Brancas-Marrom.png"));
		iCavaloBranco1.mover(1, 7);
		TELA.getContentPane().add(iCavaloBranco1.getImagem());
		listaBrancas.add(cavaloBranco1);

		reiBranco1.setCor(Xadrez.corBRANCA);
		reiBranco1.mover(4, 7);
		iReiBranco1.setIconeBranco(new ImageIcon("imagens/Rei-Brancas-Branco.png"));
		iReiBranco1.setIconeMarrom(new ImageIcon("imagens/Rei-Brancas-Marrom.png"));
		iReiBranco1.mover(4, 7);
		TELA.getContentPane().add(iReiBranco1.getImagem());

		rainhaBranca1.setCor(Xadrez.corBRANCA);
		rainhaBranca1.mover(3, 7);
		iRainhaBranca1.setIconeBranco(new ImageIcon("imagens/Rainha-Brancas-Branco.png"));
		iRainhaBranca1.setIconeMarrom(new ImageIcon("imagens/Rainha-Brancas-Marrom.png"));
		iRainhaBranca1.mover(3, 7);
		TELA.getContentPane().add(iRainhaBranca1.getImagem());

		torreBranca1.setCor(Xadrez.corBRANCA);
		torreBranca1.mover(0, 7);
		iTorreBranca1.setIconeBranco(new ImageIcon("imagens/Torre-Brancas-Branco.png"));
		iTorreBranca1.setIconeMarrom(new ImageIcon("imagens/Torre-Brancas-Marrom.png"));
		iTorreBranca1.mover(0, 7);
		TELA.getContentPane().add(iTorreBranca1.getImagem());

		bispoBranco1.setCor(Xadrez.corBRANCA);
		bispoBranco1.mover(2, 7);
		iBispoBranco1.setIconeBranco(new ImageIcon("imagens/Bispo-Brancas-Branco.png"));
		iBispoBranco1.setIconeMarrom(new ImageIcon("imagens/Bispo-Brancas-Marrom.png"));
		iBispoBranco1.mover(2, 7);
		TELA.getContentPane().add(iBispoBranco1.getImagem());



	

		// Pretas
		peaoPreto1.setCor(Xadrez.corPRETA);
		peaoPreto1.mover(0, 1);
		iPeaoPreto1.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto1.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto1.mover(0, 1);
		TELA.getContentPane().add(iPeaoPreto1.getImagem());
		listaPretas.add(peaoPreto1);

		cavaloPreto1.setCor(Xadrez.corPRETA);
		cavaloPreto1.mover(1, 0);
		iCavaloPreto1.setIconeBranco(new ImageIcon("imagens/Cavalo-Pretas-Branco.png"));
		iCavaloPreto1.setIconeMarrom(new ImageIcon("imagens/Cavalo-Pretas-Marrom.png"));
		iCavaloPreto1.mover(1, 0);
		TELA.getContentPane().add(iCavaloPreto1.getImagem());
		listaPretas.add(cavaloPreto1);

		reiPreto1.setCor(Xadrez.corPRETA);
		reiPreto1.mover(4, 0);
		iReiPreto1.setIconeBranco(new ImageIcon("imagens/Rei-Pretas-Branco.png"));
		iReiPreto1.setIconeMarrom(new ImageIcon("imagens/Rei-Pretas-Marrom.png"));
		iReiPreto1.mover(4, 0);
		TELA.getContentPane().add(iReiPreto1.getImagem());
		listaPretas.add(reiPreto1);

		TELA.getContentPane().add(iTabuleiro.getImagem());
		TELA.setSize(400, 400);
		TELA.setVisible(true);
		TELA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		rainhaPreta1.setCor(Xadrez.corPRETA);
		rainhaPreta1.mover(3, 0);
		iRainhaPreta1.setIconeBranco(new ImageIcon("imagens/Rainha-Pretas-Branco.png"));
		iRainhaPreta1.setIconeMarrom(new ImageIcon("imagens/Rainha-Pretas-Marrom.png"));
		iRainhaPreta1.mover(3, 0);
		TELA.getContentPane().add(iRainhaPreta1.getImagem());

		torrePreta1.setCor(Xadrez.corPRETA);
		torrePreta1.mover(0, 0);
		iTorrePreta1.setIconeBranco(new ImageIcon("imagens/Torre-Pretas-Branco.png"));
		iTorrePreta1.setIconeMarrom(new ImageIcon("imagens/Torre-Pretas-Marrom.png"));
		iTorrePreta1.mover(0, 0);
		TELA.getContentPane().add(iTorrePreta1.getImagem());

		bispoPreta1.setCor(Xadrez.corPRETA);
		bispoPreta1.mover(2, 0);
		iBispoPreta1.setIconeBranco(new ImageIcon("imagens/Bispo-Pretas-Branco.png"));
		iBispoPreta1.setIconeMarrom(new ImageIcon("imagens/Bispo-Pretas-Marrom.png"));
		iBispoPreta1.mover(2, 0);
		TELA.getContentPane().add(iBispoPreta1.getImagem());

		


	}

	public static void avaliarEventoPeca(Peca p, IPeca ip) {
		if (p.getCor() == corJogadorAtual)
			marcarPeca(p, ip);
		else if (pecaMarcada != null)
			capturarPeca(p, ip);
	}

	public static void avaliarEventoTabuleiro(int x, int y) {
		if ((pecaMarcada != null) && (x >= 0) && (x <= 7) && (y >= 0) && (y <= 7)) {
			moverPecaMarcada(x, y);
		}
	}

	public static void marcarPeca(Peca p, IPeca ip) {
		if (iPecaMarcada != null)
			iPecaMarcada.desmarcar();
		pecaMarcada = p;
		iPecaMarcada = ip;
		iPecaMarcada.marcar();
	}

	public static void capturarPeca(Peca p, IPeca ip) {
		if (pecaMarcada.capturar(p.getPosX(), p.getPosY())) {
			ip.remover();
			TELA.getContentPane().remove(ip.getImagem());
			iPecaMarcada.desmarcar();
			iPecaMarcada.mover(p.getPosX(), p.getPosY());
			p.remover();
			pecaMarcada = null;
			iPecaMarcada = null;
			if (corJogadorAtual == Xadrez.corBRANCA)
				corJogadorAtual = Xadrez.corPRETA;
			else
				corJogadorAtual = Xadrez.corBRANCA;
		}
	}

	public static void moverPecaMarcada(int x, int y) {
		int oldX = pecaMarcada.getPosX();
		int oldY = pecaMarcada.getPosY();

		if (pecaMarcada.mover(x, y)) {
			if (pecaMarcada instanceof Rei) {
				Rei rei = (Rei) pecaMarcada;
				List<Peca> pecasDoOponente = (corJogadorAtual == Xadrez.corBRANCA) ? listaPretas : listaBrancas;
				if (rei.reiEmCheck(pecasDoOponente, rei)) {
					// Desfaz o movimento
					pecaMarcada.mover(oldX, oldY);
					System.out.println("Movimento inválido. Rei ficaria em xeque.");
					return;

				}
			}
			iPecaMarcada.desmarcar();
			iPecaMarcada.mover(x, y);
			pecaMarcada = null;
			iPecaMarcada = null;
			if (corJogadorAtual == Xadrez.corBRANCA)
				corJogadorAtual = Xadrez.corPRETA;
			else
				corJogadorAtual = Xadrez.corBRANCA;
		}
	}

	

}
