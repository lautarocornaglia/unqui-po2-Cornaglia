package counterunq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Point.Point;

class counterUnqTestCase {

private Counter counter;
private Multioperador multioperador;    
private Point punto;
private Point puntoDeSuma;


    
    /**
     * Crea un escenario de test b�sico, que consiste en un contador 
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
 	
 	//Ejercicio 6
 	
    this.punto = new Point(0 , 0);
    this.puntoDeSuma = new Point(0 , 0);
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
    
    /*1- Un tipo primitivo est� predefinido por el idioma y se nombra mediante una palabra clave reservada. Los valores primitivos no comparten estado con otros valores primitivos. 
    Los ocho tipos de datos primitivos admitidos por el lenguaje de programaci�n Java son: char, byte, short, int, long, float, double, boolean.*/
    
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
    
    //Ejercicio 5 
    
    /*1. En el sistema de archivos estan organizado los paquetes model.gui y el model.stack estan dentro del paquete model */
    /*2. Son iguales*/
    
    //Ejercicio 6 
    
    @Test
    
    void testPuntoSinValores() {
    	
    	assertEquals(0, this.punto.getX()); 
    	assertEquals(0, this.punto.getY()); 
    }
    
    @Test
    
    void testPuntoIndicado() {
    	this.punto.moverPuntos(1, 2);
    	assertEquals(1, this.punto.getX()); 
    	assertEquals(2, this.punto.getY()); 
    }
    
    @Test
    
    void testPuntoSumadoAOtroPuntoSinValores() {
    	this.punto.moverPuntos(1, 2);
    	this.punto.sumarPunto(this.puntoDeSuma);
    	assertEquals(1, this.punto.getX()); 
    	assertEquals(2, this.punto.getY()); 
    }
    
    @Test
    
    void testPuntoSumadoAOtroPunto() {
    	this.punto.moverPuntos(1, 2);
    	this.puntoDeSuma.moverPuntos(3, 3);
    	this.punto.sumarPunto(this.puntoDeSuma);
    	assertEquals(4, this.punto.getX()); 
    	assertEquals(5, this.punto.getY()); 
    }
    
    //Ejercicio 7
    
    
    
}


