public class enfermera extends user {
    private String salaAsuCargo = "Sin asignar";
    private int pacientesAtentidos = 0;
    private double puntuacionTotal = 0;
    private double puntuacionPromedio = 0;

    //Constructor
    public enfermera(String dni, String nombre){
        super(dni, nombre);
    }

    //Getters and Setters
    public String getSalaAsuCargo(){
        return salaAsuCargo;
    }
    public int getPacienteAtendidos(){
        return pacientesAtentidos;
    }
    public Double getPuntuaciónPromedio(){
        return puntuacionPromedio;
    }

    public void setSalaAsuCargo(String salaAsuCargo){
        this.salaAsuCargo = salaAsuCargo;
    }

    //Métodos
    public void calificaAlaEnfermera(Double puntaje){
        this.puntuacionTotal = this.puntuacionTotal + puntaje;
        this.pacientesAtentidos += 1;
    }

    public void mideElrendimientoPromedioDeLaEnfermera(){
        this.puntuacionPromedio = puntuacionTotal / pacientesAtentidos;
    }
}
