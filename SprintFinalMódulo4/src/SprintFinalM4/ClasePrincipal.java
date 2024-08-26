package SprintFinalM4;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Almacenar Cliente");
            System.out.println("2. Almacenar Profesional");
            System.out.println("3. Almacenar Administrativo");
            System.out.println("4. Almacenar Capacitación");
            System.out.println("5. Listar Usuarios");
            System.out.println("6. Listar Capacitaciones");
            System.out.println("7. Eliminar Usuario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    Cliente cliente = new Cliente();
                    // Solicitar y establecer los datos del cliente
                    System.out.print("Ingrese RUT: número menor a 99.999.999");
                    cliente.setRut(scanner.nextLine());
                    System.out.print("Ingrese Nombre:  mínimo 5 caracteres, máximo 30 ");
                    cliente.setNombre(scanner.nextLine());
                    // Completar con más atributos...
                    contenedor.almacenarCliente(cliente);
                    break;
                case 2:
                    Profesional profesional = new Profesional();
                    // Solicitar y establecer los datos del profesional
                    System.out.print("Ingrese RUT: ");
                    profesional.setRun(scanner.nextLine());
                    System.out.print("Ingrese Nombre: ");
                    profesional.setNombre(scanner.nextLine());
                    // Completar con más atributos...
                    contenedor.almacenarProfesional(profesional);
                    break;
                case 3:
                    Administrativo administrativo = new Administrativo();
                    // Solicitar y establecer los datos del administrativo
                    System.out.print("Ingrese RUT: ");
                    administrativo.setRun(scanner.nextLine());
                    System.out.print("Ingrese Nombre: ");
                    administrativo.setNombre(scanner.nextLine());
                    // Completar con más atributos...
                    contenedor.almacenarAdministrativo(administrativo);
                    break;
                case 4:
                    Capacitacion capacitacion = new Capacitacion();
                    // Solicitar y establecer los datos de la capacitación
                    System.out.print("Ingrese ID de la capacitación: ");
                    capacitacion.setIdentificador(scanner.nextInt());
                    scanner.nextLine(); // Consumir la nueva línea
                    // Completar con más atributos...
                    contenedor.almacenarCapacitacion(capacitacion);
                    break;
                case 5:
                    contenedor.listarUsuarios();
                    break;
                case 6:
                    contenedor.listarCapacitaciones();
                    break;
                case 7:
                    System.out.print("Ingrese el RUT del usuario a eliminar: ");
                    String rut = scanner.nextLine();
                    contenedor.eliminarUsuario(rut);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}

