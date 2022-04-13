package ejercicio_1;

public class MainApp {

	/*
	 * @Autor:		Octavio Bernal Vilana
	 * @Fecha: 		13/04/2022
	 * @Versión:	0.0.0.1	
	 */
	
	public static void main(String[] args) {
		
		/* Instanciamos un objeto de la clase Persona y le pasamos los valores */
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		
		/* P2 con 3 atributos definidos mediante setter y 1 por defecto. */
		p2.setNombre("Octavio");
		p2.setEdad(29);
		p2.setSexo("Hombre");
		
		/* P3 con 4 atributos definidos mediante setter. */
		p3.setNombre("Octavio");
		p3.setEdad(29);
		p3.setDNI("XXXXXX-X");
		p3.setSexo("Hombre");
		
		/* Imprimimos los valores de los objetos mediante el toString de la clase persona */
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
