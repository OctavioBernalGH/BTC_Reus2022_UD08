package ejercicio_4;

/*
 * @Autor:		Octavio Bernal Vilana
 * @Fecha:		13/04/2022
 * @Versión:	0.0.0.1
 */
public class MainApp {

	public static void main(String[] args) {
		
		/* Instanciamos el objeto de la clase serie con los diferentes constructores */
		Serie got = new Serie();
		Serie vikings = new Serie("Vikings", "Federico");
		Serie onePiece = new Serie("One Piece", 10, "Aventuras", "Echiro Poda");
		
		/* Imprimimos los atributos mediante el método toString.*/
		System.out.println(got);
		System.out.println(vikings);
		System.out.println(onePiece);

	}

}
