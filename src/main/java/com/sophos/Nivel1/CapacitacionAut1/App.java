package com.sophos.Nivel1.CapacitacionAut1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      int variable1 = 5 ;
      byte nombrebye = 0 ; // -126 y 127
      System.out.println(nombrebye);
      short variableshort = Short.MAX_VALUE;
      System.out.println(variableshort);
      int variableint = 43567895;
      System.out.println(variableint);
      float numero = (float) 5.555;
      System.out.println(numero);
      
      boolean variableverdad = true;
      System.out.println(variableverdad);	  
      char varibalechar = 'a';
    		  System.out.println(varibalechar);	 
    		  
    char [] arreglochar = {'D','a','y','a','n','a'};
    System.out.println("<><><><><><>\n");	
    for (int i = 0; i < arreglochar.length; i++)
    {
    	int x = (int) arreglochar[i]+1;
    	System.out.println(x);
    	System.out.println((char)x);
    	   	
    }
    		  
    if(5<3);{
    	System.out.println("5 si es mayor 3");
    
   
    
    		  
    		  
        
    }
    }
}
