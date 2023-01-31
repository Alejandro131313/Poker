package Poker;

public class Baraja {

	Carta[] cartas = new Carta[54];

	public void generarBaraja() {

		cartas[0] = new Carta("AC", true);
		for (int C = 1; C <= 10; C++) {
			cartas[C] = new Carta(C + "C", true);
			cartas[C+13] = new Carta(C + "R", true);
			cartas[C+26] = new Carta(C + "P", true);
			cartas[C+39] = new Carta(C + "T", true);
		}
		cartas[10] = new Carta("JC", true);
		cartas[11] = new Carta("QC", true);
		cartas[12] = new Carta("KC", true);

		cartas[13] = new Carta("AR", true);
		cartas[23] = new Carta("JR", true);
		cartas[24] = new Carta("QR", true);
		cartas[25] = new Carta("KR", true);

		cartas[26] = new Carta("AP", true);
		cartas[36] = new Carta("JP", true);
		cartas[37] = new Carta("QP", true);
		cartas[38] = new Carta("KP", true);
		
		
		
		cartas[39] = new Carta("AT", true);
		cartas[49] = new Carta("AT", true);
		cartas[50] = new Carta("AT", true);
		cartas[51] = new Carta("AT", true);
		
		cartas[52] = new Carta("Joker", true);
		cartas[53] = new Carta("Joker", true);
		

//		for(int i=0;i<cartas.length;i++) {
//			for(int palo=0;palo<3;palo++) {	
//				for(int valor=0;valor<12;valor++) {	
//				}}}

	}

	public Carta darCarta() {

		return null;
	}

}
