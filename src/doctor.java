public class doctor extends user {
    private String especialidad;
    private int añosDeExperiencia;

    //Constructor
    public doctor(String dni, String nombre, String especialidad){
        super(dni, nombre);
        this.especialidad = especialidad;
    }

    //Getters and Setters
    public String getEspecialidad(){
        return especialidad;
    }
    public Integer getAñosDeExperiencia(){
        return añosDeExperiencia;
    }

    //Métodos 
    public void incrementaAñosDeExperiencia(){
        this.añosDeExperiencia = añosDeExperiencia + 1;
    }
}
