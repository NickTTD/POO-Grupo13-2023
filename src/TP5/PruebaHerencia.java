package TP5;

import java.util.ArrayList;
import java.util.List;
public class PruebaHerencia {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo("Rectangulo 1", "Rojo", new Punto (3,6), 4, 5);
        Rectangulo r2 = new Rectangulo("Rectangulo 2", "Verde", new Punto (7,1), 8, 1);
        Rectangulo r3 = new Rectangulo("Rectangulo 3", "Amarillo", new Punto (9,6), 7, 3);
        //Figura f = new Figura ("figura", "Azul", new Punto (3,7));
        //f.mover(null);
        Cuadrado c1 = new Cuadrado("Cuadrado 1", "Violeta", new Punto (9,6), 7);
        Elipse e = new Elipse ("Elipse", "Azul", new Punto (3,7), 5 , 8);
        Punto punto = new Punto(4,6);

        System.out.println(r1.toString());
        System.out.println(r1.area());
        System.out.println(r1.perimetro());

        List<Figura> lista = new ArrayList<Figura>();
        lista.add(r1);
        lista.add(r2);
        lista.add(r3);
        lista.add(e);
        lista.add(c1);

        // for(Figura r : lista){
        // System.out.println(r.toString());
        // if(r instanceof Rectangulo){
        //     Rectangulo rec = (Rectangulo) r; //esto se llama casting, también se puede usar por ejemplo si queremos cambiar el tamaño de una figura y es un rectangulo (Que es la unica que tiene los metodos implementados)
        //     System.out.println(rec.area());
        //     System.out.println(rec.perimetro());
        // }
        // System.out.println("---------------------");
        // }
        for(Figura r : lista){
            System.out.println(r.toString());
            System.out.println("Area:" + r.area());
            System.out.println("Perimetro:" + r.perimetro());
            System.out.println("---------------------");
            }
    }
}
