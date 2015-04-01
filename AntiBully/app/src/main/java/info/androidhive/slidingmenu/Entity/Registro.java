package info.androidhive.slidingmenu.Entity;

/**
 * Created by Daniel on 31/03/15.
 */
public class Registro {
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String correo;
    private String grado;
    private String grupo;
    private int sexo;
    private String user;
    private String password;
    private int edad;
    private String colonia;//-null
    private String calle;//-null
    private String no_calle;//-null


    public Registro(){}

    public Registro(String nombre, String apellido_paterno, String apellido_materno, String correo,
                           String grado, String grupo, int sexo, String user,
                           String password, int edad, String colonia, String calle, String no_calle) {
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.correo = correo;
        this.grado = grado;
        this.grupo = grupo;
        this.sexo = sexo;
        this.user = user;
        this.password = password;
        this.edad = edad;
        this.colonia = colonia;
        this.calle = calle;
        this.no_calle = no_calle;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNo_calle() {
        return no_calle;
    }

    public void setNo_calle(String no_calle) {
        this.no_calle = no_calle;
    }
}
