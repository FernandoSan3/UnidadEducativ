/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.unidadeducativa;


import ec.edu.com.ModeloPersona.Controlador.ControladorDocente;
import ec.edu.com.ModeloPersona.Controlador.ControladorPersona;
import ec.edu.com.ModeloPersona.Modelo.Docente;
import ec.edu.com.ModeloPersona.Modelo.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

/**
 *
 * @author fernandosanchez
 */
public class Pruebas_Docente {

    private ControladorPersona cDP;
    private ControladorDocente cDD;

    public Pruebas_Docente(ControladorPersona cDP, ControladorDocente cDD) {
        this.cDP = cDP;
        this.cDD = cDD;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        String titulo = null;
        ControladorPersona j = new ControladorDocente();

        Persona persona = new Persona() {
        };
        Docente docente = new Docente(); 
        boolean salir = false;
        boolean salir1 = false;
        boolean salir2 = false;
        int opcion, opcions, opcions1 = 0;

        while (!salir) {

            System.out.println(" *-*-*-* Menú Docente *-*-*-*");
            System.out.println("1. Crear Docente");
            System.out.println("2. Modificar Docente");
            System.out.println("3. Buscar Docente");
            System.out.println("4. Eliminar Docente");

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
                        Docente d = new Docente();
                        System.out.println("Ingrese su Titulo");
                        titulo = sn.next();
                        d.setTitulo(titulo);
                        d.setCodigo_persona(persona);
                        j.crearUsuario(persona, titulo);

                        break;
                    case 2:
                        System.out.println("Ingrese la cedula para buscar a la persona que desea modificar");
                        j.buscarUsuario(sn.next(), persona, docente);
                        System.out.println("Selecciones lo que sea cambiar");

                        while (!salir1) {                           
                        System.out.println("1.Cédula : " + docente.getCedula());
                        System.out.println("2.Nombres : " + docente.getNombre());
                        System.out.println("3.Apellidos : " + docente.getApellido());
                        System.out.println("4.Dirección : " + docente.getDireccion());
                        System.out.println("5.Teléfono : " + docente.getTelefono());
                        System.out.println("6.Correo : " + docente.getCorreo());
                        System.out.println("7.Titulo : " + docente.getTitulo());
                            
                            System.out.println("8. Finalizar Cambios");

                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions = sn.nextInt();

                                switch (opcions) {
                                    case 1:
                                        Persona p = new Persona() {
                                        };
                                        System.out.println("Ingrese el nuevo número cédula");
                                        p.setCedula(sn.next());
                                        p.setNombre(persona.getNombre());
                                        p.setApellido(persona.getApellido());
                                        p.setDireccion(persona.getDireccion());
                                        p.setTelefono(persona.getTelefono());
                                        p.setCorreo(persona.getCorreo());
                                        j.modificarUsuario(p, titulo, docente);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese sus nuevos nombres:");
                                        persona.setCedula(persona.getCedula());
                                        persona.setNombre(sn.next());
                                        persona.setApellido(persona.getApellido());
                                        persona.setDireccion(persona.getDireccion());
                                        persona.setTelefono(persona.getTelefono());
                                        persona.setCorreo(persona.getCorreo());
                                        docente.setTitulo(docente.getTitulo());
                                        j.modificarUsuario(persona, titulo,docente);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese sus nuevos apellidos:");
                                        persona.setCedula(persona.getCedula());
                                        persona.setNombre(persona.getNombre());
                                        persona.setApellido(sn.next());
                                        persona.setDireccion(persona.getDireccion());
                                        persona.setTelefono(persona.getTelefono());
                                        persona.setCorreo(persona.getCorreo());
                                        docente.setTitulo(docente.getTitulo());
                                        j.modificarUsuario(persona, titulo,docente);
                                        break;
                                    case 4:
                                        System.out.println("Ingrese la nueva dirección:");
                                        persona.setCedula(persona.getCedula());
                                        persona.setNombre(persona.getNombre());
                                        persona.setApellido(persona.getApellido());
                                        persona.setDireccion(sn.next());
                                        persona.setTelefono(persona.getTelefono());
                                        persona.setCorreo(persona.getCorreo());                                       
                                        docente.setTitulo(docente.getTitulo());
                                        j.modificarUsuario(persona, titulo,docente);
                                        break;
                                    case 5:
                                        System.out.println("Ingrese el nuevo numeró de teléfono");
                                        persona.setCedula(persona.getCedula());
                                        persona.setNombre(persona.getNombre());
                                        persona.setApellido(persona.getApellido());
                                        persona.setDireccion(persona.getDireccion());
                                        persona.setTelefono(sn.next());
                                        persona.setCorreo(persona.getCorreo());                                       
                                        docente.setTitulo(docente.getTitulo());
                                        j.modificarUsuario(persona, titulo,docente);
                                        break;
                                    case 6:
                                        System.out.println("Ingrese el nuevo correo");
                                        persona.setCedula(persona.getCedula());
                                        persona.setNombre(persona.getNombre());
                                        persona.setApellido(persona.getApellido());
                                        persona.setDireccion(persona.getDireccion());
                                        persona.setTelefono(persona.getTelefono());
                                        persona.setCorreo(sn.next());                                      
                                        docente.setTitulo(docente.getTitulo());
                                        j.modificarUsuario(persona, titulo,docente);
                                        break;
                                    case 7:
                                        System.out.println("Ingrese el nuevo titulo");
                                        persona.setCedula(persona.getCedula());
                                        persona.setNombre(persona.getNombre());
                                        persona.setApellido(persona.getApellido());
                                        persona.setDireccion(persona.getDireccion());
                                        persona.setTelefono(persona.getTelefono());
                                        persona.setCorreo(persona.getCorreo()); 
                                        docente.setTitulo(sn.next());     
                                        j.modificarUsuario(persona, titulo,docente);
                                        break;
                                    case 8:
                                        salir1 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 8");
                                }
                            } catch (InputMismatchException s) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }

                        break;
                    case 3:

                        System.out.println("Ingrese la cedula para buscar a la persona");
                        j.buscarUsuario(sn.next(), persona, docente);
                        System.out.println("Cédula : " + docente.getCedula());
                        System.out.println("Nombres : " + docente.getNombre());
                        System.out.println("Apellidos : " + docente.getApellido());
                        System.out.println("Dirección : " + docente.getDireccion());
                        System.out.println("Teléfono : " + docente.getTelefono());
                        System.out.println("Correo : " + docente.getCorreo());
                        System.out.println("Titulo : " + docente.getTitulo());
                        break;
                    case 4:
                        System.out.println("Ingrese la cedula para buscar a la persona que desea eliminar");
                        j.buscarUsuario(sn.next(), persona, docente);
                        System.out.println("Cédula : " + docente.getCedula());
                        System.out.println("Nombres : " + docente.getNombre());
                        System.out.println("Apellidos : " + docente.getApellido());
                        System.out.println("Dirección : " + docente.getDireccion());
                        System.out.println("Teléfono : " + docente.getTelefono());
                        System.out.println("Correo : " + docente.getCorreo());
                        System.out.println("Titulo : " + docente.getTitulo());
                        System.out.println("Si desea eliminar precione 1 o 2 si no desea eliminar ");
                        while (!salir2) {
                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions1 = sn.nextInt();

                                switch (opcions1) {
                                    case 1:
                                        j.eliminarUsuario(docente);
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
