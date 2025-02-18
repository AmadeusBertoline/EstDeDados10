package controller;

public class ControllerImpar {

	public int Impar(int num) {

		if(num == 0) {
			
			return 1;
			
		}
		
		
		return num * Impar(num - 2);

	}

}
