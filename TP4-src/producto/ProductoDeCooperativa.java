package producto;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(Integer precio, Integer stock) {
		super(precio, stock);
	}
	
	public float calcularPrecioConDesc() {
		
		float precioFinal = (float) (this.getPrecio() - (this.getPrecio()*0.1));
		
		return precioFinal; 
	}

}
