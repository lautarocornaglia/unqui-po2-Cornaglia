package cajaMercado;

import cliente.Cliente;

public class CajaMercado {
	
	float montoAPagar;

	public float getMontoAPagar() {
		return montoAPagar;
	}

	public void setMontoAPagar(float montoAPagar) {
		this.montoAPagar = montoAPagar;
	}

	public CajaMercado() {
		setMontoAPagar(0);
	}
	
	public void registrarProductos(Cliente cliente) {
		for(int i=0 ; cliente.getProductos().size() > i ; i++) {
			cliente.getProductos().get(i).setStock(cliente.getProductos().get(i).getStock() - 1);
			this.montoAPagar = this.montoAPagar + cliente.getProductos().get(i).calcularPrecioConDesc();
			
		}
		
	}
}
