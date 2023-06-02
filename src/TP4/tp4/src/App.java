import java.util.ArrayList;
import java.util.List;

class Continente {
    private String nombre;
    private List<Pais> paises;

    public Continente(String nombre) {
        this.nombre = nombre;
        this.paises = new ArrayList<>();
    }

    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }
}

class Pais {
    private String nombre;
    private String capital;
    private Continente continente;
    private List<Provincia> provincias;

    public Pais(String nombre, String capital, Continente continente) {
        this.nombre = nombre;
        this.capital = capital;
        this.continente = continente;
        this.provincias = new ArrayList<>();
        continente.agregarPais(this);
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }
}

class Provincia {
    private String nombre;

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}