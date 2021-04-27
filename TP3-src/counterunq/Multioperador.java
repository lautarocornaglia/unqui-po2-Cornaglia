package counterunq;

import java.util.ArrayList;

public class Multioperador {
	
	ArrayList<Integer> listaDeNumerosMultioperadores;
	
	
	public Multioperador() {
		this.listaDeNumerosMultioperadores = new ArrayList<Integer>();
	} 
	
	public void addNumber(int i) {
		this.listaDeNumerosMultioperadores.add(i);
	}

	public Integer sumaDeNumeros() {
		int sumaTotal = 0;
		for(int i=0; i< this.listaDeNumerosMultioperadores.size() ; i++) {
			sumaTotal = sumaTotal + this.listaDeNumerosMultioperadores.get(i);

        }
		return sumaTotal;
	}

	public Integer multiplicacionDeNumeros() {
		int multiplicacionTotal = 1;
		for(int i=0; i< this.listaDeNumerosMultioperadores.size() ; i++) {
			multiplicacionTotal = multiplicacionTotal * this.listaDeNumerosMultioperadores.get(i);

        }
		return multiplicacionTotal;
	}

	public Integer restaDeNumeros() {
		int restaTotal = this.listaDeNumerosMultioperadores.get(0);
		for(int i=1; i< this.listaDeNumerosMultioperadores.size() ; i++) {
			restaTotal = restaTotal - this.listaDeNumerosMultioperadores.get(i);
        }
		return restaTotal;
	}
	
}
