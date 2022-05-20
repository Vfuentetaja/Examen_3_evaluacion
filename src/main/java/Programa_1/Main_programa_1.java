/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Main_programa_1 {

    /**
     * @param args the command line arguments
     */
    public static void MuestraInfoRuta(File ruta) throws FileNotFoundException, IOException {
        //si la ruta no existe, saltaria la excepcion FileNotFoundException
        if (!ruta.exists()) {
            throw new FileNotFoundException();
        }
        //si la ruta fuera un archivo, imprimiria su nombre
        if (ruta.isFile()) {
            BufferedReader obj = new BufferedReader(new FileReader(ruta));
            String lineas;
            while ((lineas = obj.readLine()) != null) {
                System.out.println(lineas);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner Entrada = new Scanner(System.in);
        try {
            System.out.println("Introduce la ruta la que quieras ");
            String path = "C:\\Users\\DAW\\Documents\\NetBeansProjects\\EXAMEN_3_EVALUACION\\src\\main\\java\\Programa_1\\tenerife\\"+Entrada.next(); //el usuario escribe por teclado / igualamos la ruta al scanner.
            File ruta = new File(path);//creamos el fichero "ruta" e igualamos el fichero "path" a la ruta       
            MuestraInfoRuta(ruta);
        } catch (FileNotFoundException e) {
            System.out.println("yo bro, are u ok, ma homie, this is ma barrio men?" + e);
        }

    }
}
