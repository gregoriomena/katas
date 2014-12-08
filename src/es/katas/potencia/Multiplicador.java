package es.katas.potencia;

public class Multiplicador {

	public static int multiplicar(int multiplicando, int multiplicador) {
		if (multiplicando == 0 || multiplicador == 0){
			return 0;
		}
		if (multiplicando == 1){
			return multiplicador;
		}
		if (multiplicador == 1){
			return multiplicando;
		}

		int resto = multiplicar(multiplicando, multiplicador - 2);
		return multiplicando + multiplicando + resto;
	}
}
