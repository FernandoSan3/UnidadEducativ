/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.unidadeducativa;

import ec.edu.com.ModeloGrupo.Controlador.ControladorCurso;
import ec.edu.com.ModeloGrupo.Modelo.Curso;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fernandosanchez
 */
public class Prueba_Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Curso curso = new Curso();
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

                        System.out.println("Ingrese la Abrebiatura");
                        curso.setAbrebiatura(sn.next());
                        System.out.println("Ingrese el Curso");
                        curso.setCurso(sn.next());                     
                        ControladorCurso.crearCurso(curso);
                        break;
                    case 2:
                        System.out.println("Ingrese el curso para buscar lo que desea modificar");
                        ControladorCurso.buscarCurso(sn.next(), curso);
                        System.out.println("Selecciones lo que sea cambiar");

                        while (!salir1) {

                            System.out.println("1. Abrebiatura : " + curso.getAbrebiatura());
                            System.out.println("2. Curso : " + curso.getCurso());
                            System.out.println("3. Salir :");

                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions = sn.nextInt();

                                switch (opcions) {
                                    case 1:
                                        System.out.println("Ingrese la nueva Abrebiatura:");
                                        curso.setAbrebiatura(sn.next());
                                        curso.setCurso(curso.getCurso());
                                        ControladorCurso.modificarCurso(curso);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo Curso:");
                                        curso.setAbrebiatura(curso.getAbrebiatura());
                                        curso.setCurso(sn.next());
                                        ControladorCurso.modificarCurso(curso);                                       
                                        break;
                                    case 3:   
                                        salir1 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 3");
                                }
                            } catch (InputMismatchException s) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }

                        break;
                    case 3:

                        System.out.println("Ingrese la nombre del curso para buscar");
                        ControladorCurso.buscarCurso(sn.next(), curso);
                        System.out.println("Abrebiatura : " + curso.getAbrebiatura());
                        System.out.println("Curso : " + curso.getCurso());
                        
                        break;
                    case 4:
                        System.out.println("Ingrese la nombre del curso para eliminar");
                        ControladorCurso.buscarCurso(sn.next(), curso);
                        System.out.println("Abrebiatura : " + curso.getAbrebiatura());
                        System.out.println("Curso : " + curso.getCurso());
                        System.out.println("Si desea eliminar precione 1 o 2 si no desea eliminar ");
                        while (!salir2) {
                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions1 = sn.nextInt();

                                switch (opcions1) {
                                    case 1:
                                        ControladorCurso.eliminarCurso(curso);
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
    

