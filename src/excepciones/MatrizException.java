package excepciones;

public class MatrizException extends Exception {
	
	public static final String MSG_COLUMNA = 
			Mensajes.getInstance().getMensaje("matriz.columnas.error");
	public static final String MSG_FILA = 
			Mensajes.getInstance().getMensaje("matriz.filas.error");
	public static final String MSG_NO_OBJECT = 
			Mensajes.getInstance().getMensaje("matriz.noobject.error");
	public static final String MSG_FUERA = 
			Mensajes.getInstance().getMensaje("matriz.fuera.error");
	
	private String name;

	public MatrizException(String name) {
		this.name = name;
	}

	public String toString() {
		return "ERROR MATRIZ :" + name;
	}
}
