package TP5;
public abstract class Figura {
    
    private String nombre;
    private String color;
    private Punto centro;

    public Figura(String nombre, String color, Punto centro) {
        super();
        this.nombre = nombre;
        this.color = color;
        this.centro = centro;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto getCentro() {
        return this.centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", color='" + getColor() + "'" +
            ", centro(XY)='" + getCentro() + "'" +
            "}";
    }
    public abstract Integer area();
    public abstract Integer perimetro();
}