/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jcarrero
 */
public class Interfaz {
    public int menu(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("1. leer\n"+ "2. Guardar\n"+ "3. Cargar\n"+ "4. Listar\n"+ "5. Modificar");  // \ alt 92 para la barra invertida
        int opcion = teclado.nextInt();
        return opcion;
    }
    
    public void listar(ArrayList<Integer> data){
        System.out.println("------");
        for(Integer value : data){
            System.out.println(value);
        }
    }
}
