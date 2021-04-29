package producto;

public class Producto {

		float precio;
		int stock;
		
		
		public Producto(float precio, int stock) {
			this.precio = precio;
			this.stock = stock;
		}


		public float getPrecio() {
			return precio;
		}


		public void setPrecio(float precio) {
			this.precio = precio;
		}


		public int getStock() {
			return stock;
		}


		public void setStock(int stock) {
			this.stock = stock;
		}
		
		
		
}
