public class paciente extends user {
    private String padecimiento = "Sin asignar";
    private String salaAsignada = "Sin asignar";

    //Valores por default



    //Constructor
    public paciente(String dni, String nombre){
        super(dni, nombre);
    }
    //Getters and Setters

    public String getPadecimiento(){
        return padecimiento;
    } 
    public String getSalaAsiganada(){
        return salaAsignada;
    }

    public void setPadecimiento(String padecimiento){
        this.padecimiento = padecimiento;
    }
    public void setSalaAsignada(String salaAsignada){
        this.salaAsignada = salaAsignada;
    }
}
