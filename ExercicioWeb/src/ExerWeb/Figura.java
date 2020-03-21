package ExerWeb;

public abstract class Figura {
	
	private String nome;
	private double area;
	private double perimetro;

	public Figura() {}
	
	public Figura(String nome, double area, double perimetro) {
		super();
		this.nome = nome;
		this.area = area;
		this.perimetro = perimetro;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public abstract double area(double base,double altura);
	public abstract double perimetro(double base,double altura);
}