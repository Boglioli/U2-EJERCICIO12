public class Propietario {
    private String DNI;
    private String nombreCompleto;

    public Propietario(String DNI, String nombreCompleto) {
        this.DNI = DNI;
        this.nombreCompleto = nombreCompleto;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
}
