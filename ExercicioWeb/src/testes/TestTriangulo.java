package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ExerWeb.Triangulo;

class TesteTriangulo {
	
	Triangulo triangulo;
	
	
	@BeforeEach
	void Limpando() {
		triangulo = new Triangulo("Triagulo", 5.0, 6.0, 7.0, 8);
		
	}
	
	@Test
	void testAreaTriangulo() { 
		double resultado = triangulo.area(5, 10.0);
		assertEquals(25, resultado);
	}
	
	@Test
	void testPerimetrotriangulo() {
		double resultado = triangulo.perimetro(5.0, 10.0);
		assertEquals(100, resultado);
		
	}

}
