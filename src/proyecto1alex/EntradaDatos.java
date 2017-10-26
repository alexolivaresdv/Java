/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1alex;

import java.util.Scanner;//Paso 1 - Esta libreria toma los datos que digita el usuario por consola 

/**
 *
 * @author LAB17
 */
public class EntradaDatos {
    
    public static void main(String[]args)
    {
        //Paso 2 - Aqui estamos creando el objeto escaner, este objeto solo se crea una vez 
        Scanner sc = new Scanner(System.in);//Se crea el lector 
        
        //Paso 3 - Pedimos los datos al usuario
        System.out.println("por favor ingrese su nombre");
        
        //Paso 4 - Se lee el nombre y se almacena 
        String nombre = sc.nextLine();
        
        //Paso 5 - procesamos los datos del usuario, en este caso, lo imprimimos 
        System.out.println("Bienvenido "+nombre+" Por favor digite la edad ");
        
        int edad = sc.nextInt();
        
        System.out.println("Usted tiene "+edad+ " años");
        
    }
    
}
