package ejercicio_2;

public class Password {

	/*
	 * @Autor:		Octavio Bernal Vilana
	 * @Fecha:		13/04/2022
	 * @Versión:	0.0.0.1
	 */
	
	/* Atributos de clase */
	private int longitud;
	private String contraseña = "";
	
	/* Constructor vacío */
	public Password() {}
	
	/* Constructor con la longitud de la contraseña */
	public Password(int longitud) {
		this.longitud = longitud;
	}

	/* Método de clase que generará una contraseña aleatoria */
	public String generarContraseña() {
		
		int [] generador = new int[longitud];
		
		for(int i = 0; i<generador.length; i++) {
			generador[i] =(int)(Math.random()*10);
			contraseña += generador[i]+"a"+i;
		}
		
		return contraseña;
	}

	/* Método toString para mostrar la contraseña generada de forma automática */
	@Override
	public String toString() {
		return "Contraseña generada: " + generarContraseña();
	}
	
	
	
}
