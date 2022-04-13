package ejercicio_3;

import ejercicio_3.Electrodomestico.Color;
import ejercicio_3.Electrodomestico.Consumo;

/*
 * @Autor:		Octavio Bernal Vilana
 * @Fecha:		13/04/2022
 * @Versión:	0.0.0.1
 */

public class MainApp {

	public static void main(String[] args) {

		// Instancia al enum Color para acceder a los colores
		Color miColor = Color.rojo;
		// Instancia al enum Consumo para acceder a los consumos
		Consumo miConsumo = Consumo.D;

		Electrodomestico lavadora = new Electrodomestico();
		Electrodomestico microondas = new Electrodomestico(150, 30);
		Electrodomestico nevera = new Electrodomestico(200, miColor, miConsumo, 150);

		/* Imprimos los objetos de la clase electrodomestico mediante toString */
		System.out.println(lavadora);
		System.out.println(microondas);
		System.out.println(nevera);
	}

}
