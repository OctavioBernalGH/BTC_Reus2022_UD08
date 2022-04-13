package ejercicio_2;

public class MainApp {

	/*
	 * @Autor:		Octavio Bernal Vilana
	 * @Fecha:		13/04/2022
	 * @Versión:	0.0.0.1
	 */
	
	public static void main(String[] args) {

		/*
		 * Instanciamos un objeto de la clase Password y le enviamos un número por
		 * parámetro de constructor para que genere una contraseña aleatoria de longitud 5.
		 * 
		 */
		
		Password contra1 = new Password(5);
		
		/* Al invocar al objeto se ejecuta el método generarContraseña(),
		 * nos genera una contraseña y nos la devuelve mediante toString().
		 */
		System.out.println(contra1);
	}

}
