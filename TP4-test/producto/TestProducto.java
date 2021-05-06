package producto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestProducto {

	private Producto producto;
	private ProductoTradicional productoTradicional;
	private ProductoDeCooperativa productoDeCooperativa;
	
	@BeforeEach
	
	public void SetUp() throws Exception{
		
		productoDeCooperativa = new ProductoDeCooperativa(100,10);
		productoTradicional = new ProductoTradicional(100,10);		
	}

	@Test
	void testCalcularPrecioConDesc() {
		assertEquals(90,productoDeCooperativa.calcularPrecioConDesc());
	}

}
