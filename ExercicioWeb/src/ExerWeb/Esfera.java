package ExerWeb;

public class Esfera extends Figura {

	private double volumeEsfera = 0;
		public Esfera() {
	}

	public Esfera(String nome, double area, double perimetro) {
		super(nome, area, perimetro);
	}

	@Override
	public double area(double PI, double raio) {
		double areaEsfera = (4 * PI) * (Math.pow(raio, 2));
		return areaEsfera;
	}

	@Override
	public double perimetro(double PI, double raio) {
		double  perimetroEsfera = 2 * PI  * raio;
		return perimetroEsfera;
	}
	
	public double calcularVolumeEsfera(double PI,double raio) {
		 volumeEsfera =  (4 * PI * raio) / 3;
		return volumeEsfera;
	}
	
	@Override
	public String toString() {
		return super.getNome() + "\n" 
				+ "Área: " + this.getArea() + "\n" 
				+ "Perímetro: " + this.getPerimetro() + "\n" 
				+ "Volume: " + this.getVolumeEsfera();
	}
	
	public double getVolumeEsfera() {
		return volumeEsfera;
	}

	public void setVolumeEsfera(double volumeEsfera) {
		this.volumeEsfera = volumeEsfera;
	}
}
