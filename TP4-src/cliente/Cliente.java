package cliente;

import java.util.ArrayList;

import producto.Producto;

public class Cliente {
	
	String nombre;
	ArrayList<Producto> productos;
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public ArrayList<Producto> getProductos() {
		return productos;
	}



	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}



	public Cliente(String nombre, ArrayList<Producto> productos) {
		setNombre(nombre);
		setProductos(productos);
	}
	
}
