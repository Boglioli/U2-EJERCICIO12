public class Propiedad {
    private String direccion;
    private double tasacion;
    private String estadoLegal;
    private Propietario propietario;

    public Propiedad(String direccion, double tasacion, String estadoLegal, Propietario propietario) {
        this.direccion = direccion;
        this.tasacion = tasacion;
        this.estadoLegal = estadoLegal;
        this.propietario = propietario;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstadoLegal() {
        return estadoLegal;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public double getTasacion() {
        return tasacion;
    }
}
