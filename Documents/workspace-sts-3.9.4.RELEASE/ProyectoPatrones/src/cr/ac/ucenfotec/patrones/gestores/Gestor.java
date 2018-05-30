package cr.ac.ucenfotec.patrones.gestores;

import cr.ac.ucenfotec.patrones.multis.MultiProceso;
import cr.ac.ucenfotec.patrones.objetos.Tarea;

public class Gestor {

	MultiProceso mp = new MultiProceso();
	
	public void crearProceso(String nombre) {
		mp.crearProceso(nombre);
	}
	
	public void setTarea(Tarea tareas) {
		mp.setTarea(tareas);
	}
	
	public String[] listarProcesos() {
		return mp.listarProcesos();
	}
	
//	public void setPasos(Paso pasos) {
//		mp.setPasos(pasos);
//	}
}
