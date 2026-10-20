public class Main {
    public static void main(String[] args) {
        Propietario propietario1 = new Propietario("12345678A", "Juan Pérez");
        Propietario propietario2 = new Propietario("87654321B", "María López");

        Propiedad propiedadLibre = new Propiedad("San Martin 123", 50000000, "Libre", propietario1);
        Propiedad propiedadEmbargada = new Propiedad("Las Heras 456", 35000000, "Embargada", propietario2);

        RegistroPropiedad registro = new RegistroPropiedad();
        GestorInmobiliario gestor = new GestorInmobiliario("Carlos Gómez", registro);

        System.out.println("TRANSFERENCIA EXITOSA:");
        gestor.solicitarTransferencia(propiedadLibre, propietario1, propietario2);
        System.out.println();

        System.out.println("TRANSFERENCIA BLOQUEADA:");
        gestor.solicitarTransferencia(propiedadEmbargada, propietario2, propietario1);
    }
}
