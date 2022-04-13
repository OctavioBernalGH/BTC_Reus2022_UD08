package ejercicio_4;

/*
 * @Autor:		Octavio Bernal Vilana
 * @Fecha:		13/04/2022
 * @Versi�n:	0.0.0.1
 */
public class Serie {

	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	/* Constructor con valores por defecto. */
	public Serie() {
		this.titulo = "default";
		this.temporadas = 3;
		this.entregado = false;
		this.genero = "default";
		this.creador = "default";
	}

	/* Constructor con t�tulo y creador. Lo dem�s por defecto. */
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = 3;
		this.entregado = false;
		this.genero = "default";
		this.creador = creador;
	}

	/*
	 * Constructor con todos los atributos , excepto entregado que es por defecto.
	 */
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	/* Getters y setters */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	/* M�todo toString(). */
	@Override
	public String toString() {
		return "\n\ntitulo=" + titulo + ",\ntemporadas=" + temporadas + ",\nentregado=" + entregado + ",\ngenero=" + genero
				+ ",\ncreador=" + creador + "\n=========";
	}

}
