/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.practica1_201700880;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rudy Javier Orellana
 */
public class IPC1Practica1_201700880 {
    public static  int opcion1, fin, dificultad, nonjugadores, subidas,bajadas,finsubmenu;
    
    public static  String nombre[] = new String [3];
    public static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        fin=0;
        try{
while (fin<1) {
    
  
System.out.println("Bienvenido al juego");
System.out.println("***SUBIDAS Y BAJONES***");
System.out.println("INGRESE EL NO. CORRESPONDIENTE A LA OPCIÓN DESEADA");
System.out.println("1. Dificultad del Juego");
System.out.println("2. Parámetros iniciales");
System.out.println("3. Iniciar Juego ");
System.out.println("4. Salir");

opcion1=entrada.nextInt();
menuprincipal();
}  
        }
catch(NumberFormatException | InputMismatchException e) 
                {
            
            System.out.println("Usted ha ingresado un caracter no valido");
            System.out.println("INGRESE SOLO NÚMEROS");
            System.out.println("Proceda a ejecutar de nuevo el programa");
}

    }

    public static void menuprincipal() { 
         finsubmenu=0;
switch (opcion1) {
    case 1:
       
        while(finsubmenu<1){
    porgusto();  
    menudifi();
        }
     break;
     
    case 2:
        while(finsubmenu<1){
    porgusto();  
    parametros();
        }
        break;
        
    case 3: 
        break;
     
    case 4:
        porgusto();
            System.out.println(" ");
            System.out.println("********GRACIAS POR UTILIZAR MI PROGRAMA*********");
            System.out.println("LOS MEJORES PROGRAMAS BY RUDY ORELLANA 201700880");
            System.out.println("**********CONTACTO PERSONAL: 55650813 :3**********");
            System.out.println("*************¨¨****QUE VIVA GUATE*****************");
        fin=1;
        break;
     
     
    }
   
    
}
    public static void menudifi() {
    System.out.println("BIENVENIDO A DIFICULTAD DEL JUEGO");
    System.out.println("Ingrese la dificultad en la que desea jugar");
    System.out.println("1. Fácil");
    System.out.println("2. Dificil");
    System.out.println("3. Regresar");
    int opcion11 = entrada.nextInt();
    switch (opcion11) {
        case 1:
            dificultad=1;
            break;
        case 2:
            dificultad=2;
            break;
        case 3:
            finsubmenu=1;
            break;     
        
    }
    }
    public static void parametros() {
    System.out.println("BIENVENIDO A PARAMETROS INICIALES");
    System.out.println("Ingrese el no. de la opción que desea");
    System.out.println("1. Jugadores");
    System.out.println("2.Subidas y Bajones");
    System.out.println("3. Regresar");
    int opcion12 = entrada.nextInt();
    switch (opcion12) {
        case 1:
            int jugadoresfin=0;
            System.out.println("USTED HA SELECCIONADO JUGADORES");
                System.out.println("Ingese el no de jugadores a participar");
                int nojugadores = entrada.nextInt();
            while (jugadoresfin<1){
                
                if (dificultad==1  | dificultad==2){
                    if(2<=nojugadores && nojugadores<=3) {
                        nonjugadores=nojugadores;
                        jugadoresfin=1; 
                    
                    }
                    else {
                System.out.println("USTED HA SELECCIONADO JUGADORES");
                System.out.println("EL NUMERO QUE INGRESÓ NO ESTÁ ENTRE LAS OPCIONES DEL RANGO ");
                System.out.println("Ingese el no de jugadores a participar");
                int nojugadores1 = entrada.nextInt();
                nojugadores=nojugadores1;
                
                    }
          
                }
                else {
                    System.out.println("La dificultad aun no ha sido elegida ");
                }
                  
            }
            
            for (int i=0; i<nonjugadores; i++){
             System.out.println("Ingese el simbolo del jugador"+(i+1));
             nombre[i]=entrada.next();
             
            }
            
            break;
            
            
        case 2:
            int subebajafin=0;
            System.out.println("USTED HA SELECCIONADO SUBIDAS Y BAJONES");
            System.out.println("Ingese el no de SUBIDAS que desea en el juego");
            int a = entrada.nextInt();
            System.out.println("Ingese el no de BAJADAS que desea en el juego");
            int b = entrada.nextInt();
            while (subebajafin<1){
            
            if (dificultad==1){
                if(5<=a && a<=10){
                    subidas=a;
                    subebajafin=1;
                    
                }
                else{
                System.out.println("USTED HA SELECCIONADO SUBIDAS Y BAJONES");
                System.out.println("EL NUMERO QUE INGRESÓ NO ESTÁ ENTRE LAS OPCIONES DEL RANGO ");
                System.out.println("Ingese el no. de SUBIDAS que desea en el juego");
                int nosubidas = entrada.nextInt();
                a=nosubidas;
                }
            }
                
            else {
                if (dificultad==2){
                    if(20<=a && a<=40){
                        subidas=a;
                    subebajafin=1;
                    }
                else{
                System.out.println("USTED HA SELECCIONADO SUBIDAS Y BAJONES");
                System.out.println("EL NUMERO QUE INGRESÓ NO ESTÁ ENTRE LAS OPCIONES DEL RANGO ");
                System.out.println("Ingese el no. de SUBIDAS que desea en el juego");
                int nosubidas = entrada.nextInt();
                a=nosubidas;
                }
                }
                else{
                 porgusto();    
                System.out.println("USTED NO HA DEFINIDO AUN LA DIFICULTAD");
                }
            }
            
            if (dificultad==1){
                if(5<=b && b<=10){
                    bajadas=b;
                    subebajafin=1;
                    
                }
                else{
                System.out.println("USTED HA SELECCIONADO SUBIDAS Y BAJONES");
                System.out.println("EL NUMERO QUE INGRESÓ NO ESTÁ ENTRE LAS OPCIONES DEL RANGO ");
                System.out.println("Ingese el no. de BAJADAS que desea en el juego");
                int nobajadas = entrada.nextInt();
                b=nobajadas;
                }
                
            }
                
            else {
                if (dificultad==2){
                    if(20<=b && b<=40){
                        bajadas=b;
                    subebajafin=1;
                    }
                     else{
                System.out.println("USTED HA SELECCIONADO SUBIDAS Y BAJONES");
                System.out.println("EL NUMERO QUE INGRESÓ NO ESTÁ ENTRE LAS OPCIONES DEL RANGO ");
                System.out.println("Ingese el no. de BAJADAS que desea en el juego");
                int nobajadas = entrada.nextInt();
                b=nobajadas;
                }
                }
                else{
                porgusto();    
                System.out.println("USTED NO HA DEFINIDO AUN LA DIFICULTAD");
                
                
                }
            }
            
            
            }
            
            
            
            
            break;
        case 3:
            finsubmenu=1;
            break;     
        
    }
        
    }
    
    
    public static void porgusto() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
                
    }
    
    
    
    
    
    
    }


    
     





    
