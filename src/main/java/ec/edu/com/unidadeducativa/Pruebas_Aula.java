/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.unidadeducativa;

import ec.edu.com.ModeloGrupo.Controlador.ControladorAula;
import ec.edu.com.ModeloGrupo.Modelo.Aula;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fernandosanchez
 */
public class Pruebas_Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        Aula aula = new Aula();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean salir1 = false;
        boolean salir2 = false;
        int opcion, opcions, opcions1 = 0;
        String fecha;

        while (!salir) {

            System.out.println(" *-*-*-* Menu Aula *-*-*-*");
            System.out.println("1. Crear Aula");
            System.out.println("2. Modificar Aula");
            System.out.println("3. Buscar Aula");
            System.out.println("4. Eliminar Aula");

            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("Ingrese la Aula");
                        aula.setAula(sn.next());
                        System.out.println("Ingrese el Piso");
                        aula.setPiso(sn.nextInt());
                        System.out.println("Ingrese el Número de Aula");
                        aula.setNumeroAula(sn.nextInt());
                        System.out.println("Ingrese el Edificio");
                        aula.setEdificio(sn.next());
                        System.out.println("Ingrese el Tipo");
                        aula.setTipo(sn.next());                       
                        ControladorAula.crearAula(aula);
                        break;
                    case 2:
                        System.out.println("Ingrese la aula para buscar lo que desea modificar");
                        ControladorAula.buscarAula(sn.next(), aula);
                        System.out.println("Selecciones lo que sea cambiar");

                        while (!salir1) {

                            System.out.println("1. Aula : " + aula.getAula());
                            System.out.println("2. Piso : " + aula.getPiso());
                            System.out.println("3. Número de Aula : " + aula.getNumeroAula());
                            System.out.println("4. Edificio :"+aula.getEdificio());
                            System.out.println("5. Tipo :"+aula.getTipo());
                            System.out.println("6. Salir :");

                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions = sn.nextInt();

                                switch (opcions) {
                                    case 1:
                                        System.out.println("Ingrese la nueva Aula:");
                                        aula.setAula(sn.next());
                                        aula.setPiso(aula.getPiso());
                                        aula.setNumeroAula(aula.getNumeroAula());
                                        aula.setEdificio(aula.getEdificio());
                                        aula.setTipo(aula.getTipo());
                                        ControladorAula.modificarAula(aula);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo Piso:");
                                        aula.setAula(aula.getAula());
                                        aula.setPiso(sn.nextInt());
                                        aula.setNumeroAula(aula.getNumeroAula());
                                        aula.setEdificio(aula.getEdificio());
                                        aula.setTipo(aula.getTipo());
                                        ControladorAula.modificarAula(aula);                                       
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el nuevo Número de Aula:");
                                        aula.setAula(aula.getAula());
                                        aula.setPiso(aula.getPiso());
                                        aula.setNumeroAula(sn.nextInt());
                                        aula.setEdificio(aula.getEdificio());
                                        aula.setTipo(aula.getTipo());
                                        ControladorAula.modificarAula(aula); 
                                        break;
                                    case 4:
                                        System.out.println("Ingrese el nuevo Edificio:");
                                        aula.setAula(aula.getAula());
                                        aula.setPiso(aula.getPiso());
                                        aula.setNumeroAula(aula.getNumeroAula());                                        
                                        aula.setEdificio(sn.next());
                                        aula.setTipo(aula.getTipo());
                                        ControladorAula.modificarAula(aula); 
                                        break;
                                    case 5:
                                        System.out.println("Ingrese el nuevo Tipo:");
                                        aula.setAula(aula.getAula());
                                        aula.setPiso(aula.getPiso());
                                        aula.setNumeroAula(aula.getNumeroAula());                                        
                                        aula.setEdificio(aula.getEdificio());
                                        aula.setTipo(sn.next());
                                        ControladorAula.modificarAula(aula); 
                                        break;
                                    case 6:
                                        salir1 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 6");
                                }
                            } catch (InputMismatchException s) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }

                        break;
                    case 3:

                        System.out.println("Ingrese la nombre de la aula para buscar");
                        ControladorAula.buscarAula(sn.next(), aula);
                        System.out.println("Aula : " + aula.getAula());
                        System.out.println("Piso : " + aula.getPiso());
                        System.out.println("Número de Aula : " + aula.getNumeroAula());
                        System.out.println("Edificio : " + aula.getEdificio());
                        System.out.println("Tipo : " + aula.getTipo());
                        
                        break;
                    case 4:
                        System.out.println("Ingrese la nombre de la aula para eliminar");
                        ControladorAula.buscarAula(sn.next(), aula);
                        System.out.println("Aula : " + aula.getAula());
                        System.out.println("Piso : " + aula.getPiso());
                        System.out.println("Número de Aula : " + aula.getNumeroAula());
                        System.out.println("Edificio : " + aula.getEdificio());
                        System.out.println("Tipo : " + aula.getTipo());
                        System.out.println("Si desea eliminar precione 1 o 2 si no desea eliminar ");
                        while (!salir2) {
                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions1 = sn.nextInt();

                                switch (opcions1) {
                                    case 1:
                                        ControladorAula.eliminarAula(aula);
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
