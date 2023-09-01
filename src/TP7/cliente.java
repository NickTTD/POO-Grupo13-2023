package TP7;

//• De los Clientes se conoce el nombre, cuit, email y numero de celular.
public class Cliente {
    private String nombre;
    private String cuit;
    private String email;
    private String numeroCelular;

    public String getNumeroCelular() {
        return this.numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    // Getters setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return this.cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    private String celular;

}
/*
 * Desarrolle una aplicación con las siguientes características:
 * • Debe permitir registrar Compras que hacen los Clientes. Cada Compra tiene
 * un detalle de
 * los Productos comprados.
 * • De los Clientes se conoce el nombre, cuit, email y numero de celular.
 * • De la Compra se conoce el Cliente que la realizo, la fecha y el Detalle de
 * la Compra (Lineas
 * de Compra).
 * • Los Productos tienen un nombre, tipo de producto, stock y precio.
 * • Las Lineas de Compra que conforman el Detalle de la Compra, relacionan la
 * Compra con el
 * Producto y especifican la cantidad comprada.
 * La aplicación debe permitir:
 * • Registrar un Cliente. Todos los campos son requeridos.
 * ◦ El nombre debe tener al menos 2 caracteres.
 * ◦ El cuit debe tener un formato válido (buscar algoritmo de validación de
 * cuit).
 * ◦ Validar el formato del mail.
 * ◦ El numero de celular sólo debe tener números, - o ().
 * • Registrar un Producto. Todos los campos son requeridos.
 * ◦ El nombre debe tener al menos 2 caracteres.
 * ◦ El tipo de producto debe ser un enumerado. (Puede elegir que tipo de
 * producto va a tener
 * en el enumerado).
 * ◦ El stock es un numero entero >= 0.
 * ◦ El precio es un numero double positivo de 2 decimales.
 * • Registrar una Compra. Todos los campos son requeridos.
 * ◦ La fecha de la compra es la fecha actual.
 * ◦ El Cliente debe existir.
 * ◦ Para cada Línea de Compra el Producto debe existir y la cantidad debe ser >
 * 0 y <= al
 * stock del Producto.
 * 
 * La Compra debe implementar un método getTotal() que devuelva la sumatoria de
 * los subtotales de
 * cada Línea de Compra.
 * La Línea de Compra debe implementar un método getSubTotal() que devuelva la
 * multiplicación de
 * la cantidad por el precio del Producto.
 * Se desea implementar un esquema de Promociones o descuentos para las Compras.
 * Se establecen las siguientes Promociones:
 * • Compra mayor a $20.000. Aplica un 10% de descuento al total de la compra.
 * • Compra mayor a $50.000. Aplica un 20% de descuento al total de la compra.
 * • Compra día miércoles. Aplica un 20% de descuento al total de la compra.
 * El esquema de Promociones debe ser flexible y permitir agregar o quitar
 * fácilmente Promociones.
 * La Promoción que corresponde se debe asignar al finalizar la carga de la
 * Compra.
 * Para una compra sólo se puede asignar una Promoción.
 * La Promoción asignada afecta al valor que devuelve el método getTotal() de la
 * Compra.
 */