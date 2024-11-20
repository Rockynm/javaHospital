public class user {
    private String dni;
    private String nombre;
    private String correo;
    private String rol;

    public user(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }


    //Geeters and Setters
    public String getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public String getRol(){
        return rol;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setRol(String rol){
        this.rol = rol;
    }


}
