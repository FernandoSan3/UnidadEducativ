/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.unidadeducativa;

import ec.edu.com.ModeloGrupo.Controlador.ControladorAnioLectivo;
import ec.edu.com.ModeloGrupo.Controlador.ControladorMension;
import ec.edu.com.ModeloGrupo.Modelo.AnioLectivo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fernandosanchez
 */
public class Prueba_Anio_Lectivo {

    /**
     * @param args the command line arguments
     */

    public Prueba_Anio_Lectivo() {
    }
    
    
    
    public static Date comvertirFecha(String texto) {
        try {
            Date fechaDate =  new SimpleDateFormat("yyyy/MM/dd").parse(texto);
            return fechaDate;
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        AnioLectivo anioLectivo = new AnioLectivo();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean salir1 = false;
        boolean salir2 = false;
        int opcion, opcions, opcions1 = 0;
        String fecha;

        while (!salir) {

            System.out.println(" *-*-*-* Menu Año Lectivo *-*-*-*");
            System.out.println("1. Crear Año Lectivo ");
            System.out.println("2. Modificar Año Lectivo ");
            System.out.println("3. Buscar Año Lectivo ");
            System.out.println("4. Eliminar Año Lectivo ");

            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("Ingrese el Año Lectivo");
                        anioLectivo.setAnioLectivo(sn.next());
                        System.out.println("Ingrese la Fecha Inicio");
                        anioLectivo.setFechaInicio(comvertirFecha(sn.next()));
                        System.out.println("Ingrese la Fecha Final"); 
                        anioLectivo.setFechaFinal(comvertirFecha(sn.next()));
                        ControladorAnioLectivo.crearAnioLectivo(anioLectivo);
                        break;

                    case 2:
                        System.out.println("Ingrese el Año Lectivo que desea buscar para modificar");
                        ControladorAnioLectivo.buscarAnioLectivo(sn.next(), anioLectivo);
                        System.out.println("Selecciones lo que sea cambiar");

                        while (!salir1) {

                            System.out.println("1. Año Lectivo : " + anioLectivo.getAnioLectivo());
                            System.out.println("2. Fecha Inicio : " + anioLectivo.getFechaInicio());
                            System.out.println("3. Fecha Final : " + anioLectivo.getFechaFinal());
                            System.out.println("4. Finalizar Cambios");

                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions = sn.nextInt();

                                switch (opcions) {
                                    case 1:
                                        System.out.println("Ingrese el nuevo Año Lectivo:");
                                        anioLectivo.setAnioLectivo(sn.next());
                                        anioLectivo.setFechaInicio(anioLectivo.getFechaInicio());
                                        anioLectivo.setFechaFinal(anioLectivo.getFechaFinal());
                                        ControladorAnioLectivo.modificarAnioLectivo(anioLectivo);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese la nueva Fecha Inicio:");
                                        anioLectivo.setAnioLectivo(anioLectivo.getAnioLectivo());
                                        anioLectivo.setFechaInicio(comvertirFecha(sn.next()));
                                        anioLectivo.setFechaFinal(anioLectivo.getFechaFinal());
                                        ControladorAnioLectivo.modificarAnioLectivo(anioLectivo);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese la nuevas Fecha Final:");
                                        anioLectivo.setAnioLectivo(anioLectivo.getAnioLectivo());
                                        anioLectivo.setFechaInicio(anioLectivo.getFechaInicio());
                                        anioLectivo.setFechaFinal(comvertirFecha(sn.next()));
                                        ControladorAnioLectivo.modificarAnioLectivo(anioLectivo);
                                        break;
                                    case 4:
                                        salir1 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 4");
                                }
                            } catch (InputMismatchException s) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }

                        break;
                    case 3:

                        System.out.println("Ingrese el Año Lectivo que desea buscar ");
                        ControladorAnioLectivo.buscarAnioLectivo(sn.next(), anioLectivo);
                        System.out.println("Año Lectivo : " + anioLectivo.getAnioLectivo());
                        System.out.println("Fecha Inicio : " + anioLectivo.getFechaInicio());
                        System.out.println("Fecha Final : " + anioLectivo.getFechaFinal());
                        break;
                    case 4:
                        System.out.println("Ingrese el Año Lectivo que desea buscar para eliminar");
                        ControladorAnioLectivo.buscarAnioLectivo(sn.next(), anioLectivo);
                        System.out.println("Año Lectivo : " + anioLectivo.getAnioLectivo());
                        System.out.println("Fecha Inicio : " + anioLectivo.getFechaInicio());
                        System.out.println("Fecha Final : " + anioLectivo.getFechaFinal());
                        System.out.println("Si desea eliminar precione 1 o 2 si no desea eliminar ");
                        while (!salir2) {
                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions1 = sn.nextInt();

                                switch (opcions1) {
                                    case 1:
                                        ControladorAnioLectivo.eliminarAnioLectivo(anioLectivo);
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
