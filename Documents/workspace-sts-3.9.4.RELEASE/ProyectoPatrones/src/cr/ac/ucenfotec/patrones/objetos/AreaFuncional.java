package cr.ac.ucenfotec.patrones.objetos;

import java.util.ArrayList;
import java.util.List;

public class AreaFuncional {
	String nombre;
	Empleado empleados;
	private List<Empleado> arrayEmpleados = new ArrayList<>();
	
	public AreaFuncional() {
	}

	public AreaFuncional(String nombre) {
		this.nombre = nombre;
	}

	public AreaFuncional(String nombre, Empleado empleados) {
		this.nombre = nombre;
		this.empleados = empleados;
		arrayEmpleados.add(empleados);
	}

	public AreaFuncional(String nombre, Empleado empleados, List<Empleado> arrayEmpleados) {
		this.nombre = nombre;
		this.empleados = empleados;
		this.arrayEmpleados = arrayEmpleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado empleados) {
		this.empleados = empleados;
		arrayEmpleados.add(empleados);
	}

	public List<Empleado> getArrayEmpleados() {
		return arrayEmpleados;
	}

	@Override
	public String toString() {
		return "AreaFuncional [nombre=" + nombre + ", empleados=" + arrayEmpleados + "]";
	}
	
}
