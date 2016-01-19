package diapositivas;

import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creamos un objeto Runtime
		Runtime runtime = Runtime.getRuntime();
		
		//creamos un objeto de tipo Process
		try {
			//Process p= runtime.exec("notepad.exe");
			//Process p1= runtime.exec("C:/Program Files (x86)/Mozilla Firefox/firefox.exe http://marca.es");
			Process p2= runtime.exec("cmd /C start dir");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*//se queda durmiendo 20 segundos en memoria
		try {
			Thread.sleep(20_000);
			System.out.println("Programa principal durmiendo 20 segundos");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("fin del programa");

	}

}
