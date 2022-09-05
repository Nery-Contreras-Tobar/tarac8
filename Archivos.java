package com.progra2.p2bc7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Archivos {
    
 public static void main(String[]args){
     
     FileReader archivo;
     BufferedReader lector;
     
     try {
         archivo = new FileReader("C:\\Users\\TF039\\Desktop\\eje\\peliculas.txt");
       
         if(archivo.ready()){
             lector = new BufferedReader(archivo);
             String cadena;
             while((cadena=lector.readLine()) != null){
                 System.out.println(cadena);
             }
         }else{
             System.out.println("El archivo no esta listo");
         }
         lector = new BufferedReader(archivo);
     } catch (Exception e) {
         System.out.println("Error:" + e.getMessage());
     }
     
 }
}
