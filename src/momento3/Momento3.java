/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package momento3;

import java.util.Scanner;
import momento3Jugadores.Jugadores;

/**
 *
 * @author ADMIN
 */


public class Momento3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
// TODO code application logic here
        Scanner entrada=new Scanner(System.in); 
        int opcion;
        int contador=0;
        int c;
   
        Objeto2 objeto2 = new Objeto2();
        Jugadores[] jugador=new Jugadores[15];
        do{
        System.out.println("Bienbenido");
        System.out.println("Digite 1 para agregar un Jugador");
        System.out.println("Digite 2 para Buscar un Jugador");
        System.out.println("Digite 3 para Mostrar informaion de un Jugador");
        System.out.println("Digite 4 para Mostrar Comvocatoria de jugadores");
        System.out.println("digite 5 para Salir");
        System.out.println("Digite una opcion");
        opcion=entrada.nextInt();
              
              switch(opcion){
                  case 1:                    
                      
                      System.out.println("Agregar un jugador : ");
                      System.out.println("");
                      jugador[contador]=new Jugadores();
                      jugador[contador].setId(contador) ;
                      
                      System.out.println("Digite Numero de cedula");                      
                      jugador[contador].setCedula(entrada.nextInt());
                     
                      System.out.println("Digite su nombre ");            
                      jugador[contador].setNombre(entrada.next());        
                      
                      System.out.println("Digite su apellido");
                      jugador[contador].setApellido(entrada.next());
                      
                       System.out.println("Digite su edad");
                      jugador[contador].setEdad(entrada.nextInt());      
                                                    
                      
                       System.out.println("Digite su numero de camiseta");
                      jugador[contador].setNumeroCamiseta(entrada.next());
                      
                       System.out.println("Digite su posicion");
                      jugador[contador].setPosicion(entrada.nextInt());
                      
                       System.out.println("Digite su equipo");
                      jugador[contador].setEquipo(entrada.next());                 
                    
                      
                      contador=contador+1;
                      
                      break;
                      
                  case 2:
                       System.out.println("Entre a la opcion 2");
                       System.out.println("Digite la cedula del jugador ");
                        Scanner cedula1=new Scanner(System.in); 
                       c=cedula1.nextInt();
                       
                       if(c == jugador[contador].getCedula()){
                           
                           System.out.println("cedula encontrada");
                       }           
                                        
                      break;    
                   
                  case 3:
                       
                        System.out.println("Base de datos empleado");
                        System.out.println("");
                        
                        for(int i=0; i<contador;i++){
                         System.out.println(jugador[i].getNombre());
                         System.out.println(jugador[i].getApellido());   
                         System.out.println("");                            
                        }               
                      
                        break; 
                   case 4:
                        System.out.println("Entre a la opcion 4");
                      break;   
                   case 5:
                       System.exit(0);
                      break;   
                      
                   default:   
              }
              
        }while(opcion!=5);
        }
    
    }