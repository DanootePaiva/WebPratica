package ExerWeb;

public class Retangulo extends Poligono implements Diagonal{

	
	private double diagonalRetangulo = 0;
	
	public Retangulo() {}
		
	public Retangulo(String nome, double area, double perimetro, double base, double altura,double diagonalRetangulo) {
		super(nome, area, perimetro, base, altura);	
		this.diagonalRetangulo  = diagonalRetangulo;
	}
	
	@Override
	public double calcularDiagonal(double lado1, double lado2) {
		double calcularDiagonalRetanguloParcial = Math.pow(lado1, 2) + Math.pow(lado2, 2);
		double valorFinalDiagonalRetangulo = Math.sqrt(calcularDiagonalRetanguloParcial);
		return valorFinalDiagonalRetangulo;
	}

	@Override
	public double area(double base, double altura) {
		double calcularAreaRetangulo = (base * altura);
		return calcularAreaRetangulo;
	}

	@Override
	public double perimetro(double base,double altura) {
		double perimetroTotal = 2 *  (base +  altura) ;
		return perimetroTotal;
	}

	public double getDiagonalRetangulo() {
		return diagonalRetangulo;
	}

	public void setDiagonalRetangulo(double diagonalRetangulo) {
		this.diagonalRetangulo = diagonalRetangulo;
	}
	
	@Override
	public String toString() {
		return super.getNome() + "\n"
				+"Área: " + this.getArea() + "\n"
				+"Perímetro: " + this.getPerimetro() + "\n" 
				+ "Diagonal: " + this.getDiagonalRetangulo();	
	}
}