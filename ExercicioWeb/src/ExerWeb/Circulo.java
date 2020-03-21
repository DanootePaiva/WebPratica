package ExerWeb;

public class Circulo extends Figura{

	//OBS: SITE QUE PERMITE CALCULAR ONLINE AS FIGURAS GEOMÉTRICAS  LINK ABAIXO
	//http://www.calculadoraonline.com.br/geometria

	private double calcularAreaCirculo = 0;
	private double calcularPerimetroCirculo = 0;

	
	public Circulo(String nome, double area, double perimetro,double calcularAreaCirculo,double calcularPerimetroCirculo ) {
		super(nome, area, perimetro);
		this.calcularAreaCirculo = calcularAreaCirculo;
		this.calcularPerimetroCirculo = calcularPerimetroCirculo;
	}
	public Circulo() {	
	}
	
	public double getCalcularAreaCirculo() {
			return calcularAreaCirculo;
		}
	
	public void setCalcularAreaCirculo(double calcularAreaCirculo) {
		this.calcularAreaCirculo = calcularAreaCirculo;
		}
	
	@Override
	public String toString() {
		return this.getNome() + "\n"  
				+"Área: " + this.getCalcularAreaCirculo() + "\n"
				+ "Perímetro: "+this.calcularPerimetroCirculo;
	}
	
	@Override
	public double area(double PI, double raio) {	
		 calcularAreaCirculo = PI * (Math.pow(raio, 2));
		return calcularAreaCirculo;
	}

	@Override
	public double perimetro(double PI,double raio) {	
		 calcularPerimetroCirculo = (2 * PI) * raio ;
		return calcularPerimetroCirculo;
	}
}
