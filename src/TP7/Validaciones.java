package TP7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
    public static boolean NombreValido(String nombre) {
        return nombre.length() > 2;
    }

    public static boolean validarCUIT(String cuit) { // Codigo 100% robado, llamar este método con !
                                                     // (!validarCuit(cuit))
        cuit = cuit.replaceAll("-", "");

        if (cuit.length() != 11) {
            return false;
        }

        try {
            long cuitNumerico = Long.parseLong(cuit.substring(0, 10));
        } catch (NumberFormatException e) {
            return false;
        }

        int verificador = Integer.parseInt(cuit.substring(10));
        int[] coeficientes = { 5, 4, 3, 2, 7, 6, 5, 4, 3, 2 };
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            suma += Character.getNumericValue(cuit.charAt(i)) * coeficientes[i];
        }

        int resto = suma % 11;
        int digitoCalculado = (resto == 0) ? 0 : (11 - resto);

        return digitoCalculado == verificador;
    }

    public static boolean validarFormatoEmail(String email) {
        // Patrón de expresión regular para validar el formato de email
        String patronEmail = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(patronEmail);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public static boolean validarNumeroCelular(String numeroCelular) {
        // Patrón de expresión regular para validar el número de celular
        String patronNumero = "^[0-9()-]*$";

        Pattern pattern = Pattern.compile(patronNumero);
        Matcher matcher = pattern.matcher(numeroCelular);

        return matcher.matches();
    }

    /*
     * public static void main(String[] args) {
     * String emailValido = "ejemplo@example.com";
     * String emailInvalido = "correo.invalido";
     * 
     * System.out.println("Formato de email válido: " +
     * validarFormatoEmail(emailValido));
     * System.out.println("Formato de email inválido: " +
     * validarFormatoEmail(emailInvalido));
     * String cuitValido = "20-12345678-5";
     * String cuitInvalido = "30-98765432-1";
     * 
     * System.out.println("CUIT válido: " + !validarCUIT(cuitValido));
     * System.out.println("CUIT inválido: " + !validarCUIT(cuitInvalido));
     * }
     */

}
