import java.util.ArrayList;
import java.util.Scanner;

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

        paciente pacienteNuevo = new paciente("Sin asignar", "Sin asignar");
        pacienteNuevo.setCorreo("Sin asignar");
        pacienteNuevo.setRol("Sin asignar");
        pacienteNuevo.setPadecimiento("Sin asignar");
        pacienteNuevo.setSalaAsignada("Sin asignar");

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
        Fery.mideElrendimientoPromedioDeLaEnfermera();


        // Panel de navegación
        System.out.println("Iniciando programa");
        System.out.println("______________________________________");
        System.out.println("Bienvenido al programa, ¿Qué necesita?");
        System.out.println("1 = Registrarme");
        System.out.println("2 = Pedir información");
        System.out.println("3 = Pedir una cita");

        Scanner sc = new Scanner(System.in);
        int respuesta = sc.nextInt();
        sc.nextLine();
        sc.close();
        System.out.println("______________________________________");
        
        //Condición IF para puertos iniciales
        if(respuesta == 1){
            //Registrarme
            System.out.println("______________________________________");

            System.out.println("Bienvenido al panel de registro");
            System.out.println("¿Qué rol desea adoptar");
            System.out.println("0 = regresar");
            System.out.println("1 = Paciente");
            System.out.println("2 = Enfermera");
            System.out.println("3 = Doctor");

            Scanner sc3 = new Scanner(System.in);
            int peticion_puerto_registro = sc3.nextInt();
            sc3.nextLine();
            sc3.close();

            System.out.println("______________________________________");
            if (peticion_puerto_registro == 0) {
                //Reinicio
            } else if(peticion_puerto_registro == 1){
                System.out.println("______________________________________");
                System.out.println("Bienvenido paciente, porfavor rellene estos datos");

                System.out.println("Ingrese su DNI");
                Scanner sc3_1 = new Scanner(System.in);
                String dni = sc3_1.nextLine();

                    
                System.out.println("Ingrese su Nombre");
                String nombre = sc3_1.nextLine();


                System.out.println("Ingrese su Correo, sin el <@gmail.com>");
                String correo = sc3_1.nextLine() + "@gmail.com";


                String rol_default = "Paciente";

                System.out.println("Ingrese su padecimiento");
                String padecimiento = sc3_1.nextLine();


                System.out.println("Ingrese la sala a la que quiere ser asignada, solo hay 28 y 36");
                String salaAsignada = sc3_1.nextLine();
    

                // Definición del paciente
                pacienteNuevo.setDni(dni);
                pacienteNuevo.setNombre(nombre);
                pacienteNuevo.setCorreo(correo);
                pacienteNuevo.setRol(rol_default);
                pacienteNuevo.setSalaAsignada(salaAsignada);
                pacienteNuevo.setPadecimiento(padecimiento);

                sc3_1.close();

                listaDePacientes.add(pacienteNuevo);

                System.out.println("______________________________________");

                //Verificación del registro
                int totalDePacientes = listaDePacientes.size();

                if (totalDePacientes == 3){
                    System.out.println("Error, registro fallido");

                } else if(totalDePacientes == 4){
                    System.out.println("El registro fue todo un éxito");
                    //Reinicio

                } else {
                    System.out.println("Algo no salió bien");
                }

                } else if(peticion_puerto_registro == 2){
                    System.out.println("Nada por ahora");

                } else if(peticion_puerto_registro == 3){
                    System.out.println("Nada por ahora");
                }

        } else if(respuesta == 2){

                System.out.println("Bienvenido al panel: ");
                System.out.println("______________________________________");
                System.out.println("¿Qué información busca?");
                System.out.println("0 = regresar");
                System.out.println("1 = Pacientes");
                System.out.println("2 = Enfermeras");
                System.out.println("3 = Doctores");

                Scanner sc2 = new Scanner(System.in);
                int peticion_puerto_informacion = sc2.nextInt();
                sc2.nextLine();
                sc2.close();
                System.out.println("______________________________________");

                //Condición IF de adquisición de información


                
            if(peticion_puerto_informacion == 0){
                    //REINICIO DEL COMANDO
            } else if(peticion_puerto_informacion == 1){
                //Pacientes
                System.out.println("Bienvenido al panel: ");
                int totalDePacientes = listaDePacientes.size();

                if(totalDePacientes == 3){
                    System.out.println("______________________________________");
                System.out.println("Paciente " + Oliver.getDni());
                System.out.println("Nombre: " + Oliver.getNombre());
                System.out.println("Correo electrónico: " + Oliver.getCorreo());
                System.out.println("Rol actual: " + Oliver.getRol());
                System.out.println("Su padecimiento es: " + Oliver.getPadecimiento());
                System.out.println("Descansa en la sala: " + Oliver.getSalaAsiganada());
                System.out.println("______________________________________");

                System.out.println("Paciente " + Albin.getDni());
                System.out.println("Nombre: " + Albin.getNombre());
                System.out.println("Correo electrónico: " + Albin.getCorreo());
                System.out.println("Rol actual: " + Albin.getRol());
                System.out.println("Su padecimiento es: " + Albin.getPadecimiento());
                System.out.println("Descansa en la sala: " + Albin.getSalaAsiganada());
                System.out.println("______________________________________");

                System.out.println("Paciente " + Loktar.getDni());
                System.out.println("Nombre: " + Loktar.getNombre());
                System.out.println("Correo electrónico: " + Loktar.getCorreo());
                System.out.println("Rol actual: " + Loktar.getRol());
                System.out.println("Su padecimiento es: " + Loktar.getPadecimiento());
                System.out.println("Descansa en la sala: " + Loktar.getSalaAsiganada());
                System.out.println("______________________________________");

                } else if(totalDePacientes == 4){
                    System.out.println("______________________________________");
                System.out.println("Paciente " + Oliver.getDni());
                System.out.println("Nombre: " + Oliver.getNombre());
                System.out.println("Correo electrónico: " + Oliver.getCorreo());
                System.out.println("Rol actual: " + Oliver.getRol());
                System.out.println("Su padecimiento es: " + Oliver.getPadecimiento());
                System.out.println("Descansa en la sala: " + Oliver.getSalaAsiganada());
                System.out.println("______________________________________");

                System.out.println("Paciente " + Albin.getDni());
                System.out.println("Nombre: " + Albin.getNombre());
                System.out.println("Correo electrónico: " + Albin.getCorreo());
                System.out.println("Rol actual: " + Albin.getRol());
                System.out.println("Su padecimiento es: " + Albin.getPadecimiento());
                System.out.println("Descansa en la sala: " + Albin.getSalaAsiganada());
                System.out.println("______________________________________");

                System.out.println("Paciente " + Loktar.getDni());
                System.out.println("Nombre: " + Loktar.getNombre());
                System.out.println("Correo electrónico: " + Loktar.getCorreo());
                System.out.println("Rol actual: " + Loktar.getRol());
                System.out.println("Su padecimiento es: " + Loktar.getPadecimiento());
                System.out.println("Descansa en la sala: " + Loktar.getSalaAsiganada());
                System.out.println("______________________________________");

                System.out.println("Paciente " + pacienteNuevo.getDni());
                System.out.println("Nombre: " + pacienteNuevo.getNombre());
                System.out.println("Correo electrónico: " + pacienteNuevo.getCorreo());
                System.out.println("Rol actual: " + pacienteNuevo.getRol());
                System.out.println("Su padecimiento es: " + pacienteNuevo.getPadecimiento());
                System.out.println("Descansa en la sala: " + pacienteNuevo.getSalaAsiganada());
                System.out.println("______________________________________");

                } else {
                    System.out.println("Esteamos teniendo incompatibilidades con el panel de información");
                }
    
            } else if(peticion_puerto_informacion == 2){
                //Enfermeras
                System.out.println("______________________________________");
                System.out.println("Enfermer@: " + Juliana.getDni());
                System.out.println("Nombre: " + Juliana.getNombre());
                System.out.println("Correo electrónico: " + Juliana.getCorreo());
                System.out.println("Rol actual: " + Juliana.getRol());
                System.out.println("Es responsable de la sala N°: " + Juliana.getSalaAsuCargo());
                System.out.println("Ha atentido a: " + Juliana.getPacienteAtendidos() + " pacientes");
                System.out.println("Su puntuación promedio es de: " + Juliana.getPuntuaciónPromedio() + " puntos");

                System.out.println("______________________________________");

                System.out.println("Enfermer@: " + Fery.getDni());
                System.out.println("Nombre: " + Fery.getNombre());
                System.out.println("Correo electrónico: " + Fery.getCorreo());
                System.out.println("Rol actual: " + Fery.getRol());
                System.out.println("Es responsable de la sala N°: " + Fery.getSalaAsuCargo());
                System.out.println("Ha atentido a: " + Fery.getPacienteAtendidos() + " pacientes");
                System.out.println("Su puntuación promedio es de: " + Fery.getPuntuaciónPromedio() + " puntos");

                System.out.println("______________________________________");

            } else if(peticion_puerto_informacion == 3){
                //Doctores
                System.out.println("______________________________________");

                System.out.println("Doctor: " + Juan.getDni());
                System.out.println("Nombre: " + Juan.getNombre());
                System.out.println("Correo electrónico: " + Juan.getCorreo());
                System.out.println("Rol actual: " + Juan.getRol());
                System.out.println("Especialidad: " + Juan.getEspecialidad());
                System.out.println("Años de experiencia: " + Juan.getAñosDeExperiencia() + " años");

                System.out.println("______________________________________");

            }
                


        } else if(respuesta == 3){
            //Pedir una cita médica

        } else {
            System.out.println("Ingrese un valor correcto por favor");
        }
        




    }
}
