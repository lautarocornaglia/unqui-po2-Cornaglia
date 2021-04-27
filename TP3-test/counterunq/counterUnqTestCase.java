package counterunq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class counterUnqTestCase {

private Counter counter;
private Multioperador multioperador;    
    
    /**
     * Crea un escenario de test básico, que consiste en un contador 
     * con 10 enteros
     * 
     * @throws Exception
     */
    @BeforeEach
    public void setUp() throws Exception {
 
    	
    //Ejercicio 1
   	 //Se crea el contador
   	 counter = new Counter();
   	 
   	 //Se agregan los numeros. Un solo par y nueve impares
   	 counter.addNumber(1);
   	 counter.addNumber(3);
   	 counter.addNumber(5);
   	 counter.addNumber(7);
   	 counter.addNumber(9);
   	 counter.addNumber(1);
   	 counter.addNumber(1);
   	 counter.addNumber(1);
   	 counter.addNumber(1);
   	 counter.addNumber(4);
   	 
   //Ejercicio 4
 	
 	this.multioperador = new Multioperador();
 	multioperador.addNumber(8);
 	multioperador.addNumber(3);
 	multioperador.addNumber(5);
 	multioperador.addNumber(1);
 	multioperador.addNumber(4);
    }
    
    
   	//Ejercicio 2
   	String a = "abc";
	String s = a;
	String t;
	
	//Ejercicio 3
	
	int ejemplo1Ej3;
	Integer ejemplo2Ej3;
	
	
	
	
    //Ejercicio 1
    /**
     * Verifica la cantidad de pares
     */
    @Test
    public void testCantidadDePares() {
   	 
   	 // Getting the even occurrences
   		 int amount = counter.cantidadDePares();
   			 
   	 // I check the amount is the expected one
   		 assertEquals(amount, 1);
    }
    
    /**
     * Verifica la cantidad de impares
     */
    @Test
    public void testCantidadDeImpares() {
   	 
   	 // Getting the even occurrences
   		 int amount = counter.cantidadDeImpares();
   			 
   	 // I check the amount is the expected one
   		 assertEquals(amount, 9);
    }
    
    //Ejercicio 2
    
    @Test
    void testPunto2() {
        assertEquals(3, s.length()); 
    		//el test funciona correctamente
        assertEquals(t,null); 
    		//t tiene un valor null ya que no se le asigna un valor
        assertEquals("1abc", 1+a); 
    		//al ser un numero sumandose a un string "abc" el valor que retorna es 1abc
        assertEquals("ABC", a.toUpperCase()); 
    		//hace que todo el string este en mayuscula, devuelve "ABC"
        assertEquals(4, "Libertad".indexOf("r")); 
    		//devuelve la ubicacion de la letra en el string dado
        assertEquals(7,"Universidad".lastIndexOf("i")); 
    		//devuelve la ultima vez que aparece la letra en la palabra
        assertEquals("il","Quilmes".substring(2,4)); 
    		//devuelve un string desde un index a otro index
        assertEquals(true,(a+a.length()).startsWith("a")); 
    		//devuelve un valor booleano, si empieza con a devuelve true y cualquier otro caso false
        assertEquals(true, s==a); 
    		//los compara y devuelve true
        assertEquals(true,a.substring(1,3).equals("bc")); 
        	//devuelve verdadero si el substring de a es igual a bc

    }
    
    //Ejercicio 3
    
    /*1- Un tipo primitivo está predefinido por el idioma y se nombra mediante una palabra clave reservada. Los valores primitivos no comparten estado con otros valores primitivos. 
    Los ocho tipos de datos primitivos admitidos por el lenguaje de programación Java son: char, byte, short, int, long, float, double, boolean.*/
    
    /*2- La diferencia es que Int es un tipo primitivo e Integer es una clase.
     	Los tipos int almacenan el valor binario real para el entero que desea representar, en cambio los tipo Integer almacenan referencias a Integerobjetos*/
    
    //3
    @Test 
    
    void testPunto3PruebaInt() {
    	assertEquals(0, ejemplo1Ej3);
    }
    void testPunto3PruebaInteger() {
		assertEquals(null, ejemplo2Ej3);
    }
    /*4- Dan como resultado los mismos valores que el punto 3*/
    
    //Ejercicio 4
    
    @Test
    
    void testSumaDeNumeros() {
    	assertEquals(21, this.multioperador.sumaDeNumeros());
    }
    
    @Test
    
    void testMultiplicacionDeNumeros() {
    	assertEquals(480, this.multioperador.multiplicacionDeNumeros());
    }
    
    @Test
    
    void testRestaDeNumeros() {
    	assertEquals(-5, this.multioperador.restaDeNumeros());
    }
}


