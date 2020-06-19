/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.unidadeducativa;


import ec.edu.com.ModeloPersona.Controlador.ControladorPersona;
import ec.edu.com.ModeloPersona.Modelo.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fernandosanchez
 */
public class UnidadEducativa {

    /**
     * @param args the command line arguments
     */
    private ControladorPersona cDP;

    public UnidadEducativa(ControladorPersona cDP) {
        this.cDP = cDP;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona() {
        };
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean salir1 = false;
        boolean salir2 = false;
        int opcion, opcions, opcions1 = 0;

        while (!salir) {

            System.out.println(" *-*-*-* Ingresar Persona *-*-*-*");
            System.out.println("1. Crear Persona");
            System.out.println("2. Modificar Persona");
            System.out.println("3. Buscar Persona");
            System.out.println("4. Eliminar Persona");

            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("Ingrese su Cédula");
                        persona.setCedula(sn.next());
                        System.out.println("Ingrese sus Nombres");
                        persona.setNombre(sn.next());
                        System.out.println("Ingrese us Apellidos");
                        persona.setApellido(sn.next());
                        System.out.println("Ingrese su Dirección");
                        persona.setDireccion(sn.next());
                        System.out.println("Ingrese su Teléfono");
                        persona.setTelefono(sn.next());
                        System.out.println("Ingrese su Correo");
                        persona.setCorreo(sn.next());
                        ControladorPersona.crearPersona(persona);
                        break;
                    case 2:
                        System.out.println("Ingrese la cedula para buscar a la persona que desea modificar");
                        ControladorPersona.buscarPersona(sn.next(), persona);
                        System.out.println("Selecciones lo que sea cambiar");

                        while (!salir1) {

                            System.out.println("1. Cedula : " +persona.getCedula());
                            System.out.println("2. Nombres : "+persona.getNombre());
                            System.out.println("3. Apellidos : "+persona.getApellido());
                            System.out.println("4. Dirección : "+persona.getDireccion());
                            System.out.println("5. Teléfono : "+persona.getTelefono());
                            System.out.println("6. Correo : "+persona.getCorreo());
                            System.out.println("7. Finalizar Cambios");

                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions = sn.nextInt();

                                switch (opcions) {
                                    case 1:
                                        System.out.println("Ingrese el nuevo número cédula");
                                        persona.setCedula(sn.next());
                                        persona.setNombre(persona.getNombre());
                                        persona.setApellido(persona.getApellido());
                                        persona.setDireccion(persona.getDireccion());
                                        persona.setTelefono(persona.getTelefono());
                                        persona.setCorreo(persona.getCorreo());
                                        ControladorPersona.modificarPersona(persona);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese sus nuevos nombres:");
                                        persona.setCedula(persona.getCedula());
                                        persona.setNombre(sn.next());
                                        persona.setApellido(persona.getApellido());
                                        persona.setDireccion(persona.getDireccion());
                                        persona.setTelefono(persona.getTelefono());
                                        persona.setCorreo(persona.getCorreo());
                                        ControladorPersona.modificarPersona(persona);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese sus nuevos apellidos:");
                                        persona.setCedula(persona.getCedula());
                                        persona.setNombre(persona.getNombre());
                                        persona.setApellido(sn.next());
                                        persona.setDireccion(persona.getDireccion());
                                        persona.setTelefono(persona.getTelefono());
                                        persona.setCorreo(persona.getCorreo());
                                        ControladorPersona.modificarPersona(persona);
                                        break;
                                    case 4:
                                        System.out.println("Ingrese la nueva dirección:");
                                        persona.setCedula(persona.getCedula());
                                        persona.setNombre(persona.getNombre());
                                        persona.setApellido(persona.getApellido());
                                        persona.setDireccion(sn.next());
                                        persona.setTelefono(persona.getTelefono());
                                        persona.setCorreo(persona.getCorreo());
                                        ControladorPersona.modificarPersona(persona);
                                        break;
                                    case 5:
                                        System.out.println("Ingrese el nuevo numeró de teléfono");
                                        persona.setCedula(persona.getCedula());
                                        persona.setNombre(persona.getNombre());
                                        persona.setApellido(persona.getApellido());
                                        persona.setDireccion(persona.getDireccion());
                                        persona.setTelefono(sn.next());
                                        persona.setCorreo(persona.getCorreo());
                                        ControladorPersona.modificarPersona(persona);
                                        break;
                                    case 6:
                                        System.out.println("Ingrese el nuevo correo");
                                        persona.setCedula(persona.getCedula());
                                        persona.setNombre(persona.getNombre());
                                        persona.setApellido(persona.getApellido());
                                        persona.setDireccion(persona.getDireccion());
                                        persona.setTelefono(persona.getTelefono());
                                        persona.setCorreo(sn.next());
                                        ControladorPersona.modificarPersona(persona);
                                        break;   
                                    case 7:
                                        salir1 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 7");
                                }
                            } catch (InputMismatchException s) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }

                        break;
                    case 3:

                        System.out.println("Ingrese la cedula para buscar a la persona");
                        ControladorPersona.buscarPersona(sn.next(), persona);
                        System.out.println("Cédula : " + persona.getCedula());
                        System.out.println("Nombres : " + persona.getNombre());
                        System.out.println("Apellidos : " + persona.getApellido());
                        System.out.println("Dirección : " + persona.getDireccion());
                        System.out.println("Teléfono : " + persona.getTelefono());
                        System.out.println("Correo : " + persona.getCorreo());
                        break;
                    case 4:
                        System.out.println("Ingrese la cedula para buscar a la persona que desea eliminar");
                        ControladorPersona.buscarPersona(sn.next(), persona);
                        System.out.println("Cédula : " + persona.getCedula());
                        System.out.println("Nombres : " + persona.getNombre());
                        System.out.println("Apellidos : " + persona.getApellido());
                        System.out.println("Dirección : " + persona.getDireccion());
                        System.out.println("Teléfono : " + persona.getTelefono());
                        System.out.println("Correo : " + persona.getCorreo());
                        System.out.println("Si desea eliminar precione 1 o 2 si no desea eliminar ");
                        while (!salir2) {
                        try {

                                System.out.println("Escribe una de las opciones");
                                opcions1 = sn.nextInt();
                                
                                switch (opcions1) {
                                    case 1:
                                        ControladorPersona.eliminarPersona(persona);
                                        salir2 = true;
                                        break;
                                    case 2:
                                        salir2 = true;
                                        break;                           
                                }
                        } catch (InputMismatchException w) {
                                System.out.println("Debes insertar un número");
                                sn.next();    
                        }
                        
                        }
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

}
