package segundaparte.src.libreria;

import java.util.ArrayList;

public class Libreria {
	
/*
Reconocer los objetos, su estado y comportamiento, e implementar en JAVA Una librer�a requiere un sistema
	para sus clientes. 
La librer�a vende libros y revistas. 
Un libro se compone de un nombre, autor (solo uno), precio, cantidad de p�ginas, 
	un resumen y el g�nero literario que abarca (solo uno). 
Una revista posee un nombre, un autor, un precio, un n�mero y un a�o 
Del cliente se guarda su nombre y apellido, dni y direcci�n, una lista de autores favoritos y 
	una lista de g�neros que le gusta. 
Tambi�n se guarda el listado de sus compras (sean libros o revistas). 
La librer�a les da descuentos a sus clientes: hay clientes que reciben un 10% de descuento, 
	clientes que reciben un 15% de descuento y clientes que reciben un 30% de descuento. 

Implementar los siguientes servicios: 

1. conocer el precio de un libro o revista para un cliente determinado (considerando el descuento) 

2. conocer si un cliente ya compr� un libro o revista determinado. 

3. conocer si a un cliente le gusta un libro determinado.
A algunos clientes les gusta el libro solo si el autor del mismo est� en su lista de autores favoritos. 
Pero hay clientes m�s exigentes que piden que el autor est� en su lista de favoritos 
	y adem�s que el g�nero tambi�n este en su lista de g�neros favoritos
	
*/
	
	ArrayList<Producto> productos;
	ArrayList<Cliente> clientes;
	
	public Libreria() {
		super();
		this.productos = new ArrayList<Producto>();
		this.clientes = new ArrayList<Cliente>();
	}
	
	//1. conocer el precio de un libro o revista para un cliente determinado (considerando el descuento)
	
	public double getPrecio(Producto p, Cliente c) {
		return p.getPrecio(c);
	}
	
	//2. conocer si un cliente ya compr� un libro o revista determinado. 
	
	public boolean compro(Producto p, Cliente c) {
		return c.compro(p);
	}
	
	/*
	3. conocer si a un cliente le gusta un libro determinado.
	A algunos clientes les gusta el libro solo si el autor del mismo est� en su lista de autores favoritos. 
	Pero hay clientes m�s exigentes que piden que el autor est� en su lista de favoritos 
		y adem�s que el g�nero tambi�n este en su lista de g�neros favoritos
	*/
	
	public boolean leGusta(Libro libro, Cliente c) {
		return c.leGusta(libro);
	}
	
}