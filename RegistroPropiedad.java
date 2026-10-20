public class RegistroPropiedad {
    public void transferirInmuebles(Propiedad p, Propietario propietarioActual, Propietario nuevoTitular) {
       String estado = p.getEstadoLegal();

       if (estado != null && (estado.equalsIgnoreCase("En embargo") || estado.equalsIgnoreCase("Embargada") || estado.equalsIgnoreCase("embargada"))) {
           System.out.println("Transferencia bloqueada, la propiedad tiene un embargo.");
           return;
       }

       if (p.getPropietario() != null && !p.getPropietario().getDNI().equals(propietarioActual.getDNI())) {
           System.out.println("La propiedad no pertenece al propietario indicado.");
           return;
       }

       p.setPropietario(nuevoTitular);
       System.out.println("Transferencia realizada con éxito.");
       System.out.println("Propiedad: " + p.getDireccion());
       System.out.println("Nuevo titular: " + nuevoTitular.getNombreCompleto());
       System.out.println("DNI: " + nuevoTitular.getDNI());
    }
}
