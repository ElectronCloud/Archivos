/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jcarrero
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Gestion de Enteros");
        Interfaz interfaz = new Interfaz();
        Scanner lectura = new Scanner (System.in);
        int opcion=0;
        int valor = 0;
        DAO dao = new DAO();
        GestionArchivo archivos = new GestionArchivo("enteros.txt");
        while(true){
            opcion = interfaz.menu();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese dato");
                    valor = lectura.nextInt();
                    dao.AddBd(valor);
                    break;
                
                case 2:
                    System.out.println("Guardando...");
                    archivos.guardar(dao.getBd());
                    break;
                    
                case 3:
                    System.out.println("Cargando archivo");
                    archivos.cargar();
                    break;
                    
                case 4:
                    System.out.println("Lista");
                    interfaz.listar(dao.getBd());
                    break;
                    
                case 5:
                    System.out.println("Ingrese posicion");
                    int a = lectura.nextInt();
                    System.out.println("Ingrese numero");
                    int b = lectura.nextInt();
                    if(a>=0 && b<=dao.getBd().size()){
                    dao.modificar(b, a);
                    }
                    else System.out.println("Posicion invalida");
                    break;
                    
                    
                    
            }
        }
    }
}
