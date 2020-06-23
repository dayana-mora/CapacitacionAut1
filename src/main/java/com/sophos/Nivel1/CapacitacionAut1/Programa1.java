package com.sophos.Nivel1.CapacitacionAut1;

import java.util.Scanner;

public class Programa1 {

	public static void main( String[] args )
    {
        System.out.println( "Determinar si una persona es mayor de edad!" );
    
        Scanner Dato = new Scanner(System.in);
        
        int edad;
        System.out.println( "Cual es tu edad" );
              
       edad = Dato.nextInt();
        
    	   if (edad>=18) {
    		   System.out.println( "Es Mayor de edad" );
    	   }
    	   
    	   else {
    		   
    		   System.out.println( "Es Menor de edad" );
    	   }
    		   
    	   
    
    }
	
	
	
	
			
}
