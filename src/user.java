public class user {
    private String dni = "Sin asignar";
    private String nombre = "Sin asignar";
    private String correo = "Sin asignar";
    private String rol = "Sin asignar";

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
    public void setDni(String dni){
        this.dni = dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 


}
