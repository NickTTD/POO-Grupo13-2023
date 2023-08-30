package TP7;

public class Producto {
    private String nombre;
    private TipoProducto tipo;
    private int stock;
    private double precio;

    // Enumerador para los tipos de producto
    public enum TipoProducto {
        LACTEOS,
        BEBIDAS,
        FIDEOS
    }

    public Producto(String nombre, TipoProducto tipo, int stock, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.stock = stock;
        this.precio = precio;
    }

    // Métodos getter y setter para cada propiedad

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }