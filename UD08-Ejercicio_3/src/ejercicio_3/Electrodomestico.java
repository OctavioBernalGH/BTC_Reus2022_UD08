package ejercicio_3;

/*
 * @Autor:		Octavio Bernal Vilana
 * @Fecha:		13/04/2022
 * @Versión:	0.0.0.1
 */

public class Electrodomestico {

	public enum Color {
		blanco, negro, rojo, azul, gris
	};

	public enum Consumo {
		A, B, C, D, F
	};

	private Color mycolor;
	private Consumo myconsumo;
	private double precioBase;
	private double peso;

	public Electrodomestico() {
		this.precioBase = 100;
		this.mycolor = Color.blanco;
		this.myconsumo = Consumo.F;
		this.peso = 5;

	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.mycolor = Color.blanco;
		this.myconsumo = Consumo.F;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, Color mycolor, Consumo myconsumo, double peso) {
		this.precioBase = precioBase;
		this.mycolor = mycolor;
		this.myconsumo = myconsumo;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", mycolor=" + mycolor + ", myconsumo=" + myconsumo
				+ ", peso=" + peso + "]";
	}

}
