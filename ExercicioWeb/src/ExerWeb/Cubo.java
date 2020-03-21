package ExerWeb;

public class Cubo extends Figura{
	
	private double resultadoDiagonalMenor = 0;
	private double   resultadoFinalDiagonaMaior = 0;
	private double volumeCubo = 0;

	public Cubo() {}
	
	public Cubo(String nome, double area, double perimetro,double resultadoDiagonalMenor,double resultadoFinalDiagonaMaior ) {
		super(nome, area, perimetro);
		this.resultadoDiagonalMenor =  resultadoDiagonalMenor;
		this.resultadoFinalDiagonaMaior = resultadoFinalDiagonaMaior;	
	}

	@Override
	public double area(double qtdQuadradosCubo, double medidaDaArestaCubo) {
		double  areaTotalCubo = qtdQuadradosCubo * (Math.pow(medidaDaArestaCubo, 2));
		return areaTotalCubo;
	}

	@Override
	public double perimetro(double comprimentoArestaCubo, double CONSTANTE) {
		double perimetroCubo = CONSTANTE * comprimentoArestaCubo;	
		return perimetroCubo;
	}

	public double calcularDiagonaMenorCubo(double aresta) {
		double resultadoDiagonalMenor = Math.pow(aresta, 2) + Math.pow(aresta, 2);	
		return resultadoDiagonalMenor ;
	}
	
	public double calcularDiagonalMaiorCubo(double aresta) {	
		double resultadoParcialDiagonalMaior =  Math.pow(aresta, 2) + resultadoDiagonalMenor;
		double  resultadoFinalDiagonaMaior = Math.sqrt(resultadoParcialDiagonalMaior);
		return  resultadoFinalDiagonaMaior ;
	}

	public double calcularVolumeCubo(double valorLadoCubo) {
		double arestaCubo = Math.sqrt(valorLadoCubo);
		 volumeCubo = Math.pow(arestaCubo, 3);
		return volumeCubo ;
	}
	
	@Override
	public String toString() {
		return "Figura Geométrica: " + super.getNome( )+ "\n" 
				+ "Área: " + this.getArea() + "\n" 
				+ "Perímetro: "+this.getPerimetro()+ "\n" 
				+ "Volume " + this.getVolumeCubo() + "\n" 
				+ "DiagonalMenor: " + this.getResultadoDiagonalMenor() + "\n" 
				+ "Diagonal Maior: " + this.getResultadoFinalDiagonaMaior();
		}

	public double getResultadoDiagonalMenor() {
		return resultadoDiagonalMenor;
	}

	public void setResultadoDiagonalMenor(double resultadoDiagonalMenor) {
		this.resultadoDiagonalMenor = resultadoDiagonalMenor;
	}

	public double getResultadoFinalDiagonaMaior() {
		return resultadoFinalDiagonaMaior;
	}

	public void setResultadoFinalDiagonaMaior(double resultadoFinalDiagonaMaior) {
		this.resultadoFinalDiagonaMaior = resultadoFinalDiagonaMaior;
	}

	public double getVolumeCubo() {
		return volumeCubo;
	}

	public void setVolumeCubo(double volumeCubo) {
		this.volumeCubo = volumeCubo;
	}
}