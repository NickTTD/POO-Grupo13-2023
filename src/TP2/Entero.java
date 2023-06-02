package TP2;
public class Entero {
    public final String par = null;
    private Long numero;
    //constructor de la clase Enteros
    public Entero(Long numero) {
    super();
    this.numero = numero;
    }
    
    public Long getNumero() {
    return numero;
    }
    public void setNumero(Long numero) {
    this.numero = numero;
    }
    
    //calcula el cuadrado de n
    public Long cuadrado(){ //En java 17 tuve que cambiar el long por int (?)
    return numero*numero;
    }
    //parimpar
    public String par(){ 
        if (numero % 2 == 0) {
            return "Es par";
        } else {
            return "Es impar";
        }
    }
    public long factorial(){ 
        if (numero == 0) {
            return 1;
        } else {
            Entero aux = new Entero(numero- 1L);
            return numero*aux.factorial();
        }
    }
    public boolean esPrimo() {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    }
    