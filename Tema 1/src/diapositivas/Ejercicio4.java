package diapositivas;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> comandos=new ArrayList<String>();
		//comandos.add("netstat");
		//listar lo que hay en ...... descargasss
		comandos.add("cmd" );
		comandos.add("/C ");
		//comandos.add("start");
		comandos.add("tasklist");
		//creo el objeto ProcessBuilder
		ProcessBuilder pBuilder= new ProcessBuilder(comandos);
		try {
			//File directorio=new File("C:/Users/mañana/Downloads");// lo que hay en este directorio7
			//File directorio=new File("C:/Users/Martin Jesus/Downloads");// lo que hay en este directorio
			//pBuilder.directory(directorio);
			Process proceso=pBuilder.start();
			BufferedReader in= new BufferedReader(
					new InputStreamReader(
							proceso.getInputStream()));
			String linea= null;
			while((linea= in.readLine())!=null){
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
