package cr.ac.ucenfotec.patrones.objetos;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
	String nombre;
	AreaFuncional area;
	Paso pasos;
	private List<Paso> arrayPasos = new ArrayList<>();
	
	public Tarea() {
	}
	
	public Tarea(String nombre) {
		this.nombre = nombre;
	}
	
	public Tarea(String nombre, Paso pasos) {
		this.nombre = nombre;
		this.pasos = pasos;
	}

	public Tarea(String nombre, AreaFuncional area, Paso pasos) {
		this.nombre = nombre;
		this.area = area;
		this.pasos = pasos;
		arrayPasos.add(pasos);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public AreaFuncional getArea() {
		return area;
	}

	public void setArea(AreaFuncional area) {
		this.area = area;
	}

	public Paso getPasos() {
		return pasos;
	}

	public void setPasos(Paso pasos) {
		this.pasos = pasos;
		arrayPasos.add(pasos);
	}

	public List<Paso> getArrayPasos() {
		return arrayPasos;
	}
	
	public void setArrayPasos(Paso pasos) {
		arrayPasos.add(pasos);
	}

	@Override
	public String toString() {
		return "Tarea [nombre=" + nombre + ", area=" + area + ", pasos=" + arrayPasos + "]";
	}
	
	
}
