package TP4;
import java.util.ArrayList;
import java.util.List;

public class Pais {
	    private String nombre;
	    private String capital;
	    private List<Frontera> fronteras = new ArrayList<Frontera>();
	    private List<Provincia> provincias = new ArrayList<Provincia>();
	    private List<Pais> limitrofes = new ArrayList<Pais>();
	    
	public Pais(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Pais> getLimitrofes() {
        return limitrofes;
    }

    public void addLimitrofe(Pais pais) {
        limitrofes.add(pais);
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }

    public void addProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public boolean deleteProvincia(Provincia provincia) {
        return provincias.remove(provincia);
    }

    public List<Frontera> getFronteras() {
        return fronteras;
    }

    public void setFronteras(List<Frontera> fronteras) {
        this.fronteras = fronteras;
    }

    public void addFrontera(Frontera frontera) {
        fronteras.add(frontera);
    }

    public boolean deleteFrontera(Frontera frontera) {
        return fronteras.remove(frontera);
    }

    public String toString() {
        return "Pais [nombre=" + nombre + ", capital=" + capital + "]";
    }
}
