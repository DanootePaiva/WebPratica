package ExerWeb;

public class Losango extends Poligono{

	
    private double diagonalMenor = 0;
    private double diagonalMaior = 0;
	
	public Losango() {}
	
	 public Losango(String nome, double area, double perimetro, double base, double altura) {
			super(nome, area, perimetro, base, altura);
			
			this.diagonalMaior = diagonalMaior;
			this.diagonalMenor = diagonalMenor;	
		}

	@Override
	public double area(double diagonalMaior, double diagonaMenor) {
		double calculandoArea = (diagonalMaior * diagonaMenor) / 2;
		return calculandoArea;
	}

	@Override
	public double perimetro(double base,double altura) {
		double perimetroLosango =  2 * (base + altura);
		return perimetroLosango;
	}
	
	public double calcularDiagonalMaior(double area, double diagonalMenor) {	
		double diagonalMaior =  (area * 2) / diagonalMenor;
		return diagonalMaior;
	}	
	
	public double calcularDiagonalMenor(double area, double diagonalMaior) {		
		double diagonalMenor =  (area * 2) /  diagonalMaior;
		return diagonalMenor;
		}

	public double getDiagonalMenor() {
			return diagonalMenor;
		}
		
	public void setDiagonalMenor(double diagonalMenor) {
			this.diagonalMenor = diagonalMenor;
		}
	
	public double getDiagonalMaior() {
			return diagonalMaior;
		}
		
	public void setDiagonalMaior(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
		}
	
		@Override
	public String toString() {
		return "Losango \n" 
				+ "Área: " + super.getArea() + "\n"
				+ "Perímetro: " + super.getPerimetro() + "\n" 
				+ "Diagonal maior: " + diagonalMaior + "\n"
				+"Diagonal menor: " +diagonalMenor ;
		}
}
