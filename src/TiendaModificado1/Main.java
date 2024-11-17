package TiendaModificado1;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Cajero cajero1 = new Cajero(tienda);
        cajero1.setName("Tienda.Cajero 1");

        Cajero cajero2 = new Cajero(tienda);
        cajero2.setName("Tienda.Cajero 2");

        Cajero cajero3 = new Cajero(tienda);
        cajero3.setName("Tienda.Cajero 3");

        Administrador administrador = new Administrador(tienda);

        cajero1.start();
        cajero2.start();
        cajero3.start();
        administrador.start();

        try {
            cajero1.join();
            cajero2.join();
            cajero3.join();
            System.out.println("Total ventas previo al descuento: " + tienda.getTotalVentas());
            administrador.join();
        } catch (InterruptedException e) {
            System.out.println("Error en join");
            e.printStackTrace();
        }

        System.out.println("Total ventas con descuento: " + tienda.getTotalVentas());
    }
}
