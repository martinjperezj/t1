package diapositivas;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Pipe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> comandos1=new ArrayList<String>();
		//comandos.add("netstat");
		//listar lo que hay en ...... descargasss
		comandos1.add("cmd" );
		comandos1.add("/C ");
		comandos1.add("start");
		comandos1.add("dir");
		
		ProcessBuilder pBuilder1= new ProcessBuilder(comandos1);
		File directoio=new File ("C:/Users/mañana/Downloads");
		pBuilder1.directory(directoio);
		BufferedReader in1=null;
		try {
			Process proceso1=pBuilder1.start();
			in1= new BufferedReader(new InputStreamReader(proceso1.getInputStream()));
			String linea= null;
			
			while ((linea=in1.readLine())!=null ){
				System.out.println(linea);
				
			}		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
