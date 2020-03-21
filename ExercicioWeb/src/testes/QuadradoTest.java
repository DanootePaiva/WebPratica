package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ExerWeb.Quadrado;

class QuadradoTest {
	
	Quadrado quadrado;
	
	@BeforeEach
	void Limpando() {
		quadrado = new Quadrado("Quadrado", 6.0, 5.0, 2.0, 3.0, 7.0);
	}
	
	@Test
	void testAreaQuadrado() {
		double resultado = quadrado.area(6.0, 5.0);
		assertEquals(30, resultado);
	}
	
	@Test
	void PerimetroQuadrado() {
		double resultado = quadrado.perimetro(6.0, 5.0);
		assertEquals(22, resultado);
	}

}
