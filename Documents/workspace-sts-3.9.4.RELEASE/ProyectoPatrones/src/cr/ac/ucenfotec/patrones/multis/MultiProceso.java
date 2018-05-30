package cr.ac.ucenfotec.patrones.multis;

import java.util.ArrayList;

import cr.ac.ucenfotec.patrones.objetos.Paso;
import cr.ac.ucenfotec.patrones.objetos.Proceso;
import cr.ac.ucenfotec.patrones.objetos.Tarea;

public class MultiProceso {
	
	private ArrayList<Proceso> procesos;
	private Proceso miProceso = new Proceso();
	private Tarea miTarea = new Tarea();
	
	public MultiProceso() {
		procesos = new ArrayList<>();
	}
	
	public void crearProceso(String nombre) {
		miProceso = new Proceso(nombre);
		procesos.add(miProceso);		
	}
	
	public void setTarea(Tarea tareas) {
		miProceso.setArrayTareas(tareas);
	}
	
	public void setPasos(Paso pasos) {
		miTarea.setArrayPasos(pasos);
	}
	
	public String[] listarProcesos() {
		String []datos;
        int i;
        i= 0;
        datos = new String [procesos.size()];
        for (Proceso var : procesos)
        {
            datos[i] = var.toString();
            i++;
        }
        return datos;
	}
}
