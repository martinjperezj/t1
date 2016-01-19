package diapositivas;

import java.io.IOException;

public class DestroyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Process proceso= new ProcessBuilder("C:/Program Files (x86)/Geany/bin/Geany.exe").start();
			Process proceso= new ProcessBuilder("notepad.exe").start();
			/*System.out.println("Abriendo el notepad 10 segundos");
			Thread.sleep(10_000);//termina en 10s
			proceso.destroy();*/
			System.out.println("Abriendo el notepad....");
			proceso.waitFor();//acaba cuando cierro el notepad
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Acabado programa java");
		
		
	}
	

}
