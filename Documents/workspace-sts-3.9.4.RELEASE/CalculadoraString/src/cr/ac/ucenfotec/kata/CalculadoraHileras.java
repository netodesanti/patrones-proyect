package cr.ac.ucenfotec.kata;

public class CalculadoraHileras {

	public int add(String string) throws Exception {
		if (string.isEmpty()) {
			return 0;
		}

		String[] numeros = string.split(",|\\;|\\:");

//		if (numeros.length > 3) {
//			throw new Exception("Too many parameters");
//		}

		return sumarTodosLosValores(numeros);
	}

	private int sumarTodosLosValores(String[] numeros) {
		int acumulador = 0;

		for (String numero : numeros) {
			acumulador += Integer.parseInt(numero);
		}

		return acumulador;
	}

}
