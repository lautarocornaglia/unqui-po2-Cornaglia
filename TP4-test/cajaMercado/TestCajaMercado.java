package cajaMercado;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import cliente.Cliente;
import producto.Producto;
import producto.ProductoDeCooperativa;
import producto.ProductoTradicional;

class TestCajaMercado {

	private CajaMercado cajaDelMercadoCentral;
	private Cliente cliente;
	private Producto productoTradicional;
	private Producto productoDeCooperativa;
	
	@BeforeEach
	
	void SetUp() throws Exception{
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		
		productoTradicional = new ProductoTradicional(100,3);
		productoDeCooperativa = new ProductoDeCooperativa(200,3);
		
		productos.add(productoTradicional);
		productos.add(productoDeCooperativa);
		
		cliente = new Cliente("Lautaro",productos);
		cajaDelMercadoCentral = new CajaMercado();
		
		
		cajaDelMercadoCentral.registrarProductos(cliente);		
		
		
	}

	@Test
	void testRegistrarProductos() {
		assertEquals(2, productoTradicional.getStock());
	}
	
	@Test
	void testMontoAPagar() {
		assertEquals(280,cajaDelMercadoCentral.getMontoAPagar());
	}


}
