package es.katas.potencia;

public class CalculadoraDePotencias {

	public static int elevar(int a, int n) {
		if (n == 0){
			return 1;
		}
		else if (n == 1){
			return a;
		}
		return a * a * elevar(a, n - 2);
	}
}
