package SaberYGanar;

public abstract class Pregunta {
	private String enunciado;

	public Pregunta(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
	// Método abstracto para responder a la pregunta
	public abstract boolean responder(String respuesta);
}