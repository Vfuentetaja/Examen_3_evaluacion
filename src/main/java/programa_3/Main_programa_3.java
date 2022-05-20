/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Main_programa_3 {

    /**
     * @param args the command line arguments
     */
    static Scanner Entrada = new Scanner(System.in);

    public static void MuestraInfoRuta(File ruta) throws FileNotFoundException, IOException {
        //si la ruta no existe, saltaria la excepcion FileNotFoundException
        String lineas;

        if (!ruta.exists()) {
            throw new FileNotFoundException();
        }
        //si la ruta fuera un archivo, imprimiria su nombre
        if (ruta.isFile()) {
            BufferedReader bf = new BufferedReader(new FileReader(ruta));
            //mientra que las lineas no sean null
            while ((lineas = bf.readLine()) != null) {
                //System.out.println(lineas);
            }
            try {
                //creo un hashMap para almacenar tanto los nombre de los alumnos como de el numero maximo de bombones posibles para dar
                HashMap<String, Integer> lista_alumnos_bombones = new HashMap<String, Integer>();
                //introduczo a los alumnos y el num max de bombones posibles
                lista_alumnos_bombones.put(lineas, m);
                do {
                    System.out.println("dime el nombre del alumno/a a la que quieres ver cuantos bombones le tocan: ");
                    String nombre = Entrada.next();
                    //creo un numero random de bombones como maximo el numero de bombones maximo introducido anteriormente
                    int numero_bom = (int) (Math.random() * m);
                    if (!nombre.isEmpty() || lista_alumnos_bombones.containsValue(nombre)) {
                        System.out.println("el nombre es: " + nombre + " y el numero de bombones que le toca es: " + numero_bom);
                    }
                } while (!lista_alumnos_bombones.isEmpty());
                {
                }
            } catch (AbstractMethodError e) {
                System.out.println("No Hay Bombones Para Ti");
            }

        }
    }
    static int n = Entrada.nextInt();
    static int m = Entrada.nextInt();

    public static void main(String[] args) throws IOException {
        try {
            System.out.println("cuantos alumnos juegan en la rifa?");
            System.out.println(n);
            System.out.println("cuantos bombones se van a repartir?");
            System.out.println(m);
            String path = "C:\\Users\\DAW\\Documents\\NetBeansProjects\\EXAMEN_3_EVALUACION\\src\\main\\java\\Programa_1\\participants.csv"; //el usuario escribe por teclado / igualamos la ruta al scanner.
            File ruta = new File(path);//creamos el fichero "ruta" e igualamos el fichero "path" a la ruta       
            MuestraInfoRuta(ruta);
        } catch (FileNotFoundException e) {
            System.out.println("no existe la ruta que acabas de poner" + e);
        }
    }
}
