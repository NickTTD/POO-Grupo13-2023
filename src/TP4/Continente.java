package TP4;
import java.util.ArrayList;
import java.util.List;

public class Continente {
	 private String nombre;
	    private List<Pais> paises = new ArrayList<Pais>();

	    public Continente(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    public List<Pais> getPaises() {
	        return paises;
	    }

	    public void setPaises(List<Pais> paises) {
	        this.paises = paises;
	    }

	    public void addPais(Pais pais) {
	        paises.add(pais);
	    }

	    public boolean deletePais(Pais pais) {
	        return paises.remove(pais);
	    }

	    public String toString() {
	        return "Continente [nombre=" + nombre + "]";
	    }
 }
