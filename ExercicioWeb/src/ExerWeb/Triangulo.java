package ExerWeb;

public class Triangulo  extends Poligono{

	public Triangulo() {}
		
	public Triangulo(double base,double altura) {
	
	}
	
	public Triangulo(String nome, double area, double perimetro, double base, double altura) {
		super(nome, area, perimetro, base, altura);
	}
	
	@Override
	public double area(double base,double altura) {
		double areaTrianguloCalculada = (base * altura) / 2;
		return areaTrianguloCalculada;
	}

	@Override
	public  double perimetro(double base,double altura) {
		double perimetroTriangulo = 2 * (base +  altura);		
		return perimetroTriangulo;
	}
	
	@Override
	public String toString() {
		return "Triangulo \n" 
				+ "Área: " + this.getArea() + "\n"
				+ "Perímetro: " + this.getPerimetro();
	}
}
