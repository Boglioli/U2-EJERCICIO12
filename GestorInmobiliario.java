public class GestorInmobiliario {
    private String nombre;
    private RegistroPropiedad registro;

    public GestorInmobiliario(String nombre, RegistroPropiedad registro) {
        this.nombre = nombre;
        this.registro = registro;
    }

    public void solicitarTransferencia(Propiedad propiedad, Propietario propietarioActual, Propietario nuevoTitular) {
        System.out.println("El gestor " + nombre + " solicita la transferencia de la propiedad.");
        registro.transferirInmuebles(propiedad, propietarioActual, nuevoTitular);
    }

    public void solicitarTransferencia(RegistroPropiedad registro, Propiedad propiedad, Propietario propietarioActual, Propietario nuevoTitular) {
        System.out.println("El gestor " + nombre + " solicita la transferencia de la propiedad.");
        registro.transferirInmuebles(propiedad, propietarioActual, nuevoTitular);
    }
}
