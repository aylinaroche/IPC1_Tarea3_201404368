import java.util.Scanner;


public class Tarea3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un n�mero");
	int x=0;
	
	Scanner s = new Scanner(System.in);
	x = s.nextInt();
	
		
		if(x%2==0)
			System.out.println("El n�mero ingresado es PAR");
		else
			System.out.println("El n�mero ingresado es IMPAR");
			
		

	}

}
