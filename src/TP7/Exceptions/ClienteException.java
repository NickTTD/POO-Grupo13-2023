package TP7.Exceptions;

public class ClienteException extends Exception {
    public static final String MSG_NOMBRE = 
			Mensajes.getInstance().getMensaje("cliente.nombre.error");
	public static final String MSG_CUIT = 
			Mensajes.getInstance().getMensaje("cliente.cuit.error");
	public static final String MSG_EMAIL = 
			Mensajes.getInstance().getMensaje("cliente.email.error");
	public static final String MSG_CELULAR = 
			Mensajes.getInstance().getMensaje("cliente.celular.error");
	
	private String name;

	public ClienteException(String name) {
		this.name = name;
	}

	public String toString() {
		return "ERROR MATRIZ :" + name;
	}
}
