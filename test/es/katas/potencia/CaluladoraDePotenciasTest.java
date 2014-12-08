package es.katas.potencia;

import static org.junit.Assert.*;
import static es.katas.potencia.Multiplicador.*;
import static es.katas.potencia.CalculadoraDePotencias.*;

import org.junit.Test;

public class CaluladoraDePotenciasTest {

	/*
	 * TODO
	 * - 3^0 = 1			<- OK
	 * - 2^1 = 2			<- OK
	 * - 2^3 = 2*2*2		<- OK
	 * - 2*2 = 2+2			<- OK
	 * - 0*2 = 0			<- OK
	 * - 2*0 = 0			<- OK
	 * - 4*3 = 4+4+4		<- OK
	 * - 5*1 = 5			<- OK
	 * - 3^4 = 3*3*3*3		<-
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
	
	@Test public void
	cualquier_numero_elevado_a_cero_devuelve_uno() {
		assertEquals(1, elevar(2, 0));
	}
	
	@Test public void
	cualquier_numero_elevado_a_uno_devuelve_ese_numero() {
		assertEquals(2, elevar(2, 1));
	}
	
	@Test public void
	elevar_es_multiplicar_el_primer_parametro_por_si_mismo_tantas_veces_diga_el_segundo() {
		assertEquals(8, elevar(2, 3));
		assertEquals(81, elevar(3, 4));
	}
}

