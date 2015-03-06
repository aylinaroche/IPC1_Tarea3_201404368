import java.util.Scanner;


public class Tarea3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un número");
	int x=0;
	
	Scanner s = new Scanner(System.in);
	x = s.nextInt();
	
		
		if(x%2==0)
			System.out.println("El número ingresado es PAR");
		else
			System.out.println("El número ingresado es IMPAR");
			
		

	}

}
