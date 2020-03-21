package ExerWeb;

public class MetodoMain {

	public static void main(String[] args) {

		Circulo circulo =  new Circulo();
		circulo.setNome("Circulo ");
	    double areaCirculo =	circulo.area(Math.PI,10);
		double perimetroCirculo = circulo.perimetro(Math.PI,10);
		
		circulo.setCalcularAreaCirculo(areaCirculo);
		circulo.setPerimetro(perimetroCirculo);
	
		Geometrica geometrica =  new Geometrica();
		geometrica.salvarFiguras(circulo);
		
		Triangulo triangulo = new Triangulo();
		
		triangulo.setNome("Triangulo");
		double areaTriangulo = triangulo.area(10, 10);
		triangulo.setArea(areaTriangulo);
		
	    double perimetroTriangulo = triangulo.perimetro(10,10);
	    triangulo.setPerimetro(perimetroTriangulo);
	    
	    geometrica.salvarFiguras(triangulo);
	    
	    Losango losango =  new Losango();
	    losango.setNome("Losango");
	    double calcularAreaLosango = losango.area(10, 10);
	    losango.setArea(calcularAreaLosango);
	   
	    double calcularAreaPerimetroLosango = losango.perimetro(10,10);
	    losango.setPerimetro(calcularAreaPerimetroLosango);
	    
	   
	    double diagonalMaiorLosango =  losango.calcularDiagonalMaior(10, 10);
	   	losango.setDiagonalMaior(diagonalMaiorLosango);
	   
	   	double diagonalMenorLosango = losango.calcularDiagonalMenor(10, diagonalMaiorLosango);
	   	losango.setDiagonalMenor(diagonalMenorLosango);
	   
	   	geometrica.salvarFiguras(losango);
	   
	   	Retangulo retangulo =  new Retangulo();
	   	double areaTotalRetangulo =  retangulo.area(10, 10);
	   	retangulo.setArea(areaTotalRetangulo);

	   	retangulo.setNome("Retangulo");
	   	double perimetroRetangulo = retangulo.perimetro(10,10);
	   	retangulo.setPerimetro(perimetroRetangulo);
	   	   
	   	double diagonalRetangulo =  retangulo.calcularDiagonal(4, 3);
	  
	   	retangulo.setDiagonalRetangulo(diagonalRetangulo);
	  
	   	geometrica.salvarFiguras(retangulo);

	   	Quadrado quadrado =  new Quadrado();
	   	quadrado.setNome("Quadrado");
	   	double areaQuadrado = quadrado.area(10, 10);
	   	quadrado.setArea(areaQuadrado);
	  
	   	double perimetroQuadrado = quadrado.perimetro(5,5);
	  	quadrado.setPerimetro(perimetroQuadrado);
	  
	  	double diagonalQuadrado = quadrado.calcularDiagonal(10, 7);
	  	quadrado.setDiagonalQuadrado(diagonalQuadrado);
	  	geometrica.salvarFiguras(quadrado);

	  	Cubo cubo =  new Cubo();
	  	double areaCubo = cubo.area(6, 10);
	  	cubo.setNome("Cubo");
	  	cubo.setArea(areaCubo);

	  	double perimetroCubo = cubo.perimetro(10, 12);
	  	cubo.setPerimetro(perimetroCubo);
	  

	  	double diagonalMenorCubo = cubo.calcularDiagonaMenorCubo(5);
	  	cubo.setResultadoDiagonalMenor(diagonalMenorCubo);
	  	double diagonalMaiorCubo = cubo.calcularDiagonalMaiorCubo(5);
	  	cubo.setResultadoFinalDiagonaMaior(diagonalMaiorCubo);
	  
	  	double volumeCubo = cubo.calcularVolumeCubo(10);
	  	cubo.setVolumeCubo(volumeCubo);
	  
	  	geometrica.salvarFiguras(cubo);

	  	Esfera esfera = new Esfera();
	  	double areaEsfera =  esfera.area(Math.PI, 10);
	  	esfera.setNome("Esfera");
	  	esfera.setArea(areaEsfera);
	  	
	  	double calcularPerimetro = esfera.perimetro(Math.PI, 10);
	  	esfera.setPerimetro(calcularPerimetro);
	  	double calcularVolumeEsfera = esfera.calcularVolumeEsfera(Math.PI, 10);
		esfera.setVolumeEsfera(calcularVolumeEsfera);
	
		geometrica.salvarFiguras(esfera);
		
		Cilindro cilindro =  new Cilindro();
		cilindro.setNome("Cilindro");
	
		double areaCilindro = cilindro.area(10, 10);
		cilindro.setArea(areaCilindro);
	
		double volumeCilindro = cilindro.volumeCilindro(Math.PI, 10, 10);
		cilindro.setVolumeCilindro(volumeCilindro);
	
		double diagonalCilindro = cilindro.calcularDiagonal(20, 10);
		cilindro.setCalcularDiagonalCilindroFinal(diagonalCilindro);
	  	geometrica.salvarFiguras(cilindro);
	
	  	Piramide piramide = new Piramide();
	  	piramide.setNome("Piramide");
	
	  	double areaTotal = piramide.area(10, 10);
	  	piramide.setAreaTotal(areaTotal);
	
	  	double calcularVolumePiramide = piramide.calcularVolumePiramide(10, 10);
	  	piramide.setCalcularVolumePiramide(calcularVolumePiramide);
	
	  	geometrica.salvarFiguras(piramide);
	  	geometrica.imprimirFigurasGeometricas();		
	}
}