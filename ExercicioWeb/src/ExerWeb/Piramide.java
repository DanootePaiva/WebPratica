package ExerWeb;

public class Piramide extends Figura{

	private double areaTotal =0;
	private double calcularVolumePiramide  = 0;
	
	public Piramide() {}

	public Piramide(String nome, double area, double perimetro,double calcularVolumePiramide) {
		super(nome, area, perimetro);
		
		this.areaTotal = areaTotal;
		this.calcularVolumePiramide =  calcularVolumePiramide;
	}


	@Override
	public double area(double areaBase, double areaFacesLaterais) {		
		double areaTotal =  areaBase + areaFacesLaterais;
			return areaTotal;
	}

	@Override
	public double perimetro(double base, double altura) {
		return 0;
	}
	
	public double calcularVolumePiramide(double areaBase,double altura) {
		double calcularVolumePiramide = (1 * areaBase *  altura) / 3;	
		return calcularVolumePiramide;
	}

	public double getAreaTotal() {
		return areaTotal;
	}
	
	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public double getCalcularVolumePiramide() {
		return calcularVolumePiramide;
	}

	public void setCalcularVolumePiramide(double calcularVolumePiramide) {
		this.calcularVolumePiramide = calcularVolumePiramide;
	}
	
	@Override
	public String toString() {
		return super.getNome() + "\n" 
				+ "Área: " + this.getAreaTotal() + "\n"
				+ "Perímetro: " + this.getPerimetro() + "\n" 
				+ "Volume: " + this.getCalcularVolumePiramide();
	}
}