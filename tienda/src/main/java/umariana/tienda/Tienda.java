/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umariana.tienda;

import java.util.ArrayList;
import java.util.Scanner;
import producto.Productos;

/**
 *
 * @author Anthony Viveros David Pasaje
 */
public class Tienda {

    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        ArrayList<Productos> misProductos = new ArrayList<>();
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
                   System.out.println("Agregue nombre de producto");
                  
                    sc.nextLine();
                    // Lee el nombre del producto
                    String nombre = sc.nextLine();

                    System.out.println("Añada precio al producto");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("¿Qué cantidad de producto?");
                    int cantidad = sc.nextInt();
                    
                    // Creacion del objeto
                    Productos nuevoProducto = new Productos (nombre,precio,cantidad);
                    
                    misProductos.add(nuevoProducto);
                    
                    
                    
                    
                    
                    break;
                    // ver inventario
                case 2:
                    
                    System.out.println("Productos de la tienda");
                    
                    for(Productos p :misProductos){
                        
                        System.out.println("Nombre: " + p.getNombre());
                        
                        System.out.println("Precio: " + p.getPrecio());
                        
                        System.out.println("cantida: " + p.getCantidad());
                    
                    }
                    
                    
                    break;
                // Organizar productos de manera ascendente 
               
                case 3:
                    for (int i = 0; i < misProductos.size() - 1; i++) {
                        for (int j = i + 1; j < misProductos.size(); j++) {
                            Productos producto1 = misProductos.get(i);
                            Productos producto2 = misProductos.get(j);

                            if (producto1.getCantidad() > producto2.getCantidad()) {
                                // Intercambio de elementos
                                misProductos.set(i, producto2);
                                misProductos.set(j, producto1);
                            }
                        }
                    }

                    // Mostrar inventario ordenado
                    System.out.println("ordenado ascendente por cantidad:");
                    for (Productos p : misProductos) {
                        System.out.println("Nombre: " + p.getNombre());
                        System.out.println("Precio: " + p.getPrecio());
                        System.out.println("Cantidad: " + p.getCantidad());
                    }
                    break;

                    //Elimirar productos
                case 4:
                    System.out.println("productos en el inventario:");
                    for (int i = 0; i < misProductos.size(); i++) {
                        Productos producto = misProductos.get(i);
                        System.out.println((i + 1) + " " + producto.getNombre());
                    }

                    System.out.println("ingrese el nombre del producto que vas a eliminar:");
                    sc.nextLine(); 
                    String productoE = sc.nextLine();

                    boolean buscarP = false;
                    for (int i = 0; i < misProductos.size(); i++) {
                        Productos producto = misProductos.get(i);
                        if (producto.getNombre().equals(productoE)) {
                            misProductos.remove(i);
                            System.out.println("el producto '" + productoE + " ha sido eliminado ");
                            buscarP = true;
                            break;
                        }
                    }
                    // Producto no encontrado 
                    if (!buscarP) {
                        System.out.println("el producto" + productoE + " no se encuentra");
                    }
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


        }