package TP7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String cuit;
        String email;
        String celular;

        do {
            System.out.println("Registro de Cliente");
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();

            // Validar el nombre usando el método de Validaciones
            if (!Validaciones.NombreValido(nombre)) {
                System.out.println("Nombre inválido. Debe tener al menos 2 caracteres.");
                continue; // Vuelve al inicio del bucle
            }

            System.out.print("CUIT: ");
            cuit = scanner.nextLine();

            // Validar el CUIT usando el método de Validaciones
            if (!Validaciones.validarCUIT(cuit)) {
                System.out.println("CUIT inválido.");
                continue; // Vuelve al inicio del bucle
            }

            System.out.print("Email: ");
            email = scanner.nextLine();

            // Validar el formato de email usando el método de Validaciones
            if (!Validaciones.validarFormatoEmail(email)) {
                System.out.println("Email inválido.");
                continue; // Vuelve al inicio del bucle
            }

            System.out.print("Número de Celular: ");
            celular = scanner.nextLine();

            // Validar el número de celular usando el método de Validaciones
            if (!Validaciones.validarNumeroCelular(celular)) {
                System.out.println("Número de celular inválido.");
                continue; // Vuelve al inicio del bucle
            }

            // Si todas las validaciones pasan, crea un nuevo cliente
            Cliente nuevoCliente = new Cliente();
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setCuit(cuit);
            nuevoCliente.setEmail(email);
            nuevoCliente.setCelular(celular);

            System.out.println("Cliente registrado con éxito!");

            // Mostrar los datos del cliente registrado
            System.out.println("Datos del Cliente:");
            System.out.println("Nombre: " + nuevoCliente.getNombre());
            System.out.println("CUIT: " + nuevoCliente.getCuit());
            System.out.println("Email: " + nuevoCliente.getEmail());
            System.out.println("Número de Celular: " + nuevoCliente.getCelular());

            break; // Sale del bucle cuando todos los campos son válidos

        } while (true);
    }
}