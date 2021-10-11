package empleado;

public class PorComision extends Empleado {
	
	//Los empleados por comisi�n reciben un sueldo fijo, m�s un porcentaje por la cantidad de ventas realizadas.
	
	private static final double PORCENTAJE = 0.1;
	
	private int cantVentas;
	
	public PorComision(String nombre, double sueldo) {
		super(nombre, sueldo);
		this.cantVentas = 0;
	}
	
	public double sueldoPorSemana() {
		return super.getSueldo() + (this.getCantVentas() * PORCENTAJE);
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}
	
	
	
}