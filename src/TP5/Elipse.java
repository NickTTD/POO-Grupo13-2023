package TP5;

public class Elipse extends Figura {
    private Integer radioMayor;
    private Integer radioMenor;

    public Elipse(String nombre, String color, Punto centro, Integer radioMayor, Integer radioMenor) {
        super(nombre, color, centro);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public Integer getRadioMayor() {
        return this.radioMayor;
    }

    public void setRadioMayor(Integer radioMayor) {
        this.radioMayor = radioMayor;
    }

    public Integer getRadioMenor() {
        return this.radioMenor;
    }

    public void setRadioMenor(Integer radioMenor) {
        this.radioMenor = radioMenor;
    }

    public Integer area() {
        return (int) Math.PI * this.radioMayor * this.radioMenor;
    }

    public Integer perimetro() {
        return (int) (Math.PI * (3 * (radioMayor + radioMenor) - Math.sqrt((3 * radioMayor + radioMenor) * (radioMayor + 3 * radioMenor))));
    }

    @Override
    public String toString() {
        return 
            super.toString()+
            "{" +
            " radioMayor='" + getRadioMayor() + "'" +
            ", radioMenor='" + getRadioMenor() + "'" +
            "}";
    }
    
}
