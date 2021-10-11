package agricola;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
5 - Av�cola 
Una empresa encargada de la comercializaci�n de productos av�colas trabaja con tres tipos de  productos: 

-productos frescos (huevos de gallina blancos y de color, huevos de codorniz, etc),  
-productos refrigerados (pollos frescos, milanesas de pollo, de cerdo y de ternera, pollo  arrollado, chorizos de cerdo, etc) y 
-productos congelados (hamburguesas, papas fritas,  arvejas, granos de ma�z, formas de pollo rebozadas, etc.).

Todos los productos llevan esta  informaci�n com�n: fecha de vencimiento y n�mero de lote.
 
A su vez, cada tipo de producto lleva alguna informaci�n espec�fica. 

Los productos frescos deben llevar la fecha de envasado y la granja de origen.
 
Los productos refrigerados deben llevar el c�digo del organismo de supervisi�n alimentaria, la temperatura de mantenimiento  recomendada 
Los productos congelados deben llevar el c�digo del organismo de supervisi�n alimentaria,la temperatura de mantenimiento recomendada.
 
Hay tres tipos de productos congelados:
-congelados por aire, 
-congelados por agua y 
-congelados por nitr�geno. 

Los productos congelados por aire deben llevar la informaci�n de la composici�n del aire con que fue congelado (% de nitr�geno, % de ox�geno, % de di�xido  de carbono y % de vapor de agua).
Los productos congelados por agua deben llevar la informaci�n de la salinidad del agua con que se realiz� la congelaci�n en gramos de sal por litro de agua.
Los productos congelados por nitr�geno deben llevar la informaci�n del m�todo de congelaci�n empleado y del tiempo de exposici�n al nitr�geno
 
expresada en segundos. Implementar los m�todos necesarios para obtener cada uno de los atributos de un producto.

 Implementar un m�todo que permita obtener la etiqueta de un producto (un String con la combinaci�n de los atributos).

*/
public class Producto {
	private String nombre;
	private LocalDate fechaVencmiento;
	private int nroLote;
	private String granjaOrigen;
	private LocalDate fechaEnvasado;
	
	public Producto(String nombre, LocalDate fechaVencmiento, int nroLote, String granjaOrigen, LocalDate fechaEnvasado) {
		this.nombre = nombre;
		this.fechaVencmiento = fechaVencmiento;
		this.nroLote = nroLote;
		this.granjaOrigen = granjaOrigen;
		this.fechaEnvasado = fechaEnvasado;
	}
	
	public String getEtiqueta() {
		return "Nombre: " + this.getNombre() + " F.V.: " + this.getFechaString(this.getFechaVencmiento()) + 
				" Nro. Lote: " + this.getNroLote() + " G.O: " + this.getGranjaOrigen() + " F.E.: " + this.getFechaString(this.getFechaEnvasado());
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public LocalDate getFechaVencmiento() {
		return fechaVencmiento;
	}
	
	private String getFechaString(LocalDate fecha) {
		String fs = "";
		fs = fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return fs; 
	}
	
	public void setFechaVencmiento(LocalDate fechaVencmiento) {
		this.fechaVencmiento = fechaVencmiento;
	}
	
	public int getNroLote() {
		return nroLote;
	}
	
	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}
	
	public String getGranjaOrigen() {
		return granjaOrigen;
	}
	
	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	
	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}
	
	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	
}
