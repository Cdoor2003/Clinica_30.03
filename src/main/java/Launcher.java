import model.*;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args){
        inicializar();
    }

    public static void inicializar(){
        ArrayList<Medico> medicos;
        ArrayList<Administrativo> administrativos;
        ArrayList<Medico> medicosPorEspecialidad;
        ArrayList<Medico> medicos2 = new ArrayList<>();
        ArrayList<Administrativo> administrativos2 = new ArrayList<>();
        ArrayList<Medico> medicos1 = new ArrayList<>();
        ArrayList<Administrativo> administrativos1 = new ArrayList<>();
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        ArrayList<EspecialidadMedica> especialidades = new ArrayList<>();
        Medico medico1 = new Medico("Medico","Diego","quepe","soltero","12345678-0","8-18","pediatria","1-2","juan","si");
        Medico medico2 = new Medico("Medico","Camilo","temuco","casado","87654321-9","8-17","traumatologia","2-3","pedro","si");
        trabajadores.add(medico1);
        trabajadores.add(medico2);
        Administrativo administrativo1 = new Administrativo("asistente social","Bastian","victoria","soltero","18273645-6","9-15","bastian@gmail.com");
        Administrativo administrativo2 = new Administrativo("abogado","Alejandra","santiago","soltero","37467267-2","9-15","alejandra@gmail.com");
        trabajadores.add(administrativo1);
        trabajadores.add(administrativo2);
        EspecialidadMedica especialidad1 = new EspecialidadMedica("pediatria","71.1932","61.4030" ,administrativos1,medicos1);
        EspecialidadMedica especialidad2 = new EspecialidadMedica("traumatologia","18.7101","-125.4773",administrativos2,medicos2);
        especialidades.add(especialidad1);
        especialidades.add(especialidad2);
        medicos1.add(medico1);
        medicos2.add(medico2);
        administrativos1.add(administrativo1);
        administrativos2.add(administrativo2);
        Clinica techy = new Clinica("Clinica techy", "Av. San Martín 1293, Temuco, Araucanía","Privada", trabajadores,especialidades);
        /*medicos = techy.obtenerMedicos();
        for(Medico medico : medicos){
            System.out.println(medico.toString());
        }
        administrativos = techy.obtenerAdministrativos();
        for(Administrativo administrativo: administrativos){
            System.out.println(administrativo.toString());
        }
        medicosPorEspecialidad = techy.obtenerMedicosPorEspecialidad("pediatria");
        for(Medico medico : medicosPorEspecialidad){
            System.out.println(medico.toString());
        }*/
        Administrativo administrativo3 = techy.obtenerAdministrativoNombreRut("18273645-6");
        System.out.println(administrativo3.toString());
    }
}
