package TP5;

public class Rectangulo extends Figura {
    private Integer ladoMayor;
    private Integer ladoMenor;

    public Rectangulo (String nombre, String color, Punto centro, Integer ladoMayor, Integer ladoMenor) {
        
        super(nombre, color, centro);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }

    public Integer getLadoMayor() {
        return this.ladoMayor;
    }

    public void setLadoMayor(Integer ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public Integer getLadoMenor() {
        return this.ladoMenor;
    }

    public void setLadoMenor(Integer ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public Integer area() {
        return this.ladoMayor *ladoMenor;
    }
    public Integer perimetro() {
        return ladoMayor*2 + ladoMenor*2;
    }
    public void redimensionar(Integer factor) {
        this.setLadoMayor(factor * this.ladoMayor);
        this.setLadoMenor(factor * this.getLadoMenor());
    }
    public String getNombre(){
        return super.getNombre();
    }

    @Override
    public String toString() {
        return super.toString()+
        "{" +
            " ladoMayor='" + getLadoMayor() + "'" +
            ", ladoMenor='" + getLadoMenor() + "'" +
        "}";
    }
}
