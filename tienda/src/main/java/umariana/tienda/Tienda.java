/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umariana.tienda;


import java.util.Scanner;
import producto.Productos;

/**
 *
 * @author Anthony Viveros David Pasaje
 */
public class Tienda {

    public static void main(String[] args) {
        Productos p = new Productos();
        Scanner sc= new Scanner(System.in);
       
        boolean activo = true;
        do{
            System.out.println("---Menu tienda---------   ");
            System.out.println("---Elgie una opcion---- ");
            System.out.println("---1:Agregrar producto----");
            System.out.println("---2:Ver inventario-------");
            System.out.println("---3:Organizar Productos--");
            System.out.println("---4:Eliminar Productos---");
            System.out.println("---5:Salir-----------------");
            System.out.println("---------------------------");
            
            int opcion =sc.nextInt();
            switch(opcion){
                //opcion numero 1 agregrar producto
                case 1: 
                    p.agregarProducto();

                    break;
                    // ver inventario
                case 2:
                    
                  p.verInventario();
                    
                    
                    break;
                // Organizar productos de manera ascendente 
               
                case 3:
                 p.organizar();
                    break;

                    //Elimirar productos
                case 4:
                  p.eliminar();
                 
                         break;

                    //salir
                case 5:
               activo = false; 
                    System.out.println("programa finalizado");
                    break;
                default:
                    System.out.println("opcion no valida");
                    
                    
            }
            
        }while(activo);
        

        }
        

    
