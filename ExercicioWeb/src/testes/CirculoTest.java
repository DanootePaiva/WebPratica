package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ExerWeb.Circulo;

class CirculoTest {

	Circulo circulo;
	
	@BeforeEach
	void Limpando() {
		circulo = new Circulo("Circulo", 4.0, 9.0, 7.0, 6.0);
	}
	
	@Test
	void testAreaCirculo() {
		double resultado = circulo.area(5.0, .0);
		assertEquals(113.04, resultado, 0.001);
	}
	
	@Test
	void TestPerimetroCirculo() {
		double resultado = circulo.perimetro(5.0, 6.0);
		assertEquals(226.08, resultado, 0.001);
	}
}
