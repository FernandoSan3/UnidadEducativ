/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.unidadeducativa;

import ec.edu.com.ModeloGrupo.Controlador.ControladorMateria;
import ec.edu.com.ModeloGrupo.Modelo.Materia;
import static ec.edu.com.unidadeducativa.Prueba_Anio_Lectivo.comvertirFecha;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author fernandosanchez
 */
public class Prueba_Materia {

    public Prueba_Materia() {
    }
    
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Materia materia = new Materia();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean salir1 = false;
        boolean salir2 = false;
        int opcion, opcions, opcions1 = 0;
        String fecha;

        while (!salir) {

            System.out.println(" *-*-*-* Menu Materia *-*-*-*");
            System.out.println("1. Crear Materia ");
            System.out.println("2. Modificar Materia ");
            System.out.println("3. Buscar Materia ");
            System.out.println("4. Eliminar Materia ");

            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("Ingrese la Materia");
                        materia.setMateria(sn.next());
                        System.out.println("Ingrese la Abrebiatura");
                        materia.setAbrebiatura(sn.next());
                        System.out.println("Ingrese la Hora"); 
                        materia.setHoras(sn.next());
                        System.out.println("Ingrese el Costo");
                        materia.setCosto(sn.nextDouble());
                        ControladorMateria.crearMateria(materia);
                        break;

                    case 2:
                        System.out.println("Ingrese la Materia que desea buscar para modificar");
                        ControladorMateria.buscarMateria(sn.next(), materia);
                        System.out.println("Selecciones lo que sea cambiar");

                        while (!salir1) {

                            System.out.println("1. Materia : " + materia.getMateria());
                            System.out.println("2. Abrebiatura : " + materia.getAbrebiatura());
                            System.out.println("3. Hora : " + materia.getHoras());
                            System.out.println("4. Costo : " + materia.getCosto());
                            System.out.println("5. Finalizar Cambios");

                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions = sn.nextInt();

                                switch (opcions) {
                                    case 1:
                                        System.out.println("Ingrese la nueva Materia:");
                                        materia.setMateria(sn.next());
                                        materia.setAbrebiatura(materia.getAbrebiatura());
                                        materia.setHoras(materia.getHoras());
                                        materia.setCosto(materia.getCosto());
                                        ControladorMateria.modificarMateria(materia);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese la nueva Abrebiatura:");
                                        materia.setMateria(materia.getMateria());
                                        materia.setAbrebiatura(sn.next());
                                        materia.setHoras(materia.getHoras());
                                        materia.setCosto(materia.getCosto());
                                        ControladorMateria.modificarMateria(materia);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese la nueva Hora:");
                                        materia.setMateria(materia.getMateria());
                                        materia.setAbrebiatura(materia.getAbrebiatura());
                                        materia.setHoras(sn.next());
                                        materia.setCosto(materia.getCosto());
                                        ControladorMateria.modificarMateria(materia);
                                        break;
                                    case 4:
                                        System.out.println("Ingrese el nuevo Costo:");
                                        materia.setMateria(materia.getMateria());
                                        materia.setAbrebiatura(materia.getAbrebiatura());
                                        materia.setHoras(materia.getHoras());
                                        materia.setCosto(sn.nextDouble());
                                        ControladorMateria.modificarMateria(materia);
                                        break;
                                    case 5:
                                        salir1 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 5");
                                }
                            } catch (InputMismatchException s) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }

                        break;
                    case 3:

                        System.out.println("Ingrese el Materia que desea buscar ");
                        ControladorMateria.buscarMateria(sn.next(), materia);                       
                        System.out.println("Materia : " + materia.getMateria());
                        System.out.println("Abrebiatura : " + materia.getAbrebiatura());
                        System.out.println("Hora : " + materia.getHoras());
                        System.out.println("Costo : " + materia.getCosto());
                        
                        break;
                    case 4:
                        System.out.println("Ingrese el Materia que desea buscar para eliminar");
                        ControladorMateria.buscarMateria(sn.next(), materia);                       
                        System.out.println("Materia : " + materia.getMateria());
                        System.out.println("Abrebiatura : " + materia.getAbrebiatura());
                        System.out.println("Hora : " + materia.getHoras());
                        System.out.println("Costo : " + materia.getCosto());
                        System.out.println("Si desea eliminar precione 1 o 2 si no desea eliminar ");
                        while (!salir2) {
                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions1 = sn.nextInt();

                                switch (opcions1) {
                                    case 1:
                                        ControladorMateria.eliminarMateria(materia);
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
