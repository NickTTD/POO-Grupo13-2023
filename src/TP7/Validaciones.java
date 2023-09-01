package TP7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import TP7.Exceptions.ClienteException;

public class Validaciones{
    public static boolean NombreValido(String nombre) throws ClienteException {
        if (nombre.length() < 2) throw new ClienteException(ClienteException.MSG_NOMBRE);
        return nombre.length() > 2;
    }

    public static boolean validarCUIT(String cuit){
    
        if (cuit.length() != 13) return false;
        
        boolean rv = false;
        int resultado = 0;
        String cuit_nro = cuit.replace("-", "");
        String codes = "6789456789";
        int verificador = Character.getNumericValue(cuit_nro.charAt(cuit_nro.length() - 1));
        int x = 0;
            
        while (x < 10)
        {
            int digitoValidador = Integer.parseInt(codes.substring(x, x+1));
            int digito = Integer.parseInt(cuit_nro.substring(x, x+1));
            int digitoValidacion = digitoValidador * digito;
            resultado += digitoValidacion;
            x++;
        }
        resultado = resultado % 11;
        rv = (resultado == verificador);
        return rv;    
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

    
    public static void main(String[] args) {
    String emailValido = "ejemplo@example.com";
    String emailInvalido = "correo.invalido";

    System.out.println("Formato de email válido: " +
    validarFormatoEmail(emailValido));
    System.out.println("Formato de email inválido: " +
    validarFormatoEmail(emailInvalido));
    String cuitValido = "20-42580943-2";
    String cuitInvalido = "50-98765432-1";

    System.out.println("CUIT válido: " + validarCUIT(cuitValido));
    System.out.println("CUIT inválido: " + validarCUIT(cuitInvalido));
    }


}
