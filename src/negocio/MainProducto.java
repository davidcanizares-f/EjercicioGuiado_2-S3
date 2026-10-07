package negocio;

public class MainProducto {
    public static void main() {
        Producto producto1 = new Producto();
        /*producto1.nombre = "Lavadora";
        producto1.precio = 500;
        producto1.categoria = "Electrodomésticos";*/
        producto1.setNombre("Lavadora");
        producto1.setPrecio(500);
        producto1.setCategoria("Electrodomésticos");

        System.out.println("==== PRODUCTO 1 ====");
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: $ " + producto1.getPrecio());
        System.out.println("Categoría: " + producto1.getCategoria());
        System.out.println("-------------------------------");

        Producto producto2 = new Producto();
        producto2.setNombre("Power Bank");
        producto2.setPrecio(40);
        producto2.setCategoria("Tecnología");

        System.out.println("==== PRODUCTO 2 ====");
        System.out.println("Nombre: " + producto2.getNombre());
        System.out.println("Precio: $ " + producto2.getPrecio());
        System.out.println("Categoría: " + producto2.getCategoria());
        System.out.println("-------------------------------");

        System.out.println("\n--- Métodos Adicionales ---");
        producto2.aplicarDescuento(-50);
        System.out.println(producto2.getNombre() + ": $ " + producto2.getPrecio());
        producto2.aplicarDescuento(50);
        System.out.println(producto2.getNombre() + ": $ " + producto2.getPrecio());



        System.out.println("\n--- Prueba de Datos Incorrectos ---");
        producto1.setNombre("");
        producto1.setPrecio(-600);
        System.out.println(producto1.getNombre() + ": $ " + producto1.getPrecio());

        /*System.out.println("===== PRODUCTO 1 =====");
        producto1.mostrarInformacion();
        producto1.mostrarCategoria();

        System.out.println();

        System.out.println("===== PRODUCTO 2 =====");
        producto2.mostrarInformacion();
        producto2.mostrarCategoria();

        System.out.println();

        System.out.println("----------------------");
        System.out.println(">>>> CAMBIO DE ATRIBUTOS <<<<");
        System.out.println("===== PRODUCTO 2 =====");
        producto2.precio = 36;
        System.out.println("Cambiando el precio de " + producto2.nombre +"...");
        producto2.mostrarInformacion();
        producto2.mostrarCategoria();

        System.out.println("===== PRODUCTO 1 =====");
        producto1.mostrarInformacion();
        producto1.mostrarCategoria();
        System.out.println("----- PROMOCION ! ----");
        producto1.mostrarPrecioDescuento();*/




    }
}