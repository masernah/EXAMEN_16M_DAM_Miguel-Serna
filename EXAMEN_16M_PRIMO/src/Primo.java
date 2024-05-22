import java.util.Scanner;

public class Primo {
	
	public static void main (String[]arg){
		System.out.println("Buenos días Ceinmark, soy Miguel Serna");
		
		  Scanner teclado = new Scanner(System.in);	
	        boolean primo=true;
	        int num;
	        String respuesta, s, S;	
	        do {
	            System.out.println ("Introduce número: ");
	            num = teclado.nextInt();
	            for(int i=1;i==num;i++){
	                if(num%i==0){
	                    primo=true;
	                }
	            }
	            if(primo==true){
	                System.out.println (num+" es primo");
	            }
	            else{
	                System.out.println (num+" no es primo");
	            }
	            System.out.println ("Quieres intoducir otro número? s/n: ");
	            respuesta=teclado.next();						
	        }while(respuesta.equals("s") || respuesta.equals("S"));
	    } 
	}
		
	


