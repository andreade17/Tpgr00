package logica;

/**
 * Datatype para transportar la informaciÃ³n de un usuario entre capa lÃ³gica y de presentaciÃ³n.
 * En Java los datatypes se definen con setters y getters, y se denominan JavaBean.
 * @author TProg2017
 *
 */
public class DataUsuario {

    private String nombre;
    private String apellido;
    private String cedulaIdentidad;

    public DataUsuario() {
        this.setNombre(new String());
        this.setApellido(new String());
        this.setCedulaIdentidad(new String());
    }

    public DataUsuario(String nom, String ape, String cI) {
        this.setNombre(nom);
        this.setApellido(ape);
        this.setCedulaIdentidad(cI);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    /* Sirve para mostrar textualmente la informaciÃ³n del usuario, por ejemplo en un ComboBox
     */
    public String toString() {
        return getCedulaIdentidad() + " (" + getNombre() + " " + getApellido() + ")";
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    private void setCedulaIdentidad(String cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

}
