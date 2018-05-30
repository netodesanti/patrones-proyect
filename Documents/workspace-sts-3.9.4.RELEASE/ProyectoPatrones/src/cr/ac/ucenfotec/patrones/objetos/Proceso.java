package cr.ac.ucenfotec.patrones.objetos;

import java.util.ArrayList;
import java.util.List;

public class Proceso {
	String nombre;
	Tarea tareas;
	private List<Tarea> arrayTareas = new ArrayList<>();
	
	public Proceso() {
	}

	public Proceso(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tarea getTareas() {
		return tareas;
	}

	public void setTareas(Tarea tareas) {
		this.tareas = tareas;
		arrayTareas.add(tareas);
	}

	public List<Tarea> getArrayTareas() {
		return arrayTareas;
	}
	
	public void setArrayTareas(Tarea tareas) {
		arrayTareas.add(tareas);
	}

	@Override
	public String toString() {
		return "Proceso [nombre=" + nombre + ", tareas=" + arrayTareas + "]";
	}
	
}
