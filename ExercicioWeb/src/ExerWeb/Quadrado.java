package ExerWeb;

public class Quadrado extends Poligono implements Diagonal{

	private double diagonalQuadrado = 0;
	
	public Quadrado() {}

	public Quadrado(String nome, double area, double perimetro, double base, double altura,double diagonalQuadrado) {
		super(nome, area, perimetro, base, altura);
		this.diagonalQuadrado =  diagonalQuadrado;		
	}
	
	@Override
	public double calcularDiagonal(double lado1, double lado2) {
		double diagonalQuadradoParcial = Math.pow(lado1, 2) + Math.pow(lado2, 2);
		double diagonalQuadradoFinal = Math.sqrt(diagonalQuadradoParcial);
		return diagonalQuadradoFinal;
	}

	@Override
	public double area(double base, double altura) {
		double areaQuadrado =  (base *  altura) ;
		return areaQuadrado;
	}
	
	public double perimetro(double base,double altura) {
		double perimetroQuadrado =  2 * (base +  altura);
		return perimetroQuadrado;
	}

	public double getDiagonalQuadrado() {
		return diagonalQuadrado;
	}
	
	public void setDiagonalQuadrado(double diagonalQuadrado) {
		this.diagonalQuadrado = diagonalQuadrado;
	}
	
	@Override
	public String toString() {
		return super.getNome() + "\n"
				+ "Área: " + super.getArea() + "\n" 
				+ "Perímetro: " + super.getPerimetro() + "\n"
				+ "Diagonal: " + this.getDiagonalQuadrado();
		}
}
