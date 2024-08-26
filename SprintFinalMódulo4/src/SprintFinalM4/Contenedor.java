package SprintFinalM4;

import java.util.ArrayList;
import java.util.List;
/**
* Clase Contenedor que administra listas de instancias de la interfaz Asesoria
* y de la clase Capacitación. Permite almacernar cliente, profesional, administrativo, capacitación.
* Eliminar usuario. Listar usuarios. Listar usuarios por tipo.
*
* @@author Nicolás Gajardo
* @author Jorge Lira
* @author Beatriz Maldonado
* @author Diego Rivera
*
* @version 1.0
*/
public class Contenedor {

    private List<Cliente> listaClientes;
    private List<Profesional> listaProfesionales;
    private List<Administrativo> listaAdministrativos;
    private List<Capacitacion> listaCapacitaciones;

    public Contenedor() {
        listaClientes = new ArrayList<>();
        listaProfesionales = new ArrayList<>();
        listaAdministrativos = new ArrayList<>();
        listaCapacitaciones = new ArrayList<>();
    }

    public void almacenarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) {
        listaProfesionales.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo) {
        listaAdministrativos.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        listaCapacitaciones.add(capacitacion);
    }

    public void listarUsuarios() {
        System.out.println("Clientes:");
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
        System.out.println("Profesionales:");
        for (Profesional profesional : listaProfesionales) {
            System.out.println(profesional);
        }
        System.out.println("Administrativos:");
        for (Administrativo administrativo : listaAdministrativos) {
            System.out.println(administrativo);
        }
    }

    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : listaCapacitaciones) {
            System.out.println(capacitacion);
        }
    }

    public void eliminarUsuario(String rut) {
        listaClientes.removeIf(cliente -> cliente.getRut().equals(rut));
        listaProfesionales.removeIf(profesional -> profesional.getRun().equals(rut));
        listaAdministrativos.removeIf(administrativo -> administrativo.getRun().equals(rut));
    }
}