package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ExerWeb.Retangulo;

class RetanguloTest {
	
	Retangulo retangulo;
	
	@BeforeEach
	void Limpando() {
		retangulo = new Retangulo("Retangulo", 2.0, 3.0, 4.0, 5.0, 6.0);
	}

	@Test
	void testAreRetangulo() {
		double resultado = retangulo.area(5.0, 6.0);
		assertEquals(30, resultado);
	}
	
	@Test
	void testPerimetroRetangulo() {
		double resultado = retangulo.perimetro(5.0, 6.0);
		assertEquals(60, resultado);
	}
}
