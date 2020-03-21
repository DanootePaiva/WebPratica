package ExerWeb;

public class Cilindro extends Figura implements Diagonal{

	
	
	//Declaração das variaveis
	private double volumeCilindro  = 0;
	private double calcularDiagonalCilindroFinal = 0;
	
	@Override
	public double area(double lateral1, double lateral2) {
		double areaTotalCilindro = lateral1 + lateral2;
		return areaTotalCilindro;
	}

	@Override
	public double perimetro(double base, double altura) {
		return 0;
	}
	public double volumeCilindro(double PI,double raio,double altura) {
		double volumeCilindro = (PI * (Math.pow(raio, 2)) * altura);
		return volumeCilindro;		
	}

	@Override
	public double calcularDiagonal(double diametro, double altura) {
		
	double calcularDiagonalCilindroParcial = Math.pow(diametro, 2) + Math.pow(altura, 2);
	double calcularDiagonalCilindroFinal = Math.sqrt(calcularDiagonalCilindroParcial);
		return calcularDiagonalCilindroFinal;
	}

	public double getVolumeCilindro() {
		return volumeCilindro;
	}

	public void setVolumeCilindro(double volumeCilindro) {
		this.volumeCilindro = volumeCilindro;
	}	
	
	public double getCalcularDiagonalCilindroFinal() {
		return calcularDiagonalCilindroFinal;
	}

	public void setCalcularDiagonalCilindroFinal(double calcularDiagonalCilindroFinal) {
		this.calcularDiagonalCilindroFinal = calcularDiagonalCilindroFinal;
	}

	@Override
	public String toString() {
		return super.getNome() +"\n" 
				+"Área: "+this.getArea()+"\n"
				+"Perímetro:"+ this.getPerimetro() + "\n" 
				+ "Volume: " + this.getVolumeCilindro() + "\n" 
				+ "Diagonal Cilindro: "+ this.getCalcularDiagonalCilindroFinal();
	}
}