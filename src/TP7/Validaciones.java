package TP7;

public class Validaciones {
    public static boolean NombreValido(String nombre) {
        return nombre.length() > 2;
    }
    
    public static boolean validarCUIT(String cuit) { //Código 100% robado
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
    public static void main(String[] args) {
        String cuitValido = "20-12345678-5";
        String cuitInvalido = "30-98765432-1";

        System.out.println("CUIT válido: " + validarCUIT(cuitValido));
        System.out.println("CUIT inválido: " + validarCUIT(cuitInvalido));
    }
}

