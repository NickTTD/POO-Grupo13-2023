package TP2;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String nombreEmpleado, nombreEmpleadoMax = "";
        double sueldoEmpleado, sueldoEmpleadoMax = 0, sueldoTotal = 0, sueldoPromedio;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el nombre del empleado " + i + ": ");
            nombreEmpleado = new Scanner(System.in).nextLine();

            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            sueldoEmpleado = Double.parseDouble(new Scanner(System.in).nextLine());

            sueldoTotal += sueldoEmpleado;

            if (sueldoEmpleado > sueldoEmpleadoMax) {
                sueldoEmpleadoMax = sueldoEmpleado;
                nombreEmpleadoMax = nombreEmpleado;
            }
        }

        sueldoPromedio = sueldoTotal / 5;

        System.out.println("\nEmpleado que mas cobra: " + nombreEmpleadoMax + " ($" + sueldoEmpleadoMax + ")");
        System.out.println("Sueldo promedio es : $" + sueldoPromedio);
    }
}