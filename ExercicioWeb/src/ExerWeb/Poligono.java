package ExerWeb;

public abstract class Poligono extends Figura {
	
	private double base;
	private double altura;
	
	public Poligono() {}
	
	public Poligono(String nome, double area, double perimetro,double base,double altura) {
		super(nome, area, perimetro);
		this.base =  base;
		this.altura =  altura;
	}
	
	public double calcularAreaFigura(double base,double altura) {	
		double areaCalculadaFigura = Math.pow(base, altura);	
			return areaCalculadaFigura;
	}
	
	public double getBase() {
		return this.getBase();
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setBase(double base) {
			this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
