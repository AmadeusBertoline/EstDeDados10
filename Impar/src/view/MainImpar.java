package view;
import controller.ControllerImpar;
import java.util.Scanner;

public class MainImpar {

	public static void main (String[] args) {
		
		ControllerImpar impar = new ControllerImpar();
		Scanner scanner = new Scanner(System.in);
		
		int res, num;
		
		System.out.println("Valor: ");
		num = scanner.nextInt();
		
		if(num % 2 != 0) {
			
			res = impar.Impar(num);
			
		}
		
	}
	
}
