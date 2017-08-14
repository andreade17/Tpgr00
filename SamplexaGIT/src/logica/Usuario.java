package logica;

public class Usuario {

	   private String nombre;
	    private String apellido;
	    private String cedulaIdentidad;

	    public Usuario(String nom2, String ape, String ci) {
	        this.nombre = nom2;
	        this.apellido = ape;
	        this.cedulaIdentidad = ci;
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

	    public void setNombre(String n) {
	        nombre = n;
	    }

	    public void setApellido(String ap) {
	        apellido = ap;
	    }

	    public void setCedulaIdentidad(String ci) {
	        cedulaIdentidad = ci;
	    }


}
