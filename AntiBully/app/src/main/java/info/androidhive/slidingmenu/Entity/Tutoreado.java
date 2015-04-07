package info.androidhive.slidingmenu.Entity;

/**
 * Created by Daniel on 03/04/15.
 */
public class Tutoreado {

    private String nombre;
    private String apellidos;
    private String grado;
    private String grupo;
    private String id;

    public Tutoreado(String nombre, String apellidos, String grado, String grupo, String id) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.grado = grado;
        this.grupo = grupo;
        this.id = id;
    }
    public Tutoreado(){}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
