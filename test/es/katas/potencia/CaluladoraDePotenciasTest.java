package es.katas.potencia;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaluladoraDePotenciasTest {

	/*
	 * TODO
	 * - 2^3 = 2*2*2
	 * - 2*2 = 2+2			<- OK
	 * - 0*2 = 0			<-		
	 * - 2*0 = 0			
	 * - 4*3 = 4+4+4
	 * - 2^3 = 2*2*2
	 * - 3^4 = 3*3*3*3
	 */
	
	@Test public void
	multiplicar_es_sumar_el_multiplicando_a_si_mismo_tantas_veces_diga_multiplicador() {
		assertEquals(4, multiplicar(2, 2));
	}
	
	@Test public void
	multiplicar_cero_por_cualquier_cosa_devuelve_cero() {
		assertEquals(0, multiplicar(0, 2));
	}

	private int multiplicar(int i, int j) {
		if (i == 0){
			return 0;
		}

		return 2+2;
	}
}

