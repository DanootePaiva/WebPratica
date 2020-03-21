package ExerWeb;

import java.util.ArrayList;

public class Geometrica {

	ArrayList<Figura> listaFiguras = new ArrayList<Figura>();

	public void salvarFiguras(Figura figura) {
				listaFiguras.add(figura);	
		}
	
	public void imprimirFigurasGeometricas() {
		for(Figura figuras:listaFiguras) {
			System.out.println(figuras);
			System.out.println();
		}
	}
}
