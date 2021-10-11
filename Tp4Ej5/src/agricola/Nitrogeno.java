package agricola;
import java.time.LocalDate;

public class Nitrogeno extends Frio {

	//Informaci�n del m�todo de congelaci�n empleado y del tiempo de exposici�n al nitr�geno
	private String metodoCongelacion;
	private double tiempoExposicion;
	
	public Nitrogeno(String nombre, LocalDate fechaVencmiento, int nroLote, String granjaOrigen,
			LocalDate fechaEnvasado, String codigoOrganismoSA, double tempMantReco, String metodoCongelacion,
			double tiempoExposicion) {
		super(nombre, fechaVencmiento, nroLote, granjaOrigen, fechaEnvasado, codigoOrganismoSA, tempMantReco);
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExposicion = tiempoExposicion;
	}
	
	public Nitrogeno(String nombre, LocalDate fechaVencmiento, int nroLote, String granjaOrigen,
			LocalDate fechaEnvasado, String codigoOrganismoSA, double tempMantReco) {
		super(nombre, fechaVencmiento, nroLote, granjaOrigen, fechaEnvasado, codigoOrganismoSA, tempMantReco);
		this.metodoCongelacion = "Standar";
		this.tiempoExposicion = 1.0;
	}
	
	public String getEtiqueta() {
		return super.getEtiqueta() + "---NITROGENO--- %Modo Congelaci�n: " + this.getMetodoCongelacion() + " %Tiempo de Exposici�n: " + this.getTiempoExposicion() + " hs."; 
	}
	
	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}
	
	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}
	
	public double getTiempoExposicion() {
		return tiempoExposicion;
	}
	
	public void setTiempoExposicion(double tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	
	
	
	
}
