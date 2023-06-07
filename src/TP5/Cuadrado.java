package TP5;

public class Cuadrado extends Rectangulo {

    private Integer lado;

    public Cuadrado(String nombre, String color, Punto centro, Integer lado) {
        super(nombre, color, centro, lado, lado);
        this.lado = lado;
    }

    public Integer getLado() {
        return this.lado;
    }

    public void setLado(Integer lado) {
        this.lado = lado;
        setLadoMayor(lado);
        setLadoMenor(lado);
    }

    public Integer area() {
        return lado * lado;
    }

    public Integer perimetro() {
        return lado*4;
    }

    @Override
    public String toString() {
        return
            super.toString()+
            "{" +
            " lado='" + getLado() + "'" +
            "}";
    }
}