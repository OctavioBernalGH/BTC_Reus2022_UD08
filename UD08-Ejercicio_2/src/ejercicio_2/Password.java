package ejercicio_2;

public class Password {

	/*
	 * @Autor:		Octavio Bernal Vilana
	 * @Fecha:		13/04/2022
	 * @Versi�n:	0.0.0.1
	 */
	
	/* Atributos de clase */
	private int longitud;
	private String contrase�a = "";
	
	/* Constructor vac�o */
	public Password() {}
	
	/* Constructor con la longitud de la contrase�a */
	public Password(int longitud) {
		this.longitud = longitud;
	}

	/* M�todo de clase que generar� una contrase�a aleatoria */
	public String generarContrase�a() {
		
		int [] generador = new int[longitud];
		
		for(int i = 0; i<generador.length; i++) {
			generador[i] =(int)(Math.random()*10);
			contrase�a += generador[i]+"a"+i;
		}
		
		return contrase�a;
	}

	/* M�todo toString para mostrar la contrase�a generada de forma autom�tica */
	@Override
	public String toString() {
		return "Contrase�a generada: " + generarContrase�a();
	}
	
	
	
}
