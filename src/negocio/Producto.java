package negocio;

public class Producto {

    private String nombre;
    private double precio;
    private String categoria;

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $ " + precio);
    }

    void mostrarCategoria(){
        System.out.println("Categoria: " + categoria);
    }

    void mostrarPrecioDescuento(){
        double precioDescuento;
        precioDescuento = precio - (precio*0.5);
        System.out.println("Precio Descuento (-50%): $" + precioDescuento );
    }
}