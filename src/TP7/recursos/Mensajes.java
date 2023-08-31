package TP7.recursos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Mensajes {

	private Properties propiedades;
	private InputStream entrada;

	private static Mensajes mensajes;

	private Mensajes() throws IOException {
		propiedades = new Properties();
		entrada = new FileInputStream("bin/recursos/mensajesError.properties");
		// cargamos el archivo de propiedades
		propiedades.load(entrada);
	}

	public static Mensajes getInstance() {
		if (mensajes == null)
			try {
				mensajes = new Mensajes();
			} catch (IOException ex) {
				System.err.println(ex.getMessage());
			}
		return mensajes;
	}

	public String getMensaje(String clave) {
		return propiedades.getProperty(clave);
	}
}
