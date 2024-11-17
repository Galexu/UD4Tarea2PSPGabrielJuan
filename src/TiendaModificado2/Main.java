package TiendaModificado2;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Cajero cajero1 = new Cajero(tienda);
        Cajero cajero2 = new Cajero(tienda);
        Cajero cajero3 = new Cajero(tienda);
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
        System.out.println("Numero total de transacciones: "+ tienda.getTotalTransacciones());
        System.out.print("Ultimos tres registros: ");
        for (Integer registro : tienda.getUltimosTresRegistros()) {
            System.out.print(registro + " ");
        }
    }
}
