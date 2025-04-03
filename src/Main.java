public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1200.5, 10);
        producto1.mostrarInfo();

        producto1.setPrecio(-100);
        producto1.setCantidad(-5);

        producto1.setNombre("Laptop Gamer");
        producto1.setPrecio(1500.99);
        producto1.setCantidad(5);
        producto1.mostrarInfo();
    }
}