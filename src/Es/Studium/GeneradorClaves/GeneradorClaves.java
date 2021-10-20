package Es.Studium.GeneradorClaves;

import java.util.Scanner;

public class GeneradorClaves {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int longitud,x;
		String Clave;
		
		System.out.println("Indicar la longitud de la clave");
		longitud=teclado.nextInt();
		
		Clave="";
		for(int i=0; i<=longitud;i++) {
			 x=(int)(Math.random()*15 + 1);
			 switch (x) 
		        {
		            case 1:		                     
		            case 2:  		                     
		            case 3:  		                     
		            case 4:  		                     
		            case 5:  		                     
		            case 6:  		                    
		            case 7: 		                     
		            case 8:                      
		            case 9: Clave = Clave + i;
                    	break;
		            case 10: Clave = Clave + 'A';
                    	break;
		            case 11: Clave = Clave + 'B'; 
                    	break;                    
		            case 12:Clave = Clave + 'C';
                    	break;                    
		            case 13:Clave = Clave + 'D';
		            	break;                    
		            case 14:Clave = Clave + 'E';
                    	break;                    
		            case 15: Clave = Clave + 'F';
		            	break;                    
		            default: 
		                     break;
		        }
		} 
		System.out.println("La Clave solicitada es " + Clave);
		teclado.close();

	}

}


/*
PROGRAMA GeneradorClaves
VARIABLES
ENTERO longitud, i, x
CADENA clave
INICIO
ESCRIBIR “Indicar la longitud de la clave:”
LEER longitud
clave = ““
PARA i = 0 HASTA longitud HACER
x = ALEATORIO (0,15)
SEGUN x HACER
CASO 0: CASO 1: CASO 2: CASO 3: CASO 4: CASO 5: CASO 6: CASO
7: CASO 8: CASO 9:
clave = clave + i
CASO 10:
clave = clave + ‘A’
CASO 11:
clave = clave + ‘B’
CASO 12:
clave = clave + ‘C’
CASO 13:
clave = clave + ‘D’
CASO 14:
clave = clave + ‘E’
CASO 15:
clave = clave + ‘F’
FIN SEGUN
FIN PARA
ESCRIBIR “La clave solicitada es “ + clave
FIN*/
