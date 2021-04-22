package counterunq;

import java.util.ArrayList;

public class Counter {
	
	ArrayList<Integer> listaDeNumeros;

	public Counter() {
		this.listaDeNumeros = new ArrayList<Integer>();
	} 
	
	public void addNumber(int i) {
		this.listaDeNumeros.add(i);
	}

	public int cantidadDePares() {
		int cantNumerosPares = 0;
		for(int i=0; i<this.listaDeNumeros.size(); i++)
			if (this.listaDeNumeros.get(i)%2==0) {
				cantNumerosPares = cantNumerosPares + 1;
			}
		return cantNumerosPares;
	}

	public int cantidadDeImpares() {
		int cantNumerosImpares = 0;
		for(int i=0; i<this.listaDeNumeros.size(); i++)
			if (this.listaDeNumeros.get(i)%2!=0) {
				cantNumerosImpares = cantNumerosImpares + 1;
			}
		return cantNumerosImpares;
	}


}
