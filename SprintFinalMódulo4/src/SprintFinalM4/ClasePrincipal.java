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
                   while (true) {
                       try {
                           System.out.print("Ingrese el RUT del cliente: ");
                           String rut = scanner.nextLine();
                           cliente.setRut(rut);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer los nombres
                   while (true) {
                       try {
                           System.out.print("Ingrese los nombres del cliente: ");
                           String nombres = scanner.nextLine();
                           cliente.setNombres(nombres);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer los apellidos
                   while (true) {
                       try {
                           System.out.print("Ingrese los apellidos del cliente: ");
                           String apellidos = scanner.nextLine();
                           cliente.setApellidos(apellidos);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer el teléfono
                   while (true) {
                       try {
                           System.out.print("Ingrese el teléfono del cliente: ");
                           String telefono = scanner.nextLine();
                           cliente.setTelefono(telefono);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer la AFP
                   while (true) {
                       try {
                           System.out.print("Ingrese la AFP del cliente: ");
                           String afp = scanner.nextLine();
                           cliente.setAfp(afp);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer el sistema de salud
                   while (true) {
                       try {
                           System.out.print("Ingrese el sistema de salud del cliente (1: FONASA, 2: ISAPRE): ");
                           int sistemaSalud = scanner.nextInt();
                           cliente.setSistemaSalud(sistemaSalud);
                           scanner.nextLine(); // Consumir la nueva línea
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer la dirección
                   while (true) {
                       try {
                           System.out.print("Ingrese la dirección del cliente: ");
                           String direccion = scanner.nextLine();
                           cliente.setDireccion(direccion);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer la comuna
                   while (true) {
                       try {
                           System.out.print("Ingrese la comuna del cliente: ");
                           String comuna = scanner.nextLine();
                           cliente.setComuna(comuna);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer la edad
                   while (true) {
                       try {
                           System.out.print("Ingrese la edad del cliente: ");
                           int edad = scanner.nextInt();
                           cliente.setEdad(edad);
                           scanner.nextLine(); // Consumir la nueva línea
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                // Almacenar el cliente
                   contenedor.almacenarCliente(cliente);
                   break;
               
                // Opción 2: Almacenar Profesional
               case 2:
                   Profesional profesional = new Profesional();
                // Solicitar y establecer los datos del profesional
                   while (true) {
                       try {
                           System.out.print("Ingrese el RUT del profesional: ");
                           String rut = scanner.nextLine();
                           profesional.setRun(rut);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("RUT inválido. Inténtelo nuevamente.");
                       }
                   }
                   while (true) {
                       try {
                           System.out.print("Ingrese el nombre del profesional: ");
                           String nombre = scanner.nextLine();
                           profesional.setNombre(nombre);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Nombre inválido. Inténtelo nuevamente.");
                       }
                   }
                   while (true) {
                       try {
                           System.out.print("Ingrese el título del profesional (10-50 carácteres): ");
                           String titulo = scanner.nextLine();
                           profesional.setTitulo(titulo);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println(e.getMessage() + " Ocurrió un error. Intente nuevamente.");
                       }
                   }
                   while (true) {
                       try {
                           System.out.print("Ingrese la fecha de ingreso (DD/MM/YYYY): ");
                           String fechaIngreso = scanner.nextLine();
                           profesional.setFechaIngreso(fechaIngreso);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println(e.getMessage() + " Ocurrió un error. Intente nuevamente.");
                       }
                   }
                   System.out.print("Ingrese Fecha de Nacimiento (DD/MM/YYYY): ");
                   profesional.setFechaNacimiento(scanner.nextLine());
                   contenedor.almacenarProfesional(profesional);
                   break;
               
               case 3:
            	    Administrativo administrativo = new Administrativo();

            	    // Validar y establecer el nombre
            	    while (true) {
                        try {
                            System.out.print("Ingrese el RUT del administrativo: ");
                            String rut = scanner.nextLine();
                            administrativo.setRun(rut);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("RUT inválido. Inténtelo nuevamente.");
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Ingrese el nombre del administrativo: ");
                            String nombre = scanner.nextLine();
                            administrativo.setNombre(nombre);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Nombre inválido. Inténtelo nuevamente.");
                        }
                    }
            	    // Validar y establecer el area del administrativo
            	    while (true) {
            	        try {
            	            System.out.print("Ingrese el area del administrativo: ");
            	            String area = scanner.nextLine();
            	            administrativo.setArea(area);
            	            break;
            	        } catch (IllegalArgumentException e) {
            	            System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
            	        }
            	    }

            	    // Validar y establecer la experiencia previa del administrativo
            	    while (true) {
            	        try {
            	            System.out.print("Ingrese la experiencia previa del administrativo: ");
            	            String experienciaPrevia = scanner.nextLine();
            	            administrativo.setExperienciaPrevia(experienciaPrevia);
            	            break;
            	        } catch (IllegalArgumentException e) {
            	            System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
            	        }
            	    }

            	    // Almacenar el administrativo
            	    contenedor.almacenarAdministrativo(administrativo);
            	    break;
                   
            	 // Opción 4: Almacenar Capacitación
               case 4:
                   Capacitacion capacitacion = new Capacitacion();

                   // Validar y establecer el identificador de la capacitación
                   while (true) {
                       try {
                           System.out.print("Ingrese el identificador de la capacitación: ");
                           int identificador = scanner.nextInt();
                           capacitacion.setIdentificador(identificador);
                           scanner.nextLine(); // Consumir la nueva línea
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer el RUT del cliente asociado
                   while (true) {
                       try {
                           System.out.print("Ingrese el RUT del cliente asociado: ");
                           String rutCliente = scanner.nextLine();
                           capacitacion.setRutCliente(rutCliente);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer el día de la capacitación
                   while (true) {
                       try {
                           System.out.print("Ingrese el día de la capacitación: ");
                           String dia = scanner.nextLine();
                           capacitacion.setDia(dia);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer la hora de la capacitación
                   while (true) {
                       try {
                           System.out.print("Ingrese la hora de la capacitación (HH:MM): ");
                           String hora = scanner.nextLine();
                           capacitacion.setHora(hora);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer el lugar de la capacitación
                   while (true) {
                       try {
                           System.out.print("Ingrese el lugar de la capacitación: ");
                           String lugar = scanner.nextLine();
                           capacitacion.setLugar(lugar);
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer la duración de la capacitación
                   while (true) {
                       try {
                           System.out.print("Ingrese la duración de la capacitación (en horas): ");
                           String duracion = scanner.nextLine();
                           capacitacion.setDuracion(duracion);
                           //scanner.nextLine(); // Consumir la nueva línea
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Validar y establecer la cantidad de asistentes
                   while (true) {
                       try {
                           System.out.print("Ingrese la cantidad de asistentes a la capacitación: ");
                           int cantidadAsistentes = scanner.nextInt();
                           capacitacion.setCantidadAsistentes(cantidadAsistentes);
                           scanner.nextLine(); // Consumir la nueva línea
                           break;
                       } catch (IllegalArgumentException e) {
                           System.out.println("Error: " + e.getMessage() + " Inténtelo nuevamente.");
                       }
                   }

                   // Almacenar la capacitación
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
       } while (opcion != 0);
       scanner.close();
   }
}


