package es.katas.potencia;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaluladoraDePotenciasTest {

	/*
	 * TODO
	 * - 2^3 = 2*2*2
	 * - 2*2 = 2+2			<- OK
	 * - 0*2 = 0			<- OK
	 * - 2*0 = 0			<- OK
	 * - 4*3 = 4+4+4		<- PENDIENTE
	 * - 5*1 = 5			<-
	 * - 2^3 = 2*2*2
	 * - 3^4 = 3*3*3*3
	 */
	
	@Test public void
	multiplicar_es_sumar_el_multiplicando_a_si_mismo_tantas_veces_diga_multiplicador() {
		assertEquals(4, multiplicar(2, 2));
		assertEquals(12, multiplicar(4, 3));
	}
	
	@Test public void
	multiplicar_cero_por_cualquier_cosa_devuelve_cero() {
		assertEquals(0, multiplicar(0, 2));
	}
	
	@Test public void
	multiplicar_uno_por_cualquier_numero_devuelve_se_numero() {
		assertEquals(5, multiplicar(5, 1));
	}
	
	@Test public void
	multiplicar_cualquier_cosa_por_cero_devuelve_cero() {
		assertEquals(0, multiplicar(2, 0));
	}

	private int multiplicar(int multiplicando, int multiplicador) {
		if (multiplicando == 0 || multiplicador == 0){
			return 0;
		}

		return 2+2;
	}
}

