package cr.ac.ucenfotec.patrones.objetos;

public class Paso {
	String nombre;
	String completo;
	
	public Paso() {
		
	}
	
	public Paso(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCompleto() {
		return completo;
	}

	public void setCompleto(String completo) {
		this.completo = completo;
	}

	@Override
	public String toString() {
		return "Paso [nombre=" + nombre + "]";
	}
	
}
