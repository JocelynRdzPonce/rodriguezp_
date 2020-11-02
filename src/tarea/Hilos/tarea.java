package tarea.Hilos;

public class tarea {

	public static void main(String args[]) {
		
		Hilo trabajoHilo = new Hilo();
		
		 Thread hiloUno = new Thread(trabajoHilo);		
		 Thread hiloDos = new Thread(trabajoHilo);	
		 Thread hiloTres = new Thread(trabajoHilo);
		
		 
		 try {Thread.sleep(1000);}
		 catch(InterruptedException ex){ex.printStackTrace();}
		 
		hiloUno.setName("Hilo 1");
		hiloDos.setName("Hilo 2");
		hiloTres.setName("Hilo 3");
			 
	   	hiloUno.start();
		hiloDos.start();
		hiloTres.start(); 

		 System.out.println("FINALIZA EL PROCESO");
		 
	}
}

class Hilo implements Runnable{
	@Override
	public void run() {
		int i;
		for(i=0;i<4;i++)
		{
			
			String nombreHilo = Thread.currentThread().getName();
			System.out.println(i+1+"-"+" "+nombreHilo);
			
			 try {Thread.sleep(500);}
			 catch(InterruptedException ex){ex.printStackTrace();}
		}
		
		System.out.println("Finaliza el:"+" "+Thread.currentThread().getName());
		
	}
}

