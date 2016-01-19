package diapositivas;

import java.io.IOException;
import java.io.InputStream;

public class Ejercicio3Ping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] comandos=new String [4];//no la declaro dentro del if
		InputStream in=null;
		if(args.length>0){
			//inicializo cada posicion
			 comandos[0]="ping";
			 comandos[1]=args[0];
			 comandos[2]="-n";
			 comandos[3]="3";
		}
		else{
			System.out.println("Faltan argumentos");
			System.exit(1);
		}
		//creamos el objeto Runtime y process
		try {
			Process proceso= Runtime.getRuntime().exec(comandos);
			//recoger imputsteam que general el proceso
			 in =proceso.getInputStream();
			int c;//variable que lee los distintos bytes
			while((c=in.read())!= -1){
				System.out.print((char)c);
				
			}
			System.out.println("Proceso terminado con valor: "+proceso.exitValue());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
