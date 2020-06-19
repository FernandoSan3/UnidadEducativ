/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.unidadeducativa;

import ec.edu.com.ModeloGrupo.Controlador.ControladorMension;
import java.sql.SQLException;
import ec.edu.com.ModeloGrupo.Modelo.Mension;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author fernandosanchez
 */
public class Prueba_Mension {

    /**
     * @param args the command line arguments
     */
    private ControladorMension controlMensio = new ControladorMension();

    public Prueba_Mension(ControladorMension controlMension) {

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
    

    public static void main(String[] args) throws SQLException, ParseException {
        // TODO code application logic here

        Mension mension = new Mension();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean salir1 = false;
        boolean salir2 = false;
        int opcion, opcions, opcions1 = 0;
        String fecha;

        while (!salir) {

            System.out.println(" *-*-*-* Menu Mension *-*-*-*");
            System.out.println("1. Crear Mension");
            System.out.println("2. Modificar Mension");
            System.out.println("3. Buscar Mension");
            System.out.println("4. Eliminar Mension");

            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("Ingrese la Abrebiatura");
                        mension.setAbrebiatura(sn.next());
                        System.out.println("Ingrese la Mension");
                        mension.setMension(sn.next());
                        System.out.println("Ingrese la Horas Totales");                       
                        mension.setHorasTotales(comvertirFecha(sn.next()));
                        ControladorMension.crearMension(mension);
                        break;

                    case 2:
                        System.out.println("Ingrese la mension que desea buscar para modificar");
                        ControladorMension.buscarMension(sn.next(), mension);
                        System.out.println("Selecciones lo que sea cambiar");

                        while (!salir1) {

                            System.out.println("1. Abrebiatura : " + mension.getAbrebiatura());
                            System.out.println("2. Mension : " + mension.getMension());
                            System.out.println("3. Horas Totales : " + mension.getHorasTotales());
                            System.out.println("4. Finalizar Cambios");

                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions = sn.nextInt();

                                switch (opcions) {
                                    case 1:
                                        System.out.println("Ingrese la nueva Abrebiatura:");
                                        mension.setAbrebiatura(sn.next());
                                        mension.setMension(mension.getMension());
                                        mension.setHorasTotales(mension.getHorasTotales());
                                        ControladorMension.modificarMension(mension);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese la nueva mension:");
                                        mension.setAbrebiatura(mension.getAbrebiatura());
                                        mension.setMension(sn.next());
                                        mension.setHorasTotales(mension.getHorasTotales());
                                        ControladorMension.modificarMension(mension);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese las nuevas Horas Totales:");
                                        mension.setAbrebiatura(mension.getAbrebiatura());
                                        mension.setMension(mension.getMension());
                                        mension.setHorasTotales(comvertirFecha(sn.next()));
                                        ControladorMension.modificarMension(mension);
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

                        System.out.println("Ingrese la mension que desea buscar ");
                        ControladorMension.buscarMension(sn.next(), mension);
                        System.out.println("Abrebiatura : " + mension.getAbrebiatura());
                        System.out.println("Mension : " + mension.getMension());
                        System.out.println("Horas Totales : " + mension.getHorasTotales());
                        break;
                    case 4:
                        System.out.println("Ingrese la mension que desea buscar para eliminar");
                        ControladorMension.buscarMension(sn.next(), mension);
                        System.out.println("Abrebiatura : " + mension.getAbrebiatura());
                        System.out.println("Mension : " + mension.getMension());
                        System.out.println("Horas Totales : " + mension.getHorasTotales());
                        System.out.println("Si desea eliminar precione 1 o 2 si no desea eliminar ");
                        while (!salir2) {
                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions1 = sn.nextInt();

                                switch (opcions1) {
                                    case 1:
                                        ControladorMension.eliminarMension(mension);
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
