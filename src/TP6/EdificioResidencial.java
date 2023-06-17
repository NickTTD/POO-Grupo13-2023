package TP6;

import java.util.Scanner;

public class EdificioResidencial implements ImpactoEcologico {
    private String materialConstruccion;
    private String tipoCalefaccion;
    private Integer Superficie;
    private Double antiguedad;
    public double obtenerImpactoEcologico() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la antiguedad del edificio en años ");
        antiguedad = scanner.nextDouble();
        
        double impactoTotal = antiguedad * 10000;
        
        return impactoTotal;
    }//10.000 = Un edificio residencial emite en promedio 10ton de CO2 por año
}
