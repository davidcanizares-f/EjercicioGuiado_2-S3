package negocio;

public class Producto {

    private String nombre;
    private double precio;
    private String categoria;

    public void setNombre(String nombre){
        if(nombre == null || nombre.isBlank()){
            nombre= "S/N";
        }
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setPrecio(double precio){
        if(precio < 0){
            precio = 0;
        }
        this.precio = precio;

    }
    public double getPrecio(){
        return precio;
    }

    public void setCategoria(String categoria){
        if(categoria==null || categoria.isBlank()){
            categoria = "S/N";
        }
        this.categoria=categoria;
    }
    public String getCategoria(){
        return categoria;
    }

    public void aplicarDescuento(double porcentaje){
        if(porcentaje < 0 || porcentaje >100){
            porcentaje=0;
            System.out.println("[!] El porcentaje ingresado fue negativo o mayor a 100.");
        } else {
            System.out.println("[!] Aplicando descuento del " + porcentaje + "%...");
            double descuento = precio * (porcentaje / 100);
            this.precio = precio - descuento;
        }

    }


    /*public void mostrarInformacion(){
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
    }*/
}