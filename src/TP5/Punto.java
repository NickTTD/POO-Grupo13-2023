package TP5;

public class Punto {
    private Integer x;
    private Integer y;
    
    public Punto(Integer x, Integer y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return this.x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return this.y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" +
            getX()+ ", " +
            getY() +
            "}";
    }

    
}
