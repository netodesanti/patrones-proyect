package cr.ac.ucenfotec.patrones.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import cr.ac.ucenfotec.patrones.gestores.Gestor;
import cr.ac.ucenfotec.patrones.objetos.Paso;
import cr.ac.ucenfotec.patrones.objetos.Tarea;

public class UI {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	static Gestor gestor = new Gestor();

	public static void main(String[] args) throws IOException {
		int numSeleccionado;

		do {
			mostrarMenuAdmi();

			numSeleccionado = Integer.parseInt(in.readLine());

			ejecutarAccion(numSeleccionado);

			System.out.println();

		} while (true);

	}

	public static void mostrarMenuAdmi() {
		System.out.println("------------------------------------------");
		System.out.println("Menu principal. Elija una de las opciones");
		System.out.println("1. Crear proceso");
		System.out.println("2. Listar procesos");
		System.out.println("------------------------------------------");
	}

	public static void ejecutarAccion(int numSeleccionado) throws IOException {
		switch (numSeleccionado) {
		case 1:
			crearProceso();
			break;

		case 2:
			listarProcesos();

		default:
			break;
		}
	}

	public static void crearProceso() throws IOException {
		String nombrePro, nombre, nombreP; // nombreAF;
		Tarea miTarea;
		Paso miPaso;

		out.println("\nDigite el nombre del proceso");
		nombrePro = in.readLine();
		gestor.crearProceso(nombrePro);

		for (int i = 0; i < 2; i++) {
			System.out.println("\nDigite el nombre de la tarea");
			nombre = in.readLine();

			miTarea = new Tarea(nombre);

			for (int j = 0; j < 2; j++) {
				System.out.println("Digite el nombre del paso para la tarea: " + nombre);
				nombreP = in.readLine();
				miPaso = new Paso(nombreP);
				miTarea.setArrayPasos(miPaso);
			}

			gestor.setTarea(miTarea);

		}
	}
	
	public static void listarProcesos() {
		for (String var : gestor.listarProcesos()) {
			out.println();
            out.println(var.toString());
        }
	}

}
