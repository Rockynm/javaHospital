import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    //Doctor
    doctor Juan = new doctor("8392910", "Juan Pablo", "Cirugía");
    Juan.setCorreo("JuanElDoctor@gmail.com");
    Juan.setRol("Doctor");
    


    //Enfermeras
    enfermera Juliana = new enfermera("3829374", "Juliana Mamani");
    Juliana.setCorreo("jualianajulia@gmail.com");
    Juliana.setRol("Enfermera");
    Juliana.setSalaAsuCargo("Sala 28");

    enfermera Fery = new enfermera("2873627","Fery Llano");
    Fery.setCorreo("feryGO@gmail.com");
    Fery.setRol("Enfermera");
    Fery.setSalaAsuCargo("Sala 36");





    //Pacientes
        paciente Oliver = new paciente("7394050", "Oliver Gutierrez");
        Oliver.setCorreo("oliver@gmail.com");
        Oliver.setRol("Paciente");
        Oliver.setPadecimiento("Gastritis leve");
        Oliver.setSalaAsignada("Sala 28");

        paciente Albin = new paciente("9303907", "Albin Alvino");
        Albin.setCorreo("alvinidad@gmail.com");
        Albin.setRol("Paciente");
        Albin.setPadecimiento("Sangrado leve");
        Albin.setSalaAsignada("Sala 36");

        paciente Loktar = new paciente("9382748", "Loktar Ogar");
        Loktar.setCorreo("loktarOgara@gmail.com");
        Loktar.setRol("Paciente");
        Loktar.setPadecimiento("En proceso...");
        Loktar.setSalaAsignada("sala 28");

        //Listas

        ArrayList<enfermera> listaDeEnfermeras = new ArrayList<>();
        listaDeEnfermeras.add(Juliana);
        listaDeEnfermeras.add(Fery);

        ArrayList<paciente> listaDePacientes = new ArrayList<>();
        listaDePacientes.add(Oliver);
        listaDePacientes.add(Albin);
        listaDePacientes.add(Loktar);



        //FUNCIONES/MÉTODOS
        Juan.incrementaAñosDeExperiencia();
        Juan.incrementaAñosDeExperiencia();
        Juan.incrementaAñosDeExperiencia();
        Juan.incrementaAñosDeExperiencia();
        Juan.incrementaAñosDeExperiencia();
        Juan.incrementaAñosDeExperiencia();

        // Métodos de calificación
        Juliana.calificaAlaEnfermera(20.00);
        Juliana.calificaAlaEnfermera(18.00);
        Juliana.calificaAlaEnfermera(15.00);
        Juliana.calificaAlaEnfermera(9.00);
        Juliana.calificaAlaEnfermera(22.00);
        Juliana.calificaAlaEnfermera(3.00);

        Fery.calificaAlaEnfermera(5.00);
        Fery.calificaAlaEnfermera(10.00);
        Fery.calificaAlaEnfermera(15.00);



        // Hora de la verdad


        Juliana.mideElrendimientoPromedioDeLaEnfermera();
        System.out.println("El puntaje promedio de Juliana es de: " + Juliana.getPuntuaciónPromedio());
        Fery.mideElrendimientoPromedioDeLaEnfermera();
        System.out.println("El puntaje promedio de Fery es de: " + Fery.getPuntuaciónPromedio());

        System.out.println(Oliver.getPadecimiento());




    }
}
